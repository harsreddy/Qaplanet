package WebDriverEx;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Orangehrmcreatelocation
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
				//to add location
				//---------------------------------------------------------------------
				//Create webelement for Admin
				WebElement objAdmin=Driver.findElement(By.id("admin"));
				Thread.sleep(1000);
				//Mouse over on Admin
				Act.moveToElement(objAdmin).perform();
				Thread.sleep(1000);
				//----------------------------------------------------------------------------
				//crerate web element
				WebElement objCompany=wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Company Info")));
				WebElement objJob=wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Job")));
				WebElement objQualification=wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Qualification")));
				WebElement objSkills=wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Skills")));
				//----------------------------------------------------------------------------
				//Verify company
				if(objCompany.isDisplayed())
				{
					System.out.println("Company Info is displayed");
				}
				Thread.sleep(1000);
				//Verify job
				if(objJob.isDisplayed())
				{
					System.out.println("Job is displayed");
				}
				Thread.sleep(1000);
				//Verify qualifications
				if(objQualification.isDisplayed())
				{
					System.out.println("Qualification is displayed");
				}
				Thread.sleep(1000);
				//Verify skills
				if(objSkills.isDisplayed())
				{
					System.out.println("Skills is displayed");
				}
				Thread.sleep(1000);
				//Mouse over on Company Info
				Act.moveToElement(objCompany).perform();
				Thread.sleep(1000);
				//---------------------------------------------------------------------------------------------------------------------
				//create web element
				WebElement objGeneral=wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("General")));
				WebElement objLocations=wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Locations")));
				WebElement objCompanyStructure=wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Company Structure")));
				WebElement objCompanyProperty=wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Company Property")));
				//---------------------------------------------------------------------------------------------------------------------
				//Verify General
				if(objGeneral.isDisplayed())
				{
					System.out.println("General is displayed");
				}
				Thread.sleep(1000);
				//Verify Locations
				if(objLocations.isDisplayed())
				{
					System.out.println("Locations is displayed");
				}
				Thread.sleep(1000);
				//Verify Company Structure
				if(objCompanyStructure.isDisplayed())
				{
					System.out.println("Company Structure is displayed");
				}
				Thread.sleep(1000);
				//Verify Company Property
				if(objCompanyProperty.isDisplayed())
				{
					System.out.println("Company Property is displayed");
				}
				Thread.sleep(1000);
				//Click on Locations
				Driver.findElement(By.linkText("Locations")).click();
				Thread.sleep(1000);
				//wait for frame and switch to it
				wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("rightMenu"));
				Thread.sleep(1000);
				//verify company info title
				if(Driver.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/h2")).getText().equals("Company Info : Locations"))
				{
					System.out.println("Company Info : Locations");
				}
				Thread.sleep(1000);
				//---------------------------------------------------------------------------------------------------------
				//create web element
				WebElement objSearchBy=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div[2]/form/div[2]/label[1]")));
				WebElement objSearchFor=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div[2]/form/div[2]/label[2]")));
				WebElement objSearch=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div[2]/form/div[2]/input[2]")));
				WebElement objReset=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div[2]/form/div[2]/input[3]")));
				WebElement objAdd=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div[2]/form/div[3]/div[1]/input[1]")));
				WebElement objDelete=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div[2]/form/div[3]/div[1]/input[2]")));
				//---------------------------------------------------------------------------------------------------------
				//Verify Search By
				if(objSearchBy.isDisplayed())
				{
					System.out.println("Search By: is displayed");
				}
				Thread.sleep(1000);
				//Verify Search For:
				if(objSearchFor.isDisplayed())
				{
					System.out.println("Search For: is displayed");
				}
				Thread.sleep(1000);
				//Verify Search
				if(objSearch.isDisplayed())
				{
					System.out.println("Search is displayed");
				}
				Thread.sleep(1000);
				//Verify Reset
				if(objReset.isDisplayed())
				{
					System.out.println("Reset is displayed");
				}
				Thread.sleep(1000);
				//Verify Add
				if(objAdd.isDisplayed())
				{
					System.out.println("Add is displayed");
				}
				Thread.sleep(1000);
				//Verify Delete
				if(objDelete.isDisplayed())
				{
					System.out.println("Delete is displayed");
				}
				Thread.sleep(1000);
				//to click on add
				Driver.findElement(By.xpath("//input[@value='Add']")).click();
				Thread.sleep(1000);
				//verify Company Info : Locations
				if(Driver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div/h2")).getText().equals("Company Info : Locations"))
				{
					System.out.println("Company Info : Locations");
				}
				Thread.sleep(1000);
				//---------------------------------------------------------------------------------------------------------
				//create web element
				WebElement objName=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='frmLocation']/label[1]")));
				WebElement objCountry=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='frmLocation']/label[2]")));
				WebElement objState=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='frmLocation']/label[3]")));
				WebElement objCity=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='frmLocation']/label[4]")));
				WebElement objAddress=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='frmLocation']/label[5]")));
				WebElement objZIPCode=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='frmLocation']/label[6]")));
				WebElement objPhone=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='frmLocation']/label[7]")));
				WebElement objFax=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='frmLocation']/label[8]")));
				WebElement objComments=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='frmLocation']/label[9]")));
				WebElement objSave1=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='editBtn']")));
				WebElement objReset1=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='frmLocation']/div[2]/input[2]")));
				//---------------------------------------------------------------------------------------------------------
				//Verify Name
				if(objName.isDisplayed())
				{
					System.out.println("Name is displayed");
				}
				Thread.sleep(1000);
				//Verify Country
				if(objCountry.isDisplayed())
				{
					System.out.println("Country is displayed");
				}
				Thread.sleep(1000);
				//Verify State / Province
				if(objState.isDisplayed())
				{
					System.out.println("State / Province is displayed");
				}
				Thread.sleep(1000);
				//Verify City
				if(objCity.isDisplayed())
				{
					System.out.println("City is displayed");
				}
				Thread.sleep(1000);
				//Verify Address
				if(objAddress.isDisplayed())
				{
					System.out.println("Address is displayed");
				}
				Thread.sleep(1000);
				//Verify ZIP Code
				if(objZIPCode.isDisplayed())
				{
					System.out.println("ZIP Code is displayed");
				}
				Thread.sleep(1000);
				//Verify Phone
				if(objPhone.isDisplayed())
				{
					System.out.println("Phone is displayed");
				}
				Thread.sleep(1000);
				//Verify Fax
				if(objFax.isDisplayed())
				{
					System.out.println("Fax is displayed");
				}
				Thread.sleep(1000);
				//Verify Comments
				if(objComments.isDisplayed())
				{
					System.out.println("Comments is displayed");
				}
				Thread.sleep(1000);
				//Verify Save
				if(objSave1.isDisplayed())
				{
					System.out.println("Save is displayed");
				}
				Thread.sleep(1000);
				//Verify Reset
				if(objReset1.isDisplayed())
				{
					System.out.println("Reset is displayed");
				}
				Thread.sleep(1000);
				//click on save
				objSave1.click();
				Thread.sleep(1000);
				//wait for alert displayed
				Alert A=wait.until(ExpectedConditions.alertIsPresent());
				//wait for 2 sec
				Thread.sleep(1000);
				//Verfiy Select at least one record to delete message
				if(A.getText().equals("Please correct the following\n\n	- Location Name has to be specified\n	- Country should be selected!\n	- Address should be specified\n	- Zip Code should be specified\n"))
				{
					System.out.println("Please correct the following\n\n	- Location Name has to be specified\n	- Country should be selected!\n	- Address should be specified\n	- Zip Code should be specified\n");
					A.accept();
					//wait for 2 sec
					Thread.sleep(1000);
				}
				Date dt=new Date();
				SimpleDateFormat da=new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");
				String d=da.format(dt);
				System.out.println(d);
				//to enter name
				String sName="Selenium" + d;
				Driver.findElement(By.name("txtLocDescription")).sendKeys(sName);
				//click on save
				objSave1.click();
				Thread.sleep(1000);
				//wait for alert displayed
				Alert A1=wait.until(ExpectedConditions.alertIsPresent());
				//wait for 2 sec
				Thread.sleep(1000);
				//Verfiy Select at least one record to delete message
				if(A1.getText().equals("Please correct the following\n\n	- Country should be selected!\n	- Address should be specified\n	- Zip Code should be specified\n"))
				{
					System.out.println("Please correct the following\n\n	- Country should be selected!\n	- Address should be specified\n	- Zip Code should be specified\n");
					A1.accept();
					//wait for 2 sec
					Thread.sleep(1000);
				}
				//to select country
				Select s=new Select(Driver.findElement(By.id("cmbCountry")));
				s.selectByValue("IN");
				//click on save
				objSave1.click();
				Thread.sleep(1000);
				//wait for alert displayed
				Alert A2=wait.until(ExpectedConditions.alertIsPresent());
				//wait for 2 sec
				Thread.sleep(1000);
				//Verfiy Select at least one record to delete message
				if(A2.getText().equals("Please correct the following\n\n	- Address should be specified\n	- Zip Code should be specified\n"))
				{
					System.out.println("Please correct the following\n\n	- Address should be specified\n	- Zip Code should be specified\n");
					A2.accept();
					//wait for 2 sec
					Thread.sleep(1000);
				}
				//to enter address
					String sAdd="Ameerpet";
					Driver.findElement(By.name("txtAddress")).sendKeys(sAdd);
					Thread.sleep(1000);
					//click on save
					objSave1.click();
					Thread.sleep(1000);
					//wait for alert displayed
					Alert A3=wait.until(ExpectedConditions.alertIsPresent());
					//wait for 2 sec
					Thread.sleep(1000);
					//Verfiy Select at least one record to delete message
					if(A3.getText().equals("Please correct the following\n\n	- Zip Code should be specified\n"))
					{
						System.out.println("Please correct the following\n\n	- Zip Code should be specified\n");
						A3.accept();
						//wait for 2 sec
						Thread.sleep(1000);
					}
					//enter zipcode
					String sZip="505203";
					Driver.findElement(By.id("txtZIP")).sendKeys(sZip);
					Thread.sleep(1000);
					//click on save
					objSave1.click();
					Thread.sleep(1000);
					//===================================================================================================
					//Get row count
					int rc=Driver.findElements(By.xpath("/html/body/div/div[2]/form/table/tbody/tr")).size();
					System.out.println(rc);
					int i;
					for(i=1;i<=rc;i++)
					{
						//Get third column data
						String strLocationName=Driver.findElement(By.xpath("//html/body/div/div[2]/form/table/tbody/tr["+i+"]/td[3]/a")).getText();
						if(strLocationName.equals(sName))
						{
							System.out.println("sName displayed at: "+i);
							Thread.sleep(1000);
							Driver.findElement(By.xpath("//html/body/div/div[2]/form/table/tbody/tr["+i+"]/td[3]/a")).click();
							break;
						}
					}
					//to edit location
					//to edit
					Driver.findElement(By.xpath("//input[@id='editBtn']")).click();
					Thread.sleep(1000);
					//-------------------------------------------------------------------
					//to enter city
					String sCity="Hyderabad";
					Driver.findElement(By.name("cmbDistrict")).sendKeys(sCity);
					Thread.sleep(1000);
					//Click on save
					Driver.findElement(By.xpath("//*[@id='editBtn']")).click();
					Thread.sleep(1000);
					//=============================================================================================================
					//to delete location
					Driver.findElement(By.xpath("/html/body/div/div[2]/form/div[4]/div[1]/input[2]")).click();
					Thread.sleep(1000);
					//wait for alert displayed
					Alert A4=wait.until(ExpectedConditions.alertIsPresent());
					//wait for 2 sec
					Thread.sleep(1000);
					//Verfiy Select at least one record to delete message
					if(A4.getText().equals("Select at least one record to delete"))
					{
						System.out.println("Select at least one record to delete");
						A4.accept();
						//wait for 2 sec
						Thread.sleep(1000);
					}
					//to check and delete the record
					Driver.findElement(By.xpath("/html/body/div/div[2]/form/table/tbody/tr["+i+"]/td[1]/input")).click();
					Driver.findElement(By.xpath("/html/body/div/div[2]/form/div[4]/div[1]/input[2]")).click();
					Thread.sleep(1000);
					//wait for alert displayed
					Alert A5=wait.until(ExpectedConditions.alertIsPresent());
					//wait for 2 sec
					Thread.sleep(1000);
					//Verfiy Select at least one record to delete message
					if(A5.getText().equals("Deletion might affect Company Hierarchy. If the Location has associations deletion may fail. Do you want to delete ?"))
					{
						System.out.println("Deletion might affect Company Hierarchy. If the Location has associations deletion may fail. Do you want to delete ?");
						A5.accept();
						//wait for 2 sec
						Thread.sleep(1000);
					}
					//=========================================================================
					//to delete multiple location
					//to check and delete the record
					int j;
					for(j=1;j<=4;j++)
					Driver.findElement(By.xpath("/html/body/div/div[2]/form/table/tbody/tr["+j+"]/td[1]/input")).click();
					Driver.findElement(By.xpath("/html/body/div/div[2]/form/div[4]/div[1]/input[2]")).click();
					Thread.sleep(1000);
					//wait for alert displayed
					Alert A6=wait.until(ExpectedConditions.alertIsPresent());
					//wait for 2 sec
					Thread.sleep(1000);
					//Verfiy Select at least one record to delete message
					if(A6.getText().equals("Deletion might affect Company Hierarchy. If the Location has associations deletion may fail. Do you want to delete ?"))
					{
						System.out.println("Deletion might affect Company Hierarchy. If the Location has associations deletion may fail. Do you want to delete ?");
						A6.accept();
						//wait for 2 sec
						Thread.sleep(1000);
					}
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
