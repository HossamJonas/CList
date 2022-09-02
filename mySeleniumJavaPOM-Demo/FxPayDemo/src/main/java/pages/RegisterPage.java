package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends PageBase {

	public RegisterPage(WebDriver driver) 
	{ super(driver);	}
			
	@FindBy(id="country")					WebElement countryMenu;
	@FindBy(id="city")							WebElement citryMenu;
	@FindBy(id="companyName")		WebElement cmpny;
	@FindBy(id="salutation")				WebElement satuMenu;
	@FindBy(id="firstName")					WebElement frstNm;
	@FindBy(id="lastName")					WebElement lstNm;
	@FindBy(id="email")						WebElement emailFld;
	@FindBy(id="mobileNumber")		WebElement mobNo;
	@FindBy(id="role")							WebElement roleMenu;
	@FindBy(className="btn-secondary")		WebElement rgstrBtn;
//	@FindBy(className="result")		public WebElement rgstrDoneMsg;

	public void rgstrFunc(String cntry, String city, String co, String title,  String fn,String ln,String emaill, String phone, String role) 
	{
		wit();
		slctFunc(countryMenu,cntry);
		wit();
		slctFunc(citryMenu,city);
		typ(cmpny, co);
		slctFunc(satuMenu,title);	
		typ(frstNm, fn);
		typ(lstNm, ln);
		typ(emailFld, emaill);
		typ(mobNo, phone);
		slctFunc(roleMenu,role);			 wit();	
		clk(rgstrBtn);
	}
}
