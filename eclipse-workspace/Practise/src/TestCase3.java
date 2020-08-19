import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestCase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Bogdan\\Documents\\stefi\\Automation\\Selenium from Scratch\\internetexplorerdriver\\IEDriverServer_x64_3.150.1 (1)\\IEDriverServer.exe");
		WebDriver driver= new InternetExplorerDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		//imprime Google en la consola, para asegurar que caímos en esa página
	}

}
