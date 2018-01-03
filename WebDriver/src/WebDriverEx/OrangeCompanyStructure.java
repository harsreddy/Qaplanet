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



public class OrangeCompanyStructure
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
				//to add company structure
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
				//Click on Company Structure
				Driver.findElement(By.linkText("Company Structure")).click();
				Thread.sleep(1000);
				//wait for frame and switch to it
				wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("rightMenu"));
				Thread.sleep(1000);
				//verify Company Info : Company Structure title
				if(Driver.findElement(By.xpath("//*[@id='layerComStruct']/h2")).getText().equals("Company Info : Company Structure"))
				{
					System.out.println("Company Info : Company Structure is displayed");
				}
				Thread.sleep(1000);
				//-------------------------------------------------------------------------------------------------------
				WebElement objAdd=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='tblCompStruct']/tbody/tr[1]/td[2]/a")));
				//WebElement objDelete=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='tblCompStruct']/tbody/tr[2]/td[4]/a")));
				//---------------------------------------------------------------------------------------------------------
				//Verify Add
				if(objAdd.isDisplayed())
				{
					System.out.println("Add is displayed");
				}
				Thread.sleep(1000);
				/*//Verify Delete
				if(objDelete.isDisplayed())
				{
					System.out.println("Delete is displayed");
				}*/
				Thread.sleep(1000);
				//to click on add
				Driver.findElement(By.xpath("//*[@id='tblCompStruct']/tbody/tr[1]/td[2]/a")).click();
				Thread.sleep(1000);
				//verify Add a sub-division to QA Planet
				if(Driver.findElement(By.xpath("//*[@id='parnt']")).getText().equals("Add a sub-division to QA Planet"))
				{
					System.out.println("Add a sub-division to QA Planet");
				}
				Thread.sleep(1000);
				//---------------------------------------------------------------------------------------------------------
				//create web element
				WebElement objSave1=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='frmAddNode']/div/input[1]")));
				WebElement objReset1=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='frmAddNode']/div/input[2]")));
				WebElement objHide=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='frmAddNode']/div/input[3]")));
				//---------------------------------------------------------------------------------------------------------
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
				//Verify Hide
				if(objHide.isDisplayed())
				{
					System.out.println("Hide is displayed");
				}
				Thread.sleep(1000);
				Date dt=new Date();
				SimpleDateFormat da=new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");
				String d=da.format(dt);
				System.out.println(d);
				String id="1234"+d;
				Driver.findElement(By.name("txtDeptId")).sendKeys(id);
				Thread.sleep(1000);
				//click on save
				objSave1.click();
				Thread.sleep(1000);
				//wait for alert displayed
				Alert A=wait.until(ExpectedConditions.alertIsPresent());
				//wait for 2 sec
				Thread.sleep(1000);
				//Verfiy Select at least one record to delete message
				if(A.getText().equals("Following errors were found:\n\n- Sub-division Name cannot be empty.\n- Please select a Type or define a custom type.\n"))
				{
					System.out.println("Following errors were found:\n\n- Sub-division Name cannot be empty.\n- Please select a Type or define a custom type.\n");
					A.accept();
					//wait for 2 sec
					Thread.sleep(1000);
				}
				Date dt2=new Date();
				SimpleDateFormat da2=new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");
				String d2=da2.format(dt2);
				System.out.println(d2);
				//to enter name
				String sName="Selenium"+d2;
				Driver.findElement(By.name("txtTitle")).sendKeys(sName);
				//click on save
				objSave1.click();
				Thread.sleep(1000);
				//wait for alert displayed
				Alert A1=wait.until(ExpectedConditions.alertIsPresent());
				//wait for 2 sec
				Thread.sleep(1000);
				//Verfiy Select at least one record to delete message
				if(A1.getText().equals("Following errors were found:\n\n- Please select a Type or define a custom type.\n"))
				{
					System.out.println("Following errors were found:\n\n- Please select a Type or define a custom type.\n");
					A1.accept();
					//wait for 2 sec
					Thread.sleep(1000);
				}
				
				String v="Department";
				//to select Type
				Select s=new Select(Driver.findElement(By.id("cmbType")));
				s.selectByValue(v);
				Thread.sleep(1000);
				//to select  Location
				Select l=new Select(Driver.findElement(By.id("cmbLocation")));
				l.selectByValue("Other");
				Thread.sleep(1000);
				//click on save
				objSave1.click();
				Thread.sleep(1000);
				//wait for alert displayed
				Alert A2=wait.until(ExpectedConditions.alertIsPresent());
				//wait for 2 sec
				Thread.sleep(1000);
				//Verfiy Select at least one record to delete message
				if(A2.getText().equals("Following errors were found:\n\n- Please select a Location or define a new Location and select.\n"))
				{
					System.out.println("Following errors were found:\n\n- Please select a Location or define a new Location and select.\n");
					A2.accept();
					//wait for 2 sec
					Thread.sleep(1000);
				}
				//verify Define a new location
				if(Driver.findElement(By.xpath("//*[@id='layerFormLoc']/div/div[2]/div/h3")).getText().equals("Define a new location"))
				{
					System.out.println("Define a new location is displayed");
				}
				//---------------------------------------------------------------------------------------------------------
				//create web element
				WebElement objName=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='frmAddLoc']/label[1]")));
				WebElement objCountry=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='frmAddLoc']/label[2]")));
				WebElement objState=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='frmAddLoc']/label[3]")));
				WebElement objCity=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='frmAddLoc']/label[5]")));
				WebElement objAddress=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='frmAddLoc']/label[4]")));
				WebElement objZIPCode=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='frmAddLoc']/label[6]")));
				WebElement objPhone=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='frmAddLoc']/label[7]")));
				WebElement objFax=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='frmAddLoc']/label[8]")));
				WebElement objComments=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='frmAddLoc']/label[9]")));
				WebElement objSave2=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='frmAddLoc']/div[2]/input[1]")));
				WebElement objReset2=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='frmAddLoc']/div[2]/input[2]")));
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
				if(objSave2.isDisplayed())
				{
					System.out.println("Save is displayed");
				}
				Thread.sleep(1000);
				//Verify Reset
				if(objReset2.isDisplayed())
				{
					System.out.println("Reset is displayed");
				}
				Thread.sleep(1000);
				//click on save
				objSave2.click();
				Thread.sleep(1000);
				//wait for alert displayed
				Alert A3=wait.until(ExpectedConditions.alertIsPresent());
				//wait for 2 sec
				Thread.sleep(1000);
				//Verfiy Select at least one record to delete message
				if(A3.getText().equals("Location Name empty!"))
				{
					System.out.println("Location Name empty!");
					A3.accept();
					//wait for 2 sec
					Thread.sleep(1000);
				}
				Date dt1=new Date();
				SimpleDateFormat da1=new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");
				String d1=da1.format(dt1);
				System.out.println(d1);
				//to enter name
				String lName="Hyderabad" + d1;
				Driver.findElement(By.name("txtLocDescription")).sendKeys(lName);
				//click on save
				objSave2.click();
				Thread.sleep(1000);
				//wait for alert displayed
				Alert A4=wait.until(ExpectedConditions.alertIsPresent());
				//wait for 2 sec
				Thread.sleep(1000);
				//Verfiy Select at least one record to delete message
				if(A4.getText().equals("Country not selected!"))
				{
					System.out.println("Country not selected!");
					A4.accept();
					//wait for 2 sec
					Thread.sleep(1000);
				}
				//to select country
				Select c=new Select(Driver.findElement(By.id("cmbCountry")));
				c.selectByValue("IN");
				//click on save
				objSave2.click();
				Thread.sleep(1000);
				//wait for alert displayed
				Alert A5=wait.until(ExpectedConditions.alertIsPresent());
				//wait for 2 sec
				Thread.sleep(1000);
				//Verfiy Select at least one record to delete message
				if(A5.getText().equals("Address empty!"))
				{
					System.out.println("Address empty!");
					A5.accept();
					//wait for 2 sec
					Thread.sleep(1000);
				}
				//to enter address
					String sAdd="Ameerpet";
					Driver.findElement(By.name("txtAddress")).sendKeys(sAdd);
					Thread.sleep(1000);
					//click on save
					objSave2.click();
					Thread.sleep(1000);
					//wait for alert displayed
					Alert A6=wait.until(ExpectedConditions.alertIsPresent());
					//wait for 2 sec
					Thread.sleep(1000);
					//Verfiy Select at least one record to delete message
					if(A6.getText().equals("Zip - Code Cannot be empty!"))
					{
						System.out.println("Zip - Code Cannot be empty!");
						A6.accept();
						//wait for 2 sec
						Thread.sleep(1000);
					}
					//enter zipcode
					String sZip="505203";
					Driver.findElement(By.id("txtZIP")).sendKeys(sZip);
					Thread.sleep(1000);
					//click on save
					objSave2.click();
					Thread.sleep(1000);
				String desc="Hello Here You Find Description Box";
				Driver.findElement(By.name("txtDesc")).sendKeys(desc);
				Thread.sleep(1000);
				//click on save
				objSave1.click();
				Thread.sleep(1000);
				//===================================================================================================
				//wait for frame and switch to it
				//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("rightMenu"));
				Thread.sleep(1000);
				//Get count
				int rc=Driver.findElements(By.xpath("//html/body/div[1]/table/tbody/tr")).size();
				System.out.println(rc);
				int i;
				for(i=1;i<=rc;i++)
				{
					//Get data
					String strName=Driver.findElement(By.xpath("//html/body/div[1]/table/tbody/tr["+i+"]/td[1]")).getText();	
					System.out.println(strName); 
					if(strName.equals(id+" "+sName+" "+v))
					{
						System.out.println("strName displayed at: "+i);
						Thread.sleep(1000);
						Driver.findElement(By.xpath("//html/body/div[1]/table/tbody/tr["+i+"]/td[1]/a")).click();
						break;
					}
				}
				Thread.sleep(1000);
					//to edit company structure
					//-------------------------------------------------------------------
					//to enter name
					Driver.findElement(By.name("txtTitle")).clear();
					Thread.sleep(1000);
					String sName1="Manual" + d;
					Driver.findElement(By.name("txtTitle")).sendKeys(sName1);
					Thread.sleep(1000);
					//click on save
					WebElement objSave=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='frmAddNode']/div/input[1]")));
					objSave.click();
					Thread.sleep(1000);
					//=============================================================================================================
					//Get count
					int rc1=Driver.findElements(By.xpath("//html/body/div[1]/table/tbody/tr")).size();
					System.out.println(rc);
					int j;
					for(j=1;j<=rc1;j++)
					{
						//Get data
						String strName1=Driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr["+j+"]/td[1]")).getText();	
						System.out.println(strName1); 
						if(strName1.equals(id+" "+sName1+" "+v))
						{
							System.out.println("strName displayed at: "+j);
							Thread.sleep(1000);
							break;
						}
					}
					Thread.sleep(1000);
					//to delete company structure
					Driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr["+j+"]/td[4]/a")).click();
					Thread.sleep(1000);
					//wait for alert displayed
					Alert A7=wait.until(ExpectedConditions.alertIsPresent());
					//wait for 2 sec
					Thread.sleep(1000);
					System.out.println(A7.getText());
					//Verfiy Select at least one record to delete message
					if(A7.getText().equals("Are you sure you want to delete "+sName1+" "+v+"  It could cause the company structure to change."))
					{
						System.out.println("Are you sure you want to delete "+sName1+" "+v+"  It could cause the company structure to change.");
						
						//wait for 2 sec
						Thread.sleep(2000);
					}
					
					A7.accept();
					Thread.sleep(2000);
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
