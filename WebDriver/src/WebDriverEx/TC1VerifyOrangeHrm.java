package WebDriverEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1VerifyOrangeHrm
{
	public static void main(String[] args)throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeDriver Driver=new ChromeDriver();
		//Maximize browser
		//Driver.manage().window().maximize();
		//----------------------------------------------------------
		//Open HRM web page
		Driver.get("http://apps.qaplanet.in/qahrm/login.php");
		//wait 2 sec
		Thread.sleep(2000);
		//Verify home page
		if(Driver.getTitle().equals("OrangeHRM - New Level of HR Management"))
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
		WebElement objUN=Driver.findElement(By.name("txtUserName"));
		WebElement objPWD=Driver.findElement(By.name("txtPassword"));
		WebElement objLogin=Driver.findElement(By.name("Submit"));
		WebElement objClear=Driver.findElement(By.name("clear"));
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
		//Verfiy login and clear
		if(objLogin.isDisplayed() && objClear.isDisplayed())
		{
			System.out.println("Login and clear buttons are displayed");
		}
		//-----------------------------------------------------------------------
		String strUN="qaplanet1";
		String strPWD="lab1";
		//-----------------------------------------------------------------------
		//Login to orangeHRM
		objUN.clear();
		objUN.sendKeys(strUN);
		objPWD.clear();
		objPWD.sendKeys(strPWD);
		objLogin.click();
		//wait 2 sec
		Thread.sleep(2000);
		//Verfiy OrangeHRM page
		if(Driver.getTitle().equals("OrangeHRM"))
		{
			System.out.println("OrangeHRM page displayed");
		}
		else
		{
			System.out.println("Failed to login");
			return;
		}
		//Get welcome text
		String welText=Driver.findElement(By.xpath("//ul[@id='option-menu']/li[1]")).getText();
		//Verify welcome text
		if(welText.equals("Welcome "+strUN))
		{
			System.out.println("Welcome "+strUN+" displayed");
		}
		//Create webelements for Change Password & logout
		WebElement objCP=Driver.findElement(By.linkText("Change Password"));
		WebElement objLogout=Driver.findElement(By.linkText("Logout"));
		//Verify Change Password & logout
		if(objCP.isDisplayed() && objLogout.isDisplayed())
		{
			System.out.println("Change Password & logout are displayed");
		}
		//----------------------------------------------------------------
		//Click on logout
		objLogout.click();
		//wait 2 sec
		Thread.sleep(2000);
		//Verify home page
		if(Driver.getTitle().equals("OrangeHRM - New Level of HR Management"))
		{
			System.out.println("Signoff sucessfull & Home page displayed");
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
