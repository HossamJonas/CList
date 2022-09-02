package test;
import org.testng.annotations.Test;
import pages.helpPage;
public class helpTest extends TestBase {
	helpPage helpObj;

	@Test
	public void helpFuncl() 
	{			
		helpObj = new helpPage(driver);
		helpObj.opnHelp();
		helpObj.helpSend("isuue", "Captcha's still there");
		}
}


