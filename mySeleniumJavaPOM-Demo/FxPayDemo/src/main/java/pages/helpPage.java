package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class helpPage extends PageBase {

	public helpPage(WebDriver driver) 
	{ super(driver);	}
	
	@FindBy(id="dropdownBasic3")	 WebElement userDropdown;
	@FindBy(linkText="Help")	 WebElement HelpLink;

	public void opnHelp() 
{ 		wit();wit();wit();wit();wit();wit();
		clk(userDropdown);  wit();
		clk(HelpLink);
}
	
	@FindBy(id="messageSubject")	 					 WebElement msgSubj;
	@FindBy(id="messageContent")						  WebElement msgCont;
	@FindBy(className="btn-primary")				  WebElement submit;

		public void helpSend(String msgSubject, String msgContent) 
{
		wit();
		typ(msgSubj,msgSubject);
		typ(msgCont,msgContent); wit();
		clk(submit); 
}
	}