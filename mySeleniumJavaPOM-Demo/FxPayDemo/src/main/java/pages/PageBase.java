package pages;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

	public class PageBase {
	protected WebDriver driver;	
	public JavascriptExecutor jse;
	public Actions actns;
	static Select mySlct;	
	public String imgPath;
	
	public PageBase (WebDriver driver)
	{ PageFactory.initElements(driver, this); }
	
	protected static void clk (WebElement btn)
	{ btn.click();  }
	
	protected static void fldClr (WebElement fld)
	{ fld.clear();  }
	
	protected static void typ (WebElement txtBox, String txt)
	{ txtBox.sendKeys(txt);  }	
	
	protected static void sbmt (WebElement elmnt)
	{ elmnt.submit();  }
	
	protected static void slctFunc  (WebElement mnu, String optn)
	{  mySlct = new Select(mnu);
	mySlct.selectByVisibleText(optn);  }
	
	public void prnt(String txt) 
	{ System.out.println(txt);}
	
	protected static void wit( ) 
	{try {Thread.sleep(1500);} catch (InterruptedException e) {e.printStackTrace();}	}
			
	public void hvr(WebElement elmnt) 
	{	actns.moveToElement(elmnt).perform();}

	public void hvrClk(WebElement elmnt,WebElement elmnt2) 
	{	actns.moveToElement(elmnt).moveToElement(elmnt2).click().build().perform();}

	public void upldFunc(WebElement upldr,String imgName) { 
		String imgPath = System.getProperty("user.dir")+"\\Uploads\\"+imgName ;
		upldr.sendKeys(imgPath); }

	public void scrl() 
	{jse.executeScript("scrollBy(0,2500)"); }
}
