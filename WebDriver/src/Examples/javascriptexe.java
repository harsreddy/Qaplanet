package Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptexe 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://classroom:90/qahrm/login.php");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String jsUN="document.getElementsByName('txtUserName')[0].value='qaplanet1'";
		js.executeScript(jsUN);
		String jspwd="document.getElementsByName('txtPassword')[0].value='user1'";
		js.executeScript(jspwd);
		driver.findElement(By.cssSelector("input.button")).click();
		
	}
}
