package WebDriverEx;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class VtigerEmail
{

	public static void main(String[] args)throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeDriver Driver=new ChromeDriver();
		//Maximize browser
		Driver.manage().window().maximize();
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
				//=========================================================================================================
				// to click on email
				objEmail.click();
				//wait 2 sec
				Thread.sleep(2000);
				//verify Email page displayed
				if(Driver.getTitle().equals("user1 - Email - vtiger CRM 5 - Commercial Open Source CRM"))
				{
					System.out.println("email page displayed");
				}
				else
				{
					System.out.println("Failed to display");
					return;
				}
				//create webelement for Compose
				WebElement objCompose=Driver.findElement(By.xpath("/html/body/table[4]/tbody/tr/td[2]/table/tbody/tr/td[2]/form/table/tbody/tr[1]/td/table/tbody/tr/td[1]/table/tbody/tr/td[1]/a"));
				//click on compose
				objCompose.click();
				//wait 2 sec
				Thread.sleep(2000);
				Set<String>IDS=Driver.getWindowHandles();
				Iterator<String>ITR=IDS.iterator();
				String First_ID=ITR.next();
				String Second_ID=ITR.next();
				System.out.println(First_ID);
				System.out.println(Second_ID);
				Thread.sleep(1000);
				Driver.switchTo().window(Second_ID);
				Thread.sleep(3000);
				//verify Compose E-Mail page must be displayed
				if(Driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td/table/tbody/tr/td")).getText().equals("Compose E-Mail"))
				{
					System.out.println("Compose E-Mail page displayed");
				}
				else
				{
					System.out.println("Failed to display");
					return;
				}
				Select e=new Select(Driver.findElement(By.name("parent_type")));
				e.selectByValue("Contacts");
				Thread.sleep(1000);
				//create web element
				WebElement objSelect=Driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[3]/span[1]/img"));
				//to click
				objSelect.click();
				Thread.sleep(1000);
				 Set<String>IDS1=Driver.getWindowHandles();
	               
	                for (String windows3 :IDS1 ) {
	                	Driver.switchTo().window(windows3);
	    			}
	                Thread.sleep(2000);
	                System.out.println("contacts page displayed");
	             Driver.findElement(By.xpath("//*[@id='1']")).click();
	               
				//Boolean txt = wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("/html/body/table/tbody/tr/td/table[1]/tbody/tr/td[1]"), "Contacts"));
				Thread.sleep(2000);
				Driver.switchTo().window(Second_ID);
				Thread.sleep(1000);
				//verify Compose E-Mail page must be displayed
				if(Driver.findElement(By.xpath("//html/body/form/table/tbody/tr[1]/td/table/tbody/tr/td")).getText().contains("Compose E-Mail"))
				{
					System.out.println("Compose E-Mail page displayed");
				}
				else
				{
					System.out.println("Failed to display");
					return;
				}
				//verify to field
				Driver.findElement(By.name("parent_name")).getAttribute("Barbara Jones<barbara_jones@company.com>,");
					System.out.println("Barbara Jones<barbara_jones@company.com>,displayed");
				
				//-------------------------------------------------------------------
					Date dt=new Date();
					SimpleDateFormat da=new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");
					String d=da.format(dt);
					System.out.println(d);	
					String sub="Selenium Practice"+d;
				//-------------------------------------------------------------------
				//to enter new values
				Driver.findElement(By.name("subject")).sendKeys(sub);
				Thread.sleep(2000);
				//to enter body
				//create object for robot class
				Robot rt=new Robot();
				StringSelection ss=new StringSelection("Send Notification mail to customer before a month of support end date");
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
				rt.delay(1000);
				rt.keyPress(KeyEvent.VK_TAB);
				rt.keyRelease(KeyEvent.VK_TAB);
				rt.delay(1000);
				rt.keyPress(KeyEvent.VK_TAB);
				rt.keyRelease(KeyEvent.VK_TAB);
				rt.delay(1000);
				rt.keyPress(KeyEvent.VK_TAB);
				rt.keyRelease(KeyEvent.VK_TAB);
				rt.delay(1000);
				rt.keyPress(KeyEvent.VK_TAB);
				rt.keyRelease(KeyEvent.VK_TAB);
				rt.delay(1000);
				rt.keyPress(KeyEvent.VK_TAB);
				rt.keyRelease(KeyEvent.VK_TAB);
				rt.delay(1000);
				  //Click on control +V
			    rt.keyPress(KeyEvent.VK_CONTROL);
			    rt.keyPress(KeyEvent.VK_V);
			    rt.keyRelease(KeyEvent.VK_V);
			    rt.keyRelease(KeyEvent.VK_CONTROL);
			    rt.delay(1000);
				//Create webelement
				WebElement objSave=Driver.findElement(By.xpath("/html/body/form/table/tbody/tr[9]/td/input[2]"));
				//Click on save
				objSave.click();
				//wait for 2 sec
				Thread.sleep(2000);
				Driver.switchTo().window(First_ID);
				Thread.sleep(1000);
				//verify Email page displayed
				if(Driver.getTitle().equals("user1 - Email - vtiger CRM 5 - Commercial Open Source CRM"))
				{
					System.out.println("email page displayed");
				}
				else
				{
					System.out.println("Failed to display");
					return;
				}
				System.out.println(sub);
				//to verify data
				WebElement objSearch=Driver.findElement(By.name("search_text"));
				objSearch.sendKeys(sub);
				Driver.findElement(By.name("find")).click();
				Thread.sleep(2000);
				//===================================================================================================
				//to delete email
				Driver.findElement(By.xpath("//html/body/table[4]/tbody/tr/td[2]/table/tbody/tr/td[2]/form/table/tbody/tr[4]/td[2]/div/div[1]/table/tbody/tr[2]/td[2]/b")).click();
				Thread.sleep(1000);
				//Create webelements for forward
				WebElement objforward=Driver.findElement(By.name("forward"));
				//Verify forward
				if(objforward.isDisplayed())
				{
					System.out.println("forward is displayed");
				}
				//Create webelements for Send
						WebElement objSend=Driver.findElement(By.name("Send"));
						//Verify Send
						if(objSend.isDisplayed())
						{
							System.out.println("Send is displayed");
						}
						//Create webelements for Reply
						WebElement objReply=Driver.findElement(By.name("Reply"));
						//Verify Reply
						if(objReply.isDisplayed())
						{
							System.out.println("Reply is displayed");
						}
						//Create webelements for Print
						WebElement objPrint=Driver.findElement(By.name("Print"));
						//Verify Print
						if(objPrint.isDisplayed())
						{
							System.out.println("Print is displayed");
						}
						//Create webelements for download
						WebElement objdownload=Driver.findElement(By.name("download"));
						//Verify download
						if(objdownload.isDisplayed())
						{
							System.out.println("download is displayed");
						}
						//Create webelements for delete
						WebElement objButton=Driver.findElement(By.name("Button"));
						//Verify delete
						if(objButton.isDisplayed())
						{
							System.out.println("delete is displayed");
						}
						//Create webelements for From
								WebElement objFrom=Driver.findElement(By.xpath("//*[@id='EmailDetails']/table/tbody/tr[2]/td/table/tbody/tr[1]/td[1]/b"));
								//Verify from
								if(objFrom.isDisplayed())
								{
									System.out.println("From : is displayed");
								}
								//Create webelements for To
								WebElement objTo=Driver.findElement(By.xpath("//*[@id='EmailDetails']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]/b"));
								//Verify To
								if(objTo.isDisplayed())
								{
									System.out.println("To: is displayed");
								}
								//Create webelements for Subject
								WebElement objSubject=Driver.findElement(By.xpath("//*[@id='EmailDetails']/table/tbody/tr[2]/td/table/tbody/tr[5]/td[1]/b"));
								//Verify Subject
								if(objSubject.isDisplayed())
								{
									System.out.println("Subject: is displayed");
								}
								//to click on delete
								Driver.findElement(By.name("Button")).click();
								Thread.sleep(2000);
				//wait for alert displayed
				Alert A=wait.until(ExpectedConditions.alertIsPresent());
				//wait for 2 sec
				Thread.sleep(2000);
				//Verfiy Are you sure you want to delete the selected 1 records?
				if(A.getText().equals("Are you sure you want to delete ?"))
				{
					System.out.println("Are you sure you want to delete ?");
					A.dismiss();
					//wait for 2 sec
					Thread.sleep(2000);
				}
				//verify Email page displayed
				if(Driver.getTitle().equals("user1 - Email - vtiger CRM 5 - Commercial Open Source CRM"))
				{
					System.out.println("email page displayed");
				}
				else
				{
					System.out.println("Failed to display");
					return;
				}
				Thread.sleep(1000);
				//to click on delete
				Driver.findElement(By.name("Button")).click();
				Thread.sleep(2000);
				//wait for alert displayed
				Alert A1=wait.until(ExpectedConditions.alertIsPresent());
				//wait for 2 sec
				Thread.sleep(2000);
				//Verfiy Are you sure you want to delete the selected 1 records?
				if(A1.getText().equals("Are you sure you want to delete ?"))
				{
					System.out.println("Are you sure you want to delete ?");
					A1.accept();
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

