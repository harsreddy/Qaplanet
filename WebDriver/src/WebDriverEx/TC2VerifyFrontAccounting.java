package WebDriverEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2VerifyFrontAccounting
{
	public static void main(String[] args)throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeDriver Driver=new ChromeDriver();
		//Maximize browser
		//Driver.manage().window().maximize();
		//----------------------------------------------------------
		//Open Front Accounting web page
		Driver.get("http://apps.qaplanet.in/erp/");
		//wait 2 sec
		Thread.sleep(2000);
		//Verify home page
		if(Driver.getTitle().equals("FrontAccounting 2.4.2 - Login"))
		{
			System.out.println("Home page displayed");
		}
		else
		{
			System.out.println("Failed to open home page");
			return;
		}
		//--------------------------------------------------------------------
		//Create web element
		WebElement objUN=Driver.findElement(By.name("user_name_entry_field"));
		WebElement objPWD=Driver.findElement(By.name("password"));
		WebElement objLogin=Driver.findElement(By.name("SubmitUser"));
		//------------------------------------------------------------------
		//Verify usre name
		if(objUN.isDisplayed())
		{
			System.out.println("User name displayed");
		}
		//Verify password
		if(objPWD.isDisplayed())
		{
			System.out.println("Password displayed");
		}
		//Verfiy login displayed
		if(objLogin.isDisplayed())
		{
			System.out.println("Login button displayed");
		}
		//-----------------------------------------------------------------------
		String strUN="qaplanet1";
		String strPWD="lab1";
		//-----------------------------------------------------------------------
		//Login to Front Accounting
		objUN.clear();
		objUN.sendKeys(strUN);
		objPWD.clear();
		objPWD.sendKeys(strPWD);
		objLogin.click();
		//wait 2 sec
		Thread.sleep(2000);
		//Verfiy Main menu page
		if(Driver.getTitle().equals("Main Menu"))
		{
			System.out.println("Front Accounting page displayed");
		}
		else
		{
			System.out.println("Failed to login");
			return;
		}
		//Create webelements for Sales & Purchase
		WebElement objSales=Driver.findElement(By.linkText("Sales"));
		WebElement objPurchase=Driver.findElement(By.linkText("Purchases"));
		//Verify Sales & Purchase
		if(objSales.isDisplayed() && objPurchase.isDisplayed())
		{
			System.out.println("Sales & Purchase are displayed");
		}
		Thread.sleep(2000);
		//----------------------------------------------------------------
		//Create webelement for logout
		WebElement objLogout=Driver.findElement(By.xpath("//html/body/table[1]/tbody/tr/td/table[1]/tbody/tr/td/table/tbody/tr/td/table[2]/tbody/tr[1]/td[3]/a[5]"));
		//Verify logout
				if(objLogout.isDisplayed())
				{
					System.out.println("logout is displayed");
				}
		//Click on logout
		 objLogout.click();
		//wait 2 sec
		Thread.sleep(2000);
		Driver.findElement(By.linkText("Click here to Login Again.")).click();
		
		//Verify home page
		if(Driver.getTitle().equals("FrontAccounting 2.4.2 - Login"))
		{
			System.out.println("Home page displayed");
		}
		else
		{
			System.out.println("Failed to Signoff");
			return;
		}		
		//-----------------------------------------------------------------------------
		Driver.close();
		Driver.quit();
	}
}
