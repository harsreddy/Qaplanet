package WebDriverEx;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebTable 
{
	public static void main(String[] args)throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\tet\\Selenium_Demp\\chromedriver.exe");
		 ChromeDriver driver=new ChromeDriver();
		 //driver.manage().window().maximize();
		 //-------------------------------------------------------------------
		 driver.get("http://apps.qaplanet.in/WebApp/AssertXPath.html");
		 Thread.sleep(2000);
		 //-------------------------------------------------------------------
		 /*//to get row count
		 int rc=driver.findElements(By.xpath("//table[@id='idCourse']/tbody/tr")).size();
		 System.out.println(rc);
		 //to get column count
		 int colc=driver.findElements(By.xpath("//table[@id='idCourse']/tbody/tr[1]/td")).size();
		 System.out.println(colc);
		 //to get cell count
		 int cc=driver.findElements(By.xpath("//table[@id='idCourse']/tbody/tr/td")).size();
		 System.out.println(cc);*/
		 //-----------------------------------------------------------------------
		 //for siblings
		 String text=driver.findElement(By.xpath("//table[@id='idCourse']/descendant::td[contains(text(),'Selenium')]/following-sibling::td")).getText();
		 System.out.println(text);
		 String text1=driver.findElement(By.xpath("//table[@id='idCourse']/descendant::td[contains(text(),'Selenium')]/following-sibling::td[2]")).getText();
		 System.out.println(text1);
	}
}