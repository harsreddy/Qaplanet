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



public class orangehrmaddjobtitle
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
				//to add job title
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
				//Mouse over on Job
				Act.moveToElement(objJob).perform();
				Thread.sleep(1000);
				//---------------------------------------------------------------------------------------------------------------------
				//create web element
				WebElement objJobTitles=wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Job Titles")));
				WebElement objJobSpecifications=wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Job Specifications")));
				WebElement objPayGrades=wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Pay Grades")));
				WebElement objEmploymentStatus=wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Employment Status")));
				//---------------------------------------------------------------------------------------------------------------------
				//Verify JobTitles
				if(objJobTitles.isDisplayed())
				{
					System.out.println("Job Titles is displayed");
				}
				Thread.sleep(1000);
				//Verify Job Specifications
				if(objJobSpecifications.isDisplayed())
				{
					System.out.println("Job Specifications is displayed");
				}
				Thread.sleep(1000);
				//Verify Pay Grades
				if(objPayGrades.isDisplayed())
				{
					System.out.println("Pay Grades is displayed");
				}
				Thread.sleep(1000);
				//Verify Employment Status
				if(objEmploymentStatus.isDisplayed())
				{
					System.out.println("Employment Status is displayed");
				}
				Thread.sleep(1000);
				//Click on JobTitles
				Driver.findElement(By.linkText("Job Titles")).click();
				Thread.sleep(1000);
				//wait for frame and switch to it
				wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("rightMenu"));
				Thread.sleep(1000);
				//verify Job : Job Title
				if(Driver.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/h2")).getText().equals("Job : Job Title"))
				{
					System.out.println("Job : Job Title");
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
				//verify Job : Job Title
				if(Driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/h2")).getText().equals("Job : Job Title"))
				{
					System.out.println("Job : Job Title");
				}
				Thread.sleep(1000);
				//---------------------------------------------------------------------------------------------------------
				//create web element
				WebElement objJobTitleName=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='frmJobTitle']/label[1]")));
				WebElement objJobDescription=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='frmJobTitle']/label[2]")));
				WebElement objJobTitleComments=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='frmJobTitle']/label[3]")));
				WebElement objJobSpecification=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='frmJobTitle']/label[4]")));
				WebElement objPayGrade=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='frmJobTitle']/label[5]")));
				WebElement objAddPayGrade=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='frmJobTitle']/div[1]/input[1]")));
				WebElement objEditPayGrade=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='frmJobTitle']/div[1]/input[2]")));
				WebElement objSave=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='frmJobTitle']/div[2]/input[1]")));
				WebElement objReset1=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='frmJobTitle']/div[2]/input[2]")));
				//---------------------------------------------------------------------------------------------------------
				//Verify Job Title Name
				if(objJobTitleName.isDisplayed())
				{
					System.out.println("Job Title Name is displayed");
				}
				Thread.sleep(1000);
				//Verify Job Description
				if(objJobDescription.isDisplayed())
				{
					System.out.println("Job Description is displayed");
				}
				Thread.sleep(1000);
				//Verify Job Title Comments
				if(objJobTitleComments.isDisplayed())
				{
					System.out.println("Job Title Comments is displayed");
				}
				Thread.sleep(1000);
				//Verify Job Specification
				if(objJobSpecification.isDisplayed())
				{
					System.out.println("Job Specification is displayed");
				}
				Thread.sleep(1000);
				//Verify Pay Grade
				if(objPayGrade.isDisplayed())
				{
					System.out.println("Pay Grade is displayed");
				}
				Thread.sleep(1000);
				//Verify Add Pay Grade
				if(objAddPayGrade.isDisplayed())
				{
					System.out.println("Add Pay Grade is displayed");
				}
				Thread.sleep(1000);
				//Verify Edit Pay Grade
				if(objEditPayGrade.isDisplayed())
				{
					System.out.println("Edit Pay Grade is displayed");
				}
				Thread.sleep(1000);
				//Verify Save
				if(objSave.isDisplayed())
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
				objSave.click();
				Thread.sleep(1000);
				//wait for alert displayed
				Alert A=wait.until(ExpectedConditions.alertIsPresent());
				//wait for 1 sec
				Thread.sleep(1000);
				//Verfiy Select at least one record to delete message
				if(A.getText().equals("Job Title Name should be specified"))
				{
					System.out.println("Job Title Name should be specified");
					A.accept();
					//wait for 1 sec
					Thread.sleep(1000);
				}
				Date dt=new Date();
				SimpleDateFormat da=new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");
				String d=da.format(dt);
				System.out.println(d);
				//to enter name
				String sName="Manager" + d;
				Driver.findElement(By.name("txtJobTitleName")).sendKeys(sName);
				//click on save
				objSave.click();
				Thread.sleep(1000);
				//wait for alert displayed
				Alert A1=wait.until(ExpectedConditions.alertIsPresent());
				//wait for 1 sec
				Thread.sleep(1000);
				//Verfiy Select at least one record to delete message
				if(A1.getText().equals("Job Description should be specified"))
				{
					System.out.println("Job Description should be specified");
					A1.accept();
					//wait for 1 sec
					Thread.sleep(1000);
				}
				//to enter Job Description
				String sJobDescription="Working as a manager";
				Driver.findElement(By.name("txtJobTitleDesc")).sendKeys(sJobDescription);
				Thread.sleep(1000);
				//click on save
				objSave.click();
				Thread.sleep(1000);
				//create web element
				WebElement objEmploymentStatus1=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='frmJobTitle']/label[7]")));
				//Verify Employment Status
				if(objEmploymentStatus1.isDisplayed())
				{
					System.out.println("Employment Status is displayed");
				}
				Thread.sleep(1000);
				//to edit
				Driver.findElement(By.xpath("//*[@id='editBtn']")).click();
				Thread.sleep(1000);
				//create web element
				WebElement objAddEmploymentStatus=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='frmJobTitle']/div[2]/input[1]")));
				//Verify Add Employment Status
				if(objAddEmploymentStatus.isDisplayed())
				{
					System.out.println("Add Employment Status is displayed");
				}
				Thread.sleep(1000);
				//create web element
				WebElement objEditEmploymentStatus=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='frmJobTitle']/div[2]/input[2]")));
				//Verify Edit Employment Status
				if(objEditEmploymentStatus.isDisplayed())
				{
					System.out.println("Edit Employment Status is displayed");
				}
				Thread.sleep(1000);
				//to click
				objEditEmploymentStatus.click();
				//wait for alert displayed
				Alert A2=wait.until(ExpectedConditions.alertIsPresent());
				//wait for 1 sec
				Thread.sleep(1000);
				//Verfiy Select at least one record to delete message
				if(A2.getText().equals("Please select employment status"))
				{
					System.out.println("Please select employment status");
					A2.accept();
					//wait for 1 sec
					Thread.sleep(1000);
				}
				//to select employment status
				Select e=new Select(Driver.findElement(By.id("cmbUnAssEmploymentStatus")));
				e.selectByValue("EST005");
					Thread.sleep(1000);
					//create web element
					WebElement objSave1=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='editBtn']")));
				//click on save
				objSave1.click();
				Thread.sleep(1000);
				//-----------------------------------------------------------------------------
				//================================================================================
				//to edit job title
				//Get row count
				int rc=Driver.findElements(By.xpath("/html/body/div/div[2]/form/table/tbody/tr")).size();
				System.out.println(rc);
				int i;
				for(i=1;i<=rc;i++)
				{
					//Get third column data
					String strJobTitleName=Driver.findElement(By.xpath("html/body/div[1]/div[2]/form/table/tbody/tr["+i+"]/td[3]/a")).getText();
					if(strJobTitleName.equals(sName))
					{
						System.out.println("sName displayed at: "+i);
						Thread.sleep(1000);
						Driver.findElement(By.xpath("html/body/div[1]/div[2]/form/table/tbody/tr["+i+"]/td[3]/a")).click();
						break;
					}
				}
				//to edit
				Driver.findElement(By.xpath("//input[@id='editBtn']")).click();
				Thread.sleep(1000);
				//to enter city
				String sJobTitleComments="Working As A Manager";
				Driver.findElement(By.name("txtJobTitleComments")).sendKeys(sJobTitleComments);
				Thread.sleep(1000);
				//Click on save
				Driver.findElement(By.xpath("//*[@id='editBtn']")).click();
				Thread.sleep(1000);
				//------------------------------------------------------------------------------------
				//===================================================================================
				//to delete job title
				Driver.findElement(By.xpath("html/body/div[1]/div[2]/form/div[4]/div[1]/input[2]")).click();
				Thread.sleep(1000);
				//wait for alert displayed
				Alert A4=wait.until(ExpectedConditions.alertIsPresent());
				//wait for 1 sec
				Thread.sleep(1000);
				//Verfiy Select at least one record to delete message
				if(A4.getText().equals("Select at least one record to delete"))
				{
					System.out.println("Select at least one record to delete");
					A4.accept();
					//wait for 1 sec
					Thread.sleep(1000);
				}
				//to check and delete the record
				Driver.findElement(By.xpath("/html/body/div/div[2]/form/table/tbody/tr["+i+"]/td[1]/input")).click();
				Thread.sleep(1000);
				Driver.findElement(By.xpath("/html/body/div/div[2]/form/div[4]/div[1]/input[2]")).click();
				Thread.sleep(1000);
				//wait for alert displayed
				Alert A5=wait.until(ExpectedConditions.alertIsPresent());
				//wait for 1 sec
				Thread.sleep(1000);
				//Verfiy Select at least one record to delete message
				if(A5.getText().equals("Deletion may affect Pay Grade of Employees in PIM. Do you want to delete ?"))
				{
					System.out.println("Deletion may affect Pay Grade of Employees in PIM. Do you want to delete ?");
					A5.accept();
					//wait for 1 sec
					Thread.sleep(1000);
				}
				Driver.close();
				Driver.quit();
			
			}
		}