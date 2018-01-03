package WebDriverEx;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Orangehrmedit
{
	public static void main(String[] args)throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeDriver Driver=new ChromeDriver();
		//Maximize browser
		Driver.manage().window().maximize();
		Thread.sleep(1000);
		//Explict wait object
		WebDriverWait wait=new WebDriverWait(Driver, 60);
		//----------------------------------------------------
		Actions Act=new Actions(Driver);
		//----------------------------------------------------------
		//Open HRM web page
		Driver.get("http://apps.qaplanet.in/qahrm/login.php");
		Thread.sleep(1000);
		//wait for home page
		if(wait.until(ExpectedConditions.titleIs("OrangeHRM - New Level of HR Management")))
		{
			System.out.println("Home page displayed");
		}
		else
		{
			System.out.println("Failed to open home page");
			return;
		}
		Thread.sleep(1000);
		//--------------------------------------------------------------------
		//Create web element
		WebElement objUN=wait.until(ExpectedConditions.presenceOfElementLocated(By.name("txtUserName")));
		WebElement objPWD=wait.until(ExpectedConditions.presenceOfElementLocated(By.name("txtPassword")));
		WebElement objLogin=wait.until(ExpectedConditions.presenceOfElementLocated(By.name("Submit")));
		WebElement objClear=wait.until(ExpectedConditions.presenceOfElementLocated(By.name("clear")));
		//------------------------------------------------------------------
		//Verify user name
		if(objUN.isDisplayed())
		{
			System.out.println("User name displayed");
		}
		Thread.sleep(1000);
		//Verify password
		if(objPWD.isDisplayed())
		{
			System.out.println("Password displayed");
		}
		Thread.sleep(1000);
		//Verify login and clear
		if(objLogin.isDisplayed() && objClear.isDisplayed())
		{
			System.out.println("Login and clear buttons are displayed");
		}
		Thread.sleep(1000);
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
		Thread.sleep(1000);
		//Wait for OrangeHRM page and verify
		if(wait.until(ExpectedConditions.titleIs("OrangeHRM")))
		{
			System.out.println("OrangeHRM page displayed");
		}
		else
		{
			System.out.println("Failed to login");
			return;
		}
		Thread.sleep(1000);
		//-----------------------------------------------------------------------------
		//Get welcome text
		String welText=Driver.findElement(By.xpath("//ul[@id='option-menu']/li[1]")).getText();
		Thread.sleep(1000);
		//Verify welcome text
		if(welText.equals("Welcome "+strUN))
		{
			System.out.println("Welcome "+strUN+" displayed");
		}
		Thread.sleep(1000);
		//-----------------------------------------------------------------------------
		//Create webelements for Change Password & logout
		WebElement objCP=Driver.findElement(By.linkText("Change Password"));
		WebElement objLogout=Driver.findElement(By.linkText("Logout"));
		Thread.sleep(1000);
		//Verify Change Password & logout
		if(objCP.isDisplayed() && objLogout.isDisplayed())
		{
			System.out.println("Change Password & logout are displayed");
		}
		Thread.sleep(1000);
		//----------------------------------------------------------------
		//Create webelement for PIM
		WebElement objPIM=Driver.findElement(By.id("pim"));
		Thread.sleep(1000);
		//Mouse over on PIM
		Act.moveToElement(objPIM).perform();
		Thread.sleep(1000);
		//========================================================================================================
		//Click on add mployee
		Driver.findElement(By.linkText("Add Employee")).click();
		Thread.sleep(1000);
		//wait for frame and switch to it
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("rightMenu"));
		Thread.sleep(1000);
		//Verify PIM : Add Employee
		if(Driver.findElement(By.xpath("//div[@class='mainHeading']/h2")).getText().equals("PIM : Add Employee"))
		{
			System.out.println("PIM : Add Employee displayed");
		}
		Thread.sleep(1000);
		//----------------------------------------------------------------------
		String sFN="Orange";
		String sLN="Hrm";
		//-----------------------------------------------------------------------
		//Get employee code
		String strEmpCode=Driver.findElement(By.name("txtEmployeeId")).getAttribute("value");
		Thread.sleep(1000);
		//Create webelement
		WebElement objSave=Driver.findElement(By.id("btnEdit"));
		Thread.sleep(1000);
		//Click on save
		objSave.click();
		Thread.sleep(1000);
		//wait for alert displayed
		Alert A=wait.until(ExpectedConditions.alertIsPresent());
		Thread.sleep(1000);
		//Verfiy Last Name Empty!message
		if(A.getText().equals("Last Name Empty!"))
		{
			System.out.println("Last Name Empty! displayed");
			A.accept();
			Thread.sleep(1000);
			//Enter last name
			Driver.findElement(By.name("txtEmpLastName")).sendKeys(sLN);
		}
		Thread.sleep(1000);
		//---------------------------------------------------------------------------
		
		//Click on save
		objSave.click();
		Thread.sleep(1000);
		//wait for alert displayed
		Alert A1=wait.until(ExpectedConditions.alertIsPresent());
		Thread.sleep(1000);
		//Verfiy First Name Empty!message
		if(A1.getText().equals("First Name Empty!"))
		{
			System.out.println("First Name Empty! displayed");
			A1.accept();
			Thread.sleep(1000);
			//Enter last name
			Driver.findElement(By.name("txtEmpFirstName")).sendKeys(sFN);
		}
		Thread.sleep(1000);
		//Click on save
		objSave.click();
		Thread.sleep(1000);
		//wait for Personal Details and verify
		if(wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@class='mainHeading']/h2"), "Personal Details")))
		{
			System.out.println("Personal Details displayed");
		}
		Thread.sleep(1000);
		//go to top frame
		Driver.switchTo().parentFrame();
		Thread.sleep(1000);
		//---------------------------------------------------------------------
		//Mouse over on PIM
		Act.moveToElement(objPIM).perform();
		Thread.sleep(1000);
		//Click on Employee List
		Driver.findElement(By.linkText("Employee List")).click();
		Thread.sleep(1000);
		//wait for frame and switch to it
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("rightMenu"));
		Thread.sleep(1000);
		//Verify Employee Information
		if(Driver.findElement(By.xpath("//div[@class='mainHeading']/h2")).getText().equals("Employee Information"))
		{
			System.out.println("Employee Information");
		}
		Thread.sleep(1000);
		//-----------------------------------------------------------------------------
		//Get row count
		int rc=Driver.findElements(By.xpath("//table[@class='data-table']/tbody/tr")).size();
		int i;
		for(i=1;i<=rc;i++)
		{
			//Get second column data
			String strEmpID=Driver.findElement(By.xpath("//table[@class='data-table']/tbody/tr["+i+"]/td[2]")).getText();
			Thread.sleep(1000);
			//Get third column data
			String strEmpName=Driver.findElement(By.xpath("//table[@class='data-table']/tbody/tr["+i+"]/td[3]/a")).getText();
			if(strEmpCode.equals(strEmpID) && strEmpName.equals(sFN+" "+sLN))
			{
				System.out.println(strEmpCode+" , "+strEmpName+" displayed at: "+i);
				Thread.sleep(1000);
				Driver.findElement(By.xpath("//table[@class='data-table']/tbody/tr["+i+"]/td[3]/a")).click();
				break;
			}
		}
		//==================================================================================================
		//to edit
				Driver.findElement(By.xpath("//*[@id='btnEditPers']")).click();
				Thread.sleep(1000);
				//to clear data
				Driver.findElement(By.name("txtEmpFirstName")).clear();
				Driver.findElement(By.name("txtEmpLastName")).clear();
				Thread.sleep(1000);
				//-------------------------------------------------------------------
				String sFN1="Management";
				String sLN1="Orange";
				//-------------------------------------------------------------------
				//to enter new values
				Driver.findElement(By.name("txtEmpFirstName")).sendKeys(sFN1);
				Driver.findElement(By.name("txtEmpLastName")).sendKeys(sLN1);
				Thread.sleep(1000);
				//Click on save
				Driver.findElement(By.xpath("//*[@id='btnEditPers']")).click();
				Thread.sleep(1000);
				//to go back
				Driver.findElement(By.xpath("/html/body/div[5]/input")).click();
				
				Thread.sleep(1000);
				//to verify
				int rc1=Driver.findElements(By.xpath("//table[@class='data-table']/tbody/tr")).size();
				System.out.println(rc1);
				int k;
				for(k=1;k<=rc1;k++)
				{
					//Get second column data
					String strEmpID1=Driver.findElement(By.xpath("//*[@id='standardView']/table/tbody/tr["+k+"]/td[2]")).getText();
					Thread.sleep(1000);
					//Get third column data
					String strEmpName1=Driver.findElement(By.xpath("//*[@id='standardView']/table/tbody/tr["+k+"]/td[3]/a")).getText();
					if(strEmpID1.equals(strEmpID1) && strEmpName1.equals(sFN1+" "+sLN1))
					{
						System.out.println(strEmpID1+" , "+strEmpName1+" displayed at: "+i);
						Thread.sleep(1000);
						
						
					break;
					}
				}
				//=========================================================================================
				//to delete employee
				Driver.findElement(By.xpath("//input[@value='Delete']")).click();
				Thread.sleep(1000);
				//wait for alert displayed
				Alert A2=wait.until(ExpectedConditions.alertIsPresent());
				//wait for 2 sec
				Thread.sleep(1000);
				//Verfiy Select at least one record to delete message
				if(A2.getText().equals("Select at least one record to delete"))
				{
					System.out.println("Select at least one record to delete");
					A2.accept();
					//wait for 2 sec
					Thread.sleep(1000);
				}
				//to check and delete the record
				Driver.findElement(By.xpath("//*[@id='standardView']/table/tbody/tr["+k+"]/td[1]/input")).click();
				Driver.findElement(By.xpath("//input[@value='Delete']")).click();
				Thread.sleep(1000);
		//Switch to default content
		Driver.switchTo().defaultContent();
		Thread.sleep(1000);
		//-------------------------------------------------------------------
		//=====================================================================================================
		
				//Switch to default content
				Driver.switchTo().defaultContent();
				Thread.sleep(2000);
				//to create web element
				WebElement objLogout1=Driver.findElement(By.linkText("Logout"));
		//Click on logout
		objLogout1.click();
		Thread.sleep(1000);
		//Verify home page
		if(wait.until(ExpectedConditions.titleIs("OrangeHRM - New Level of HR Management")))
		{
			System.out.println("Signoff sucessfull & Home page displayed");
		}
		else
		{
			System.out.println("Failed to Signoff");
			return;
		}
		Thread.sleep(1000);
		//-----------------------------------------------------------------------------
		Driver.close();
		Driver.quit();
	
	}
}

