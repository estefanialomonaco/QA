import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Bogdan\\Documents\\stefi\\Automation\\Selenium from Scratch\\chromedriver\\chromedriver_win32 (1)\\chromedriver.exe");


	    WebDriver driver = new ChromeDriver();

	    driver.get("https://rahulshettyacademy.com/AutomationPractice");
	    
	 // total table css- in entire page
		WebElement table = driver.findElement(By.cssSelector("table[class='table-display']"));

	    
		// checking in only one part of the table, instead of all- row count
		int row_count = table.findElements(By.cssSelector("table[class='table-display'] tr")).size();
	    
		//print row count
		System.out.println(row_count);
		
		// row count without header
		int col_without_header=table.findElements(By.cssSelector("[class='table-display'] tr th")).size();
	    
		//print col count without header
		System.out.println(col_without_header);

		
		for (int i = 0; i < col_without_header; i++) {
			
			String value=table.findElements(By.cssSelector("[class='table-display'] tr")).get(i).getText();
			
			if(i==2) {
			System.out.println(value);
			//sum=sum+valueinteger;//suma primer valor, lo guarda en sum, luego a ese valor se le suma el que sigue en el loop
			break;					//y así, va guardando nw
	
			}
		
		
	}

}
	}
