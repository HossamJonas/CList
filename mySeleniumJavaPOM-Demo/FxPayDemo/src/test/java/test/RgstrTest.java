package test;
import org.testng.annotations.Test;
import pages.RegisterPage;

public class RgstrTest extends TestBase {
	RegisterPage rgstrObj;
	static String email= "hoooo1@gmail.com";
	static String phone= "501768501" ;

	@Test (priority=0)
	public void rgstrSucssfl() 
	{
		rgstrObj = new RegisterPage(driver);
		rgstrObj.rgstrFunc("Egypt", "Mansoura", "testCO", "Mr.", "hosam", "jonas", email, phone, "HR Manager"  );
		//Assert.assertTrue(rgstrObj.rgstrDoneMsg.getText() .contains("Your registration completed"));	
	}
}


