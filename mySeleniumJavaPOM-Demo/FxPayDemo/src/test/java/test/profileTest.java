package test;
import org.testng.annotations.Test;
import pages.ProfilePage;
public class profileTest extends TestBase {
	ProfilePage profileObj;

	@Test
	public void chngProfilel() 
	{			
		profileObj = new ProfilePage(driver);
		profileObj.opnProfile();
		profileObj.updateProfile("Passport", "01");
		}
}


