import org.openqa.selenium.By;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;

public class practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System property for Gecko Driver
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\deepu\\libs\\Drivers\\geckodriver.exe");
		
		
		//intialize Gecko Driver using Desired capabilities
		FirefoxOptions options = new FirefoxOptions ();
		options.addArguments("disable-infobars");
		options.setAcceptInsecureCerts(true);
		options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);
		options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.demo.guru99.com/V4/");
		driver.findElement(By.name("uid")).sendKeys("mngr520114");
		driver.findElement(By.name("password")).sendKeys("EdAtady");
		driver.findElement(By.name("btnLogin")).click();
		
		//driver.close()
		;

	}

}
