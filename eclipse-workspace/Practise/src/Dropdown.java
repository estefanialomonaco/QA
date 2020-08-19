


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Bogdan\\Documents\\stefi\\Automation\\Selenium from Scratch\\firefoxdriver\\geckodriver-v0.26.0-win64 (1)\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		
		//driver.get("http://spicejet.com/");// el codigo funciona con este mas actualizado
		
		/*
		Select dropdown=new Select(driver.findElement(By.xpath(".//*[@id=\'ctl00_mainContent_DropDownListCurrency']")));

		//dropdown.selectByIndex(2);
		Thread.sleep(2000);
		//dropdown.selectByVisibleText("AED");

		dropdown.selectByValue("AED");
		*/
		
	
		driver.get("http://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();

		   Thread.sleep(2000L);

		   /*int i=1;

		while(i<5)

		{

		driver.findElement(By.id("xxxxxxxxx")).click();//4 times

		i++;

		}*/
			
		
		   System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		   for(int i=1;i<5;i++)

		   {

		   driver.findElement(By.id("hrefIncAdt")).click();

		   }

		   driver.findElement(By.id("btnclosepaxoption")).click();

		   Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

		   //System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		  
	//Dynamic Dropdown	
		
	//  //a[@value='MAA']  - Xpath for chennai

	//  //a[@value='BLR']- for bangaluru

	/*
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//body/form/div[@class='maincontainer']/div[@class='home']/div/div[@class='staticHomeContentFullpage position-relative']/div/div[@class='home_flight_search']/div/div[@class='book']/div/div/div[@class='row1']/div[@class='left1']/input[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@value='BLR']")).click();

	Thread.sleep(2000);

	//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();//hardcodeado 2do lugar desde bangaluru
	
	driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@text='Chennai (MAA)'][contains(text(),'Chennai (MAA)')]")).click();

	driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
	*/
	
		//driver.get("http://spicejet.com"); //URL in the browser

		//  //a[@value='MAA']  - Xpath for chennai

		//  //a[@value='BLR']

		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

		driver.findElement(By.xpath("//a[@value='BLR']")).click();

		Thread.sleep(2000);

		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

		//driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

		
	
	
	
	
		
	
	//con la pagina de rauhl vieja
		
	
		
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());//si me da true, está mal y falla, porque no puede estar seleccionada
		
		//System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());//false en consola, bc not selected
		
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());//si da false, es que no está seleccionada. y tiene q estarlo, va a fallar. 
		//System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());//true en consola
		
		//count number of checkboxes
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
				
		
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("ind");
		Thread.sleep(3000);
		List <WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for (WebElement option:options) //option es la variable en donde se guarda 'India' y todos los que van iterando
			
		{
		
			if(option.getText().equalsIgnoreCase("India"))
					
					{
							option.click();
							
							break;
						}
			
		}
		
		
		
			
		
		
	}
}

		
