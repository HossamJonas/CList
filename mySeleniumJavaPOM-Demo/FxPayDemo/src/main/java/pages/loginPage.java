package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage extends PageBase {

	public loginPage(WebDriver driver) 
	{ super(driver);	}
	
	@FindBy(id="Username")						WebElement uName;
	@FindBy(id="Password")						WebElement pWord;
	@FindBy(id="#signInBtn")		WebElement loginBtn;
	
	public void loginFunc(String userName, String passWord) 
	{
		wit(); 
		typ(uName, userName);
		typ(pWord, passWord);
		clk(loginBtn);
	
	}
}
