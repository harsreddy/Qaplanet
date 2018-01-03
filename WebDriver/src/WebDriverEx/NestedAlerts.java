package WebDriverEx;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class NestedAlerts
{
	public static void main(String[] args)throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\tet\\Selenium_Demp\\chromedriver.exe");
		 ChromeDriver Browser=new ChromeDriver();
		//explicit wait
		WebDriverWait wait=new WebDriverWait(Browser, 20);
		//open webpage
		Browser.get("http://apps.qaplanet.in/WebApp/NestedAlerts.html");
		Thread.sleep(2000);
		//wait for element present
		WebElement objSubmit=wait.until(ExpectedConditions.presenceOfElementLocated(By.name("Submit")));
		Thread.sleep(2000);
		//choose answer
		Browser.findElement(By.xpath("//input[@name='rdoPres'][4]")).click();
		Thread.sleep(2000);
		//click on submit
		objSubmit.click();
		Thread.sleep(2000);
		//wait for confirmation message alert
		Alert A=wait.until(ExpectedConditions.alertIsPresent());
		if(A.getText().equals("Are you sure you want to submit this answer?"))
		{
			System.out.println("confirmation displayed");
			A.accept();
			Thread.sleep(2000);
			//wait for alert
			Alert A1=wait.until(ExpectedConditions.alertIsPresent());
			if(A1.getText().equals("submitted"))
				System.out.println("submitted displayed");
			A1.accept();
			Thread.sleep(2000);
		}
	Browser.close();
	Browser.quit();
	}
}
