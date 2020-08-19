import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TableSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Bogdan\\Documents\\stefi\\Automation\\Selenium from Scratch\\chromedriver\\chromedriver_win32 (1)\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//conver list in descending order
		driver.findElement(By.cssSelector("table[id='sortableTable'] tr th:nth-child(2)")).click();
		
		//convert list in ascending order
		//driver.findElement(By.cssSelector("table[id='sortableTable'] tr th:nth-child(2)")).click();
		
		List <WebElement> firstColList=driver.findElements(By.cssSelector("table[id='sortableTable'] tbody tr td:nth-child(2)"));
		
		//create list
		ArrayList<String> originalList= new ArrayList<String>();

		
		
		for (int i=0;i<firstColList.size();i++ ) //option es la variable en donde se guarda
			
		{
			//add elements from column to a list created with add
			  originalList.add(firstColList.get(i).getText());
		}
			  
		
		//create same list, copy, but this time sort values
		ArrayList<String> copiedList= new ArrayList<String>();
		
		for (int i=0;i<originalList.size();i++ ) //option es la variable en donde se guarda
			
		{
			//add elements from column to a list created with add
			//no se pone get text, porque ya están los textos en la original list
			  copiedList.add(originalList.get(i));
			  //PRINT LIST

		}
		
		
		//separate origiinal List from List sorted
				System.out.println("*****************************original List********************************************");
		//enhanced for loop- agarra elementos de lista original y pone en s
		for(String s:originalList) {
			
			//print elements sorted
			System.out.println(s);
			}
		
		
		//separate origiinal List from List sorted
		System.out.println("**********************************Copied List sorted****************************************");
		
		
		//how to sort list with collections in ASC
		Collections.sort(copiedList);
		
		//how to sort list with collections in DESC- because now we clicked to check functionality in DESC order
		Collections.reverse(copiedList);
		
		//enhanced for loop- agarra elementos de lista copiada y pone en s
		for(String s1:copiedList) {
			
			//print elements sorted
			System.out.println(s1);
		}
		
		//compare Lists
		//originalList.equals(copiedList);
		
		//test pass if true- if both lists are the same, if not true, test will fail
		//test fails because the original list is not in ascending order, meaning ours copied is in a sorted mode. 
		Assert.assertTrue(originalList.equals(copiedList));
		
		
		
		
	}

}

