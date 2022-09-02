package test;
import org.testng.annotations.Test;
import pages.loginPage;
public class loginTest extends TestBase {
	loginPage loginObj;
	static String userName= "hossamtestabc1@gmail.com";
	static String passWord= "Password.01 ";

	@Test
	public void loginSucssfl() 	{
		loginObj = new loginPage(driver);
		loginObj.loginFunc(userName, passWord);
				}
	}


