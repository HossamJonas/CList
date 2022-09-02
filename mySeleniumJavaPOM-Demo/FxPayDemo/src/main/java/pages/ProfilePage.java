package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends PageBase {

	public ProfilePage(WebDriver driver) 
	{ super(driver);	}
	
	@FindBy(id="dropdownBasic3")	 WebElement userDropdown;
	@FindBy(linkText="My Profile")	 WebElement profileLink;

	public void opnProfile() 
{ 		wit();wit();wit();
		clk(userDropdown);  wit();
		clk(profileLink);
}
	
	@FindBy(id="identityDocumnetTypeId")	  WebElement idTypeMenu;
	@FindBy(id="idNumber")						  WebElement idNo;
	@FindBy(className="btn-primary")		  WebElement submit;
	@FindBy(css="button.btn:nth-child(2)")		  WebElement confrim;

		public void updateProfile(String idType, String idNum) 
{
		wit();
		typ(idNo,idNum);
		slctFunc(idTypeMenu, idType)	;wit();
		clk(submit);  wit();
		clk(confrim); 
}	
	}