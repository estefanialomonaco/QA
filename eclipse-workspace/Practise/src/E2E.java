import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class E2E {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bogdan\\Documents\\stefi\\Automation\\Selenium from Scratch\\chromedriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://spicejet.com/");

		//Select from dynamic dropdown destination
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/form/div[@class='maincontainer']/div[@class='home']/div/div[@class='staticHomeContentFullpage position-relative']/div/div[@class='home_flight_search']/div/div[@class='book']/div/div/div[@class='row1']/div[@class='left1']/input[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		Thread.sleep(2000);

		//SELECT from dynamic dropdown Destination
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@text='Chennai (MAA)'][contains(text(),'Chennai (MAA)')]")).click();
		
		//SELECT Date
		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-active']")).click();

		//Check Returning Date Calendar box disable because only ONE WAY is selected
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
			
		{
			
			System.out.println("it'disabled");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);//que falle el test si está enabled porque es one way el ticket-
		}
			
			//SELECT Checkbox type of discount
			Thread.sleep(2000);
			driver.findElement(By.id("familyandfriend")).click();

			
			//Select nr of people
			driver.findElement(By.id("divpaxinfo")).click();

			driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
			 
			Select dropdownAdultos=new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']")));
			Thread.sleep(2000);
			dropdownAdultos.selectByValue("4");
			 
			 
			
		//select currency
			Thread.sleep(2000);
			Select dropdownMoneda=new Select(driver.findElement(By.xpath(".//*[@id=\'ctl00_mainContent_DropDownListCurrency']")));
			dropdownMoneda.selectByValue("USD");
			//Click on Search Button
			driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
			
			
		}
		
		
	}

