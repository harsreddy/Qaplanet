package WebDriverEx;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToClearTextFields 
{
	public static void main(String[] args)throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\tet\\Selenium_Demp\\chromedriver.exe");
		 ChromeDriver Browser=new ChromeDriver();
		 Browser.get("http://classroom:90/qahrm/login.php");
		 //Browser.manage().window().maximize();
		 Thread.sleep(2000);
		 WebElement objUN=Browser.findElement(By.name("txtUserName"));
		 objUN.sendKeys("admin");
		 objUN.click();
		 objUN.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		 Thread.sleep(2000);
		 objUN.sendKeys(Keys.DELETE);
		 Thread.sleep(2000);
		 objUN.sendKeys("Qaplanet");
		 Thread.sleep(2000);
		 Browser.close();
		 Browser.quit();
	}
}
