package WebDriverEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver 
{
	public static void main(String[] args)throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\tet\\Selenium_Demp\\chromedriver.exe");
		 ChromeDriver Browser=new ChromeDriver();
		 Browser.get("http://apps.qaplanet.in/qahrm/login.php");
		 //Browser.manage().window().maximize();
		 Thread.sleep(2000);
		 Browser.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
		 Browser.findElement(By.name("txtPassword")).sendKeys("lab1");
		 Browser.findElement(By.name("Submit")).click();
		 Thread.sleep(2000);
		 //---------------------------------------------------
		 //create object for action class
		 Actions A=new Actions(Browser);
		 //move to PIM/mouse over on PIM
		 WebElement PIM=Browser.findElement(By.id("pim"));
		 //mouse over on PIM
		 A.moveToElement(PIM).perform();
		 Thread.sleep(2000);
		 Browser.findElement(By.linkText("Add Employee")).click();
		 //----------------------------------------------------
		Thread.sleep(2000);
		Browser.findElement(By.linkText("Logout")).click();
		Thread.sleep(2000);
		Browser.close();
		Browser.quit();
		//--------------------------------------------------
	}
}
