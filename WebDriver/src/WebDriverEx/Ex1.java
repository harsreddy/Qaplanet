package WebDriverEx;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Ex1 
{
public static void main(String[] args)throws Exception 
{
	System.setProperty("webdriver.chrome.driver", "D:\\tet\\Selenium_Demp\\chromedriver.exe");
//create object and it will launch browser
	ChromeDriver Driver=new ChromeDriver();
	//to maximize browser
	//Driver.manage().window().maximize();
	//-------------------------------------
	//open Application
	Driver.get("http://apps.qaplanet.in/qahrm/login.php");
	//wait 2 sec
	Thread.sleep(2000);
	//clear username text box
	Driver.findElement(By.name("txtUserName")).clear();
	//Enter Username
	Driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
	//clear password text box
	Driver.findElement(By.name("txtPassword")).clear();
	//Enter password
	Driver.findElement(By.name("txtPassword")).sendKeys("lab1");
	//click on login
	Driver.findElement(By.name("Submit")).click();
	//wait 2 sec
	Thread.sleep(2000);
	//Click on logout
	Driver.findElement(By.linkText("Logout")).click();
	//wait 2 sec
	Thread.sleep(2000);
	//--------------------------------------------
	//close browser
	Driver.close();
	//quit object
	Driver.quit();
}
}