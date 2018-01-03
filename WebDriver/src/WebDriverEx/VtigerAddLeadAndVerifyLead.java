package WebDriverEx;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VtigerAddLeadAndVerifyLead
{
	public static void main(String[] args)throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeDriver Driver=new ChromeDriver();
		//Maximize browser
		//Driver.manage().window().maximize();
		//Explict wait object
		WebDriverWait wait=new WebDriverWait(Driver, 60);
		//----------------------------------------------------------
		//Open Vtiger Crm web page
		Driver.get("http://classroom:8888/");
		//wait 2 sec
		Thread.sleep(2000);
		//Verify home page
		if(Driver.getTitle().equals("vtiger CRM 5 - Commercial Open Source CRM"))
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
		WebElement objUN=Driver.findElement(By.name("user_name"));
		WebElement objPWD=Driver.findElement(By.name("user_password"));
		WebElement objLogin=Driver.findElement(By.id("submitButton"));
		//------------------------------------------------------------------
		//Verify user name
		if(objUN.isDisplayed())
		{
			System.out.println("user_name displayed");
		}
		//Verify password
		if(objPWD.isDisplayed())
		{
			System.out.println("user_password displayed");
		}
		//Verfiy login
		if(objLogin.isDisplayed())
		{
			System.out.println("submitButton is displayed");
		}
		//-----------------------------------------------------------------------
		String strUN="qaplanet1";
		String strPWD="user1";
		//-----------------------------------------------------------------------
		//Login to VtigerCrm
		objUN.clear();
		objUN.sendKeys(strUN);
		objPWD.clear();
		objPWD.sendKeys(strPWD);
		objLogin.click();
		//wait 2 sec
		Thread.sleep(2000);
		//Verfiy VtigerCrm page
		if(Driver.getTitle().equals("user1 - Home - vtiger CRM 5 - Commercial Open Source CRM"))
		{
			System.out.println("Vtiger Crm page displayed");
		}
		else
		{
			System.out.println("Failed to login");
			return;
		}
		//Create webelements for Home
		WebElement objHome=Driver.findElement(By.linkText("Home"));
		//Verify Home
		if(objHome.isDisplayed())
		{
			System.out.println("Home is displayed");
		}
		//Create webelements for Calendar
				WebElement objCalendar=Driver.findElement(By.linkText("Calendar"));
				//Verify Calendar
				if(objCalendar.isDisplayed())
				{
					System.out.println("Calendar is displayed");
				}
				//Create webelements for Leads
				WebElement objLeads=Driver.findElement(By.linkText("Leads"));
				//Verify Leads
				if(objLeads.isDisplayed())
				{
					System.out.println("Leads is displayed");
				}
				//Create webelements for Organizations
				WebElement objOrganizations=Driver.findElement(By.linkText("Organizations"));
				//Verify Organizations
				if(objOrganizations.isDisplayed())
				{
					System.out.println("Organizations is displayed");
				}
				//Create webelements for Contacts
				WebElement objContacts=Driver.findElement(By.linkText("Contacts"));
				//Verify Contacts
				if(objContacts.isDisplayed())
				{
					System.out.println("Contacts is displayed");
				}
				//Create webelements for Opportunities
				WebElement objOpportunities=Driver.findElement(By.linkText("Opportunities"));
				//Verify Opportunities
				if(objOpportunities.isDisplayed())
				{
					System.out.println("Opportunities is displayed");
				}
				//Create webelements for Products
				WebElement objProducts=Driver.findElement(By.linkText("Products"));
				//Verify Products
				if(objProducts.isDisplayed())
				{
					System.out.println("Products is displayed");
				}
				//Create webelements for Documents
				WebElement objDocuments=Driver.findElement(By.linkText("Documents"));
				//Verify Documents
				if(objDocuments.isDisplayed())
				{
					System.out.println("Documents is displayed");
				}
				//Create webelements for Email
				WebElement objEmail=Driver.findElement(By.linkText("Email"));
				//Verify Email
				if(objEmail.isDisplayed())
				{
					System.out.println("Email is displayed");
				}
		//----------------------------------------------------------------
				//=========================================================================================================
				// to click on lead module
				objLeads.click();
				//wait 2 sec
				Thread.sleep(2000);
				//verify lead module page displayed
				if(Driver.getTitle().equals("user1 - Leads - vtiger CRM 5 - Commercial Open Source CRM"))
				{
					System.out.println("Leads page displayed");
				}
				else
				{
					System.out.println("Failed to display");
					return;
				}
				//create webelement for add crate lead
				WebElement objCreateLead=Driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[2]/td[2]/table/tbody/tr/td[2]/table/tbody/tr/td/table/tbody/tr/td[1]/a/img"));
				//click on create lead
				objCreateLead.click();
				//wait 2 sec
				Thread.sleep(2000);
				//verify crete new lead page must be displayed
				if(Driver.findElement(By.xpath("//html/body/table[4]/tbody/tr/td[2]/div/span")).getText().equals("Creating New Lead"))
				{
					System.out.println("Create New Lead page displayed");
				}
				else
				{
					System.out.println("Failed to display");
					return;
				}
				//---------------------------------------------------
				String sCN= "Qaplanet";
				String sLN="Lab";
				//---------------------------------------------------
				//Create webelement
				WebElement objSave=Driver.findElement(By.name("button"));
				//Click on save
				objSave.click();
				//wait for 2 sec
				Thread.sleep(2000);
				//wait for alert displayed
				Alert A=wait.until(ExpectedConditions.alertIsPresent());
				//wait for 2 sec
				Thread.sleep(2000);
				//Verfiy Last Name cannot be empty message
				if(A.getText().equals("Last Name cannot be empty"))
				{
					System.out.println("Last Name cannot be empty displayed");
					A.accept();
					//wait for 2 sec
					Thread.sleep(2000);
					//Enter last name
					Driver.findElement(By.name("lastname")).sendKeys(sLN);
				}
				//---------------------------------------------------------------------------
				
				//Click on save
				objSave.click();
				//wait for 2 sec
				Thread.sleep(2000);
				//wait for alert displayed
				Alert A1=wait.until(ExpectedConditions.alertIsPresent());
				//wait for 2 sec
				Thread.sleep(2000);
				//Verfiy Company cannot be empty message
				if(A1.getText().equals("Company cannot be empty"))
				{
					System.out.println("Company cannot be empty displayed");
					A1.accept();
					//wait for 2 sec
					Thread.sleep(2000);
					//Enter company name
					Driver.findElement(By.name("company")).sendKeys(sCN);
				}	
				//Click on save
				objSave.click();
				
				//to get id
				String sid=Driver.findElement(By.xpath("//*[@id='tblLeadInformation']/table/tbody/tr[1]/td[4]")).getText();
				System.out.println(sid);
				
				
				//verify lead information page must be displayed
				if(wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("/html/body/table[3]/tbody/tr[1]/td/table[2]/tbody/tr/td[2]/div/table[2]/tbody/tr[1]/td/table/tbody/tr/td[2]"), "Lead Information")))
				{
					System.out.println("Lead Information displayed");
				}
				//wait 2 sec
				Thread.sleep(2000);
				//Click on leads 
				Driver.findElement(By.linkText("Leads")).click();
				//verify lead module page displayed
				if(Driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[2]/td[1]/a")).getText().equals("Leads"))
				{
					System.out.println("Lead Module page displayed");
				}
				//wait 2 sec
				Thread.sleep(2000);
				//==============================================================================================
				//to edit lead
				Driver.findElement(By.xpath("//*[@id='massdelete']/table/tbody/tr[1]/td/table[2]/tbody/tr/td/input[2]")).click();
				Thread.sleep(2000);
				//wait for alert displayed
				Alert A2=wait.until(ExpectedConditions.alertIsPresent());
				//wait for 2 sec
				Thread.sleep(2000);
				//Verfiy Please select at least one entity message
				if(A2.getText().equals("Please select at least one entity"))
				{
					System.out.println("Please select at least one entity displayed");
					A2.accept();
					//wait for 2 sec
					Thread.sleep(2000);
				}
				//to search for id
				WebElement objSearch=Driver.findElement(By.name("search_text"));
				objSearch.sendKeys(sid);
				Driver.findElement(By.name("submit")).click();
				Thread.sleep(2000);
				
				   String idname=Driver.findElement(By.xpath("//tr[contains(@id, 'row_')]/td[2]")).getText();
				   System.out.println(idname);
								  		   
				 	   if(sid.equals(" "+idname))
					   {
						   System.out.println(sid+"is displayed");
						  				   }
					   else
					   {
						   System.out.println("is not displayed");
					   }
								
				//to verify id
				if(sid.equals("Lead No"))
				{
					System.out.println("Lead No");
				}
				Thread.sleep(2000);
				//to check and edit the record
				Driver.findElement(By.xpath("//*[@id='selectCurrentPageRec']")).click();
				Thread.sleep(2000);
				Driver.findElement(By.xpath("//*[@id='massdelete']/table/tbody/tr[1]/td/table[2]/tbody/tr/td/input[2]")).click();
				Thread.sleep(2000);
				//verify Mass Edit - Records Fields page displayed
				if(Driver.findElement(By.xpath("//*[@id='massedit']/table/tbody/tr/td[1]")).getText().equals("Mass Edit - Records Fields"))
				{
					System.out.println("Mass Edit - Records Fields page displayed");
				}
				//wait 2 sec
				Thread.sleep(2000);
				//to click on cancel
				Driver.findElement(By.xpath("//*[@id='massedit_form']/table[2]/tbody/tr/td/input[2]")).click();
				Thread.sleep(2000);
				//verify lead module page displayed
				if(Driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[2]/td[1]/a")).getText().equals("Leads"))
				{
					System.out.println("Lead Module page displayed");
				}
				//wait 2 sec
				Thread.sleep(2000);
				//to click on edit
				Driver.findElement(By.linkText("edit")).click();
				Thread.sleep(2000);
				//verify  Editing Lead Information page displayed
				if(Driver.findElement(By.xpath("/html/body/table[4]/tbody/tr/td[2]/div/span")).getText().contains(" Lab - Editing Lead Information"))
				{
					System.out.println(" Editing Lead Information page displayed");
				}
				//wait 2 sec
				Thread.sleep(2000);
				//to clear data
				Driver.findElement(By.name("lastname")).clear();
				Driver.findElement(By.name("company")).clear();
				Thread.sleep(2000);
				//-------------------------------------------------------------------
				String sCN1= "Qalab";
				String sLN1="selenium";
				//-------------------------------------------------------------------
				//to enter new values
				Driver.findElement(By.name("lastname")).sendKeys(sLN1);
				Driver.findElement(By.name("company")).sendKeys(sCN1);
				Thread.sleep(2000);
				//to click on save
				Driver.findElement(By.xpath("/html/body/table[4]/tbody/tr/td[2]/div/form/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[18]/td/div/input[1]")).click();
				Thread.sleep(2000);
				//verify record
				if(Driver.findElement(By.xpath("//*[@id='massdelete']/table/tbody/tr[1]/td/div/table/tbody/tr[3]/td[3]")).getText().equals(sLN1))
				{
					System.out.println(sLN1);
				}
				//wait 2 sec
				Thread.sleep(2000);
				if(Driver.findElement(By.xpath("//*[@id='massdelete']/table/tbody/tr[1]/td/div/table/tbody/tr[3]/td[5]")).getText().equals(sCN1))
				{
					System.out.println(sCN1);
				}
				//wait 2 sec
				Thread.sleep(2000);
				//=======================================================================================================
				//to delete lead
				Driver.findElement(By.xpath("//*[@id='massdelete']/table/tbody/tr[1]/td/table[2]/tbody/tr/td/input[1]")).click();
				Thread.sleep(2000);
				//wait for alert displayed
				Alert A3=wait.until(ExpectedConditions.alertIsPresent());
				//wait for 2 sec
				Thread.sleep(2000);
				//Verfiy Please select at least one entity message
				if(A3.getText().equals("Please select at least one entity"))
				{
					System.out.println("Please select at least one entity displayed");
					A3.accept();
					//wait for 2 sec
					Thread.sleep(2000);
				}
				//to check and delete the record
				Driver.findElement(By.xpath("//*[@id='selectCurrentPageRec']")).click();
				Thread.sleep(2000);
				Driver.findElement(By.xpath("//*[@id='massdelete']/table/tbody/tr[1]/td/table[2]/tbody/tr/td/input[1]")).click();
				Thread.sleep(2000);
				//wait for alert displayed
				Alert A4=wait.until(ExpectedConditions.alertIsPresent());
				//wait for 2 sec
				Thread.sleep(2000);
				//Verfiy Are you sure you want to delete the selected 1 records?
				if(A4.getText().equals("Are you sure you want to delete the selected 1 records?"))
				{
					System.out.println("Are you sure you want to delete the selected 1 records?");
					A4.dismiss();
					//wait for 2 sec
					Thread.sleep(2000);
				}
				//verify lead module page displayed
				if(Driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[2]/td[1]/a")).getText().equals("Leads"))
				{
					System.out.println("Lead Module page displayed");
				}
				//wait 2 sec
				Thread.sleep(2000);
				//to click on delete
				Driver.findElement(By.linkText("del")).click();
				Thread.sleep(2000);
				//wait for alert displayed
				Alert A5=wait.until(ExpectedConditions.alertIsPresent());
				//wait for 2 sec
				Thread.sleep(2000);
				//Verfiy Are you sure you want to delete the selected 1 records?
				if(A5.getText().equals("Are You Sure You want to Delete?"))
				{
					System.out.println("Are You Sure You want to Delete?");
					A5.accept();
					//wait for 2 sec
					Thread.sleep(2000);
				}
				Actions act =new Actions(Driver);
				
				WebElement img=Driver.findElement(By.xpath("//html/body/table[1]/tbody/tr/td[3]/table/tbody/tr/td[2]/img"));
				act.moveToElement(img).perform();
			
				//Create webelement for logout
				WebElement objSignOut=Driver.findElement(By.linkText("Sign Out"));
				//Verify Sign Out
						if(objSignOut.isDisplayed())
						{
							System.out.println("Sign Out is displayed");
						}
				//Click on logout
				 objSignOut.click();
		//wait 2 sec
		Thread.sleep(2000);
		//Verify home page
		if(Driver.getTitle().equals("vtiger CRM 5 - Commercial Open Source CRM"))
		{
			System.out.println("Home page displayed");
		}
		else
		{
			System.out.println("Failed to open home page");
			return;
		}	
		//-----------------------------------------------------------------------------
		Driver.close();
		Driver.quit();
	}
}
