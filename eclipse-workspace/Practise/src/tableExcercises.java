import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableExcercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Bogdan\\Documents\\stefi\\Automation\\Selenium from Scratch\\chromedriver\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/29074/eng-vs-pak-1st-test-pakistan-tour-of-england-2020");
		

		

		// find common css- design in the table is similar
		// div.cb-col.cb-col-8.text-right.text-bold

		// total table css- in entire page
		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));

		// checking in only one part of the table, instead of all- row count
		int row_count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();

		// inside row- find my column list
		int col_count = table
				.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();

		for (int i = 0; i < col_count-2; i++) {
			
					String value=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)"))
							.get(i).getText();
					
					//convert string value to int
					int valueinteger=Integer.parseInt(value);
					sum=sum+valueinteger;//suma primer valor, lo guarda en sum, luego a ese valor se le suma el que sigue en el loop
										//y así, va guardando nw
			
					}
		
		//print total column results
		//System.out.println(sum);
		
		//get the result of the extras column- from column extras, to column result-child
		String extras=driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		
		//pass string to int
		int extraValueInteger=Integer.parseInt(extras);
		
		//sum--> results in column + extra		
		int totalSumValue=sum+ extraValueInteger;
		
		//print results in column+extra
		System.out.println(totalSumValue);
		
		//get the result of total column, from total to column result child
		String actualTotal=driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		
		
		//convert actual total to int
		int actualTotalValue=Integer.parseInt(actualTotal);
		
		if(actualTotalValue==totalSumValue) {
			
			System.out.println("Count matches");
		}
		else {
			System.out.println("Count fails");
		}
		
		driver.close();
		
		
	}
}
