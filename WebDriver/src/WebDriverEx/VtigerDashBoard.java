package WebDriverEx;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VtigerDashBoard
{
	public static void main(String[] args)throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeDriver Driver=new ChromeDriver();
		//Maximize browser
		//Driver.manage().window().maximize();
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
				//Create webelements for Trouble Tickets
				WebElement objTroubleTickets=Driver.findElement(By.linkText("Trouble Tickets"));
				//Verify Trouble Tickets
				if(objTroubleTickets.isDisplayed())
				{
					System.out.println("Trouble Tickets is displayed");
				}
				//Create webelements for Dashboard
				WebElement objDashboard=Driver.findElement(By.linkText("Dashboard"));
				//Verify Dashboard
				if(objDashboard.isDisplayed())
				{
					System.out.println("Dashboard is displayed");
				}
				//=========================================================================================================
				// to click on Dashboard
				objDashboard.click();
				//wait 2 sec
				Thread.sleep(2000);
				//verify Dashboard page displayed
				if(Driver.getTitle().equals("user1 - Dashboards - vtiger CRM 5 - Commercial Open Source CRM"))
				{
					System.out.println("Dashboard page displayed");
				}
				else
				{
					System.out.println("Failed to display");
					return;
				}
				//verify Dashboard Home page must be displayed
				if(Driver.findElement(By.xpath("//*[@id='dashTitle_div']")).getText().equals("Dashboard Home"))
				{
					System.out.println("Dashboard Home page displayed");
				}
				else
				{
					System.out.println("Failed to display");
					return;
				}
				//wait for 2 sec
				Thread.sleep(2000);
				//Verfiy Pipeline By Sales Stage
				if(Driver.findElement(By.xpath("//*[@id='dashChart']/table[2]/tbody/tr/td/table/tbody/tr[1]/td[1]/table/tbody/tr[1]/td[2]/span")).getText().equals("Pipeline By Sales Stage"))
				{
					System.out.println("Pipeline By Sales Stage");
				}
				else
				{
					System.out.println("Failed to display");
					return;
				}
					//wait for 2 sec
					Thread.sleep(2000);
				//================================================================================================
					//to scroll
					JavascriptExecutor jse=(JavascriptExecutor)Driver;
					jse.executeScript("window.scrollBy(0,500)", "");
					Thread.sleep(1000);
					String t=Driver.findElement(By.xpath("//*[@id='dashChart']/table[2]/tbody/tr/td/table/tbody/tr[4]/td[1]/table/tbody/tr[1]/td[2]/span")).getText();
					System.out.println(t);
					Thread.sleep(1000);
					//Verfiy Pipeline By Month By Outcome
					if(t.equals("Pipeline By Month By Outcome"))
					{
						System.out.println("Pipeline By Month By Outcome");
					}
					else
					{
						System.out.println("Failed to display");
						return;
					}
						//wait for 2 sec
						Thread.sleep(2000);
						//to scroll
						jse.executeScript("window.scrollBy(500,1000)", "");
						Thread.sleep(1000);
						String s=Driver.findElement(By.xpath("//*[@id='dashChart']/table[2]/tbody/tr/td/table/tbody/tr[7]/td[1]/table/tbody/tr[1]/td[2]/span")).getText();
						System.out.println(s);
						Thread.sleep(1000);
						//Verfiy All Opportunities By Lead Source By Outcome
						if(s.equals("All Opportunities By Lead Source By Outcome"))
						{
							System.out.println("All Opportunities By Lead Source By Outcome");
						}
						else
						{
							System.out.println("Failed to display");
							return;
						}
							//wait for 2 sec
							Thread.sleep(2000);
							//to scroll
							jse.executeScript("window.scrollBy(1000,1500)", "");
							Thread.sleep(1000);
							String f=Driver.findElement(By.xpath("//*[@id='dashChart']/table[2]/tbody/tr/td/table/tbody/tr[10]/td[1]/table/tbody/tr[1]/td[2]/span")).getText();
							System.out.println(f);
							Thread.sleep(1000);
							//Verfiy All Opportunities By Lead Source
							if(f.equals("All Opportunities By Lead Source"))
							{
								System.out.println("All Opportunities By Lead Source");
							}
							else
							{
								System.out.println("Failed to display");
								return;
							}
								//wait for 2 sec
								Thread.sleep(2000);
								//to click on slide up
								//create web element
								WebElement objScrollup=Driver.findElement(By.xpath("//*[@id='dashChart']/table[2]/tbody/tr/td/table/tbody/tr[1]/td[2]/table/tbody/tr/td[6]/a/img"));
								//to click
								objScrollup.click();
								Thread.sleep(1000);
				//==========================================================================================
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

