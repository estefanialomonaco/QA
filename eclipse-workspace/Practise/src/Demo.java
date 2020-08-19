import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bogdan\\Documents\\stefi\\Automation\\Selenium from Scratch\\chromedriver\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			/*driver.get("http://facebook.com");//url in the browser
			//System.out.println(driver.getTitle());//page title checker //imprime Google en la consola, para asegurar que caímos en esa página
			
			//System.out.println(driver.getCurrentUrl());//validate if landed on correct url- 
			//System.out.println(driver.getPageSource());//print page source
			
			//driver.navigate().to("http://yahoo.com");
			//driver.navigate().back();
			//driver.navigate().forward();
			//driver.close();//close current browser
			// driver.quit();//closes all the browsers opened by selenium, si toco varios link, cierra todo, el close cierra el browser activo.
			
			driver.findElement(By.id("email")).sendKeys("estefanialomonaco@gmail.com");
			driver.findElement(By.name("pass")).sendKeys("poron9ga");
			
			driver.findElement(By.linkText("Forgot account?")).click();
			*/
			
			driver.get("https://login.salesforce.com/");
			//driver.findElement(By.id("username")).sendKeys("estefanialomonaco@gmail.com"); //search by id
			driver.findElement(By.cssSelector("#username")).sendKeys("estefania@gmail.com"); //search by css selector
			//driver.findElement(By.name("pw")).sendKeys("123456"); //search by name
			driver.findElement(By.cssSelector("#password")).sendKeys("123456"); //search by css selector
			//driver.findElement(By.className("button r4 wide primary")).click(); //search by class name-->error la clase compuesta, no se puede buscar
			driver.findElement(By.xpath("//*[@id=\'Login\']")).click(); //search by xpath
			//driver.findElement(By.xpath("//*[@id=\'forgot_password_link\']")).click();//forgot password login
			Thread.sleep(4000);
			System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());//busca el texto de error de login, y lo chequea, para ver si el error está ok. y lo imprime en mi consola			
			
			
			
			
		}

	}	

	




