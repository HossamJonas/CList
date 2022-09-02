package test;
import java.util.HashMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class TestBase {
	public static WebDriver driver; 
	public static String downloadPath = System.getProperty("user.dir") + "\\Downloads";
	public static FirefoxOptions firefoxOption() {
	FirefoxOptions option = new FirefoxOptions(); option.addPreference("browser.download.folderList", 2); option.addPreference("browser.download.dir", downloadPath); option.addPreference("browser.helperApps.neverAsk.saveToDisk", "application/pdf"); option.addPreference("browser.download.manager.showWhenStarting", false); option.addPreference("pdfjs.disabled", true); return option;}
	public static ChromeOptions chromeOption() {
	ChromeOptions options = new ChromeOptions(); HashMap<String, Object> chromePrefs = new HashMap<String, Object>(); chromePrefs.put("profile.default.content_settings.popups", 0); chromePrefs.put("download.default_directory", downloadPath); options.setExperimentalOption("prefs", chromePrefs); options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true); return options; }
	
	@BeforeSuite
	@Parameters({"browser"})
	public void startDriver(@Optional ("firefox") String browserName) {
			if (browserName.equalsIgnoreCase("chrome")) 		    {String chromePath = System.getProperty("user.dir") + "\\Resources2\\chromedriver.exe" ;   System.setProperty("webdriver.chrome.driver",chromePath);  driver = new ChromeDriver(chromeOption()); 	}
  	 else if (browserName.equalsIgnoreCase("firefox")) 	{String frfxPath = System.getProperty("user.dir") + "\\Resources2\\geckodriver.exe" ;     System.setProperty("webdriver.gecko.driver",frfxPath);      driver = new FirefoxDriver(firefoxOption()); 	}
		
		driver.navigate().to("https://ststest.flexxpay.com/Account/Login?ReturnUrl=%2Fconnect%2Fauthorize%2Fcallback%3Fclient_id%3DB75C149F-96C9-4524-8507-A446792DEFB4%26redirect_uri%3Dhttps%253A%252F%252Femployeetest.flexxpay.com%252Fsignin-oidc%26response_type%3Dcode%26scope%3Dopenid%2520profile%2520email%2520employee_portal%2520flexxapi%26state%3Dc7fc2ad65f1243ad9ddaab62f5754802%26code_challenge%3DaQakeMHq4xc97fulyYXjCiJ7JpirFMeP6h29BebawkA%26code_challenge_method%3DS256%26response_mode%3Dquery%26login_hint%3Den_Employee");	
		//driver.navigate().to("https://employeetest.flexxpay.com/?");
		driver.manage().window().maximize();	
	}
		
	@AfterSuite
	public void closeDriver() throws InterruptedException 
		{ 	Thread.sleep(2000);
			//driver.quit(); 
			driver.manage().window().fullscreen(); }
}									
