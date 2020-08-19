import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLCertifications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Desired Capabilities- add customized to chrome browser GENERAL
		DesiredCapabilities ch=DesiredCapabilities.chrome();
		
		//acepta certificaciones
		//ch.acceptInsecureCerts();
		
		//another way to accept insecure cert
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		
		//accept secure cert
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		
		
		//LOCAL Chrome Browser like this now can handle insecure certs
		ChromeOptions c= new ChromeOptions();
		
		//permite mergear el chrome driver con la capability de aceptar certificates
		c.merge(ch);
		
		//Set properties
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Bogdan\\Documents\\stefi\\Automation\\Selenium from Scratch\\chromedriver\\chromedriver_win32 (1)\\chromedriver.exe");

		
		//instantiate
		WebDriver driver= new ChromeDriver(c);
		
		
		
	}

}
