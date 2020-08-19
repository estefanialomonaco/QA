import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ecommerce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Bogdan\\Documents\\stefi\\Automation\\Selenium from Scratch\\chromedriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		//espera para que ponga el código y lo escriba, en todos los elementos lo va a hacer. 
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//explicit wait global
		//Explicit Wait- espera específica para la funcionalidad de buscar texto, después de cupón applied
		WebDriverWait w= new WebDriverWait(driver,5);

		
		// esto es para que loopee desde 0, y cuado llega al nro 2, significa que ya
		// pasó 3 veces
		// y busca los 3 elementos de la lista
		

		// asi se declara array-una lista de cosas
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot", "Carrot" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		Thread.sleep(3000);
		
		//Al ser estático el método, no hace falta instanciar la clase Ecommerce, y crear objeto y llamar al método. se llama solo.
		addItems(driver, itemsNeeded);
		
		//click en carrito
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		
		
		
		//click en checkout
		driver.findElement(By.xpath("//div[@class='cart-preview active']/div[2]/button")).click();
		
		//espera específica para cambiar a pagina, luego de checkout
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		
		//escribo cupón
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		
		//cliqueo aplicar cupón
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		
		//espera específica, para que aparezca texto de cupón aplicado
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		
		//reviso que esté aplicado el descuento
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

		
	}

	public static void addItems(WebDriver driver, String[] itemsNeeded) {
		
		//variable para poder loopear en el if, y que se guarde en la variable el nro de iteración
		int j = 0;
		
		// esto es una lista de elementos con ese css loctor
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		// por cada iteración, comenzando en cero, cuando la variable i es menor que la
		// cantidad de elementos en productos, va a iterar (ej: 30 veces, si 30
		// elementos)
		for (int i = 0; i < products.size(); i++)

		{
			// declara variable name, obtiene un producto de la lista, y su texto.
			// format name porque Cucumber - 1kg, no está en la lista, en la lista está
			// Cucumber sólo. Hay que TRIM (Separa Cucumber de 1kg)
			// al partirlo en 2, tengo dos elementos, tengo un array
			String[] name = products.get(i).getText().split("-");

			// ahora name[0] es Brocoli, y después hay espacios y 1kg. Hay que borrar
			// espacios en [0].
			// Esto es para compararlo después, si está en nuestra lista itemsNeededList
			// (están los nombres)
			// sin - 1kg
			String formattedName = name[0].trim();

			// check if name is in array or not
			// convert array into array list for easy search

			List itemsNeededList = Arrays.asList(itemsNeeded);

			if (itemsNeededList.contains(formattedName))

			{

				j++;
				driver.findElements(By.xpath("//div[@class='product-action'] /button")).get(i).click();
				// break no se puede usar con lista

				if (j == itemsNeeded.length) {
					break;
				}
			}

		}

	}
}
