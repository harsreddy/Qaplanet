package WebDriverEx;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class DragAndDrop 
{

	public static void main(String[] args)throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\tet\\Selenium_Demp\\chromedriver.exe");
		 ChromeDriver driver=new ChromeDriver();
		 //driver.manage().window().maximize();
		 WebDriverWait wait=new WebDriverWait(driver, 30);
		 Actions act=new Actions(driver);
		 //--------------------------------------------------
		 String URL="https://dhtmlx.com/docs/products/dhtmlxTree/index.shtml";
		 driver.get(URL);
		 wait.until(ExpectedConditions.titleIs("JavaScript Tree Menu - Ajax TreeView - dhtmlxTree"));
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,1000)");
		 Thread.sleep(6000);
		//take xpath of thriller from first box
		 WebElement from=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='treebox1']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span")));
		//take xpath of horror from second box
		 WebElement to=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='treebox2']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[4]/td[2]/table/tbody/tr[1]/td[4]/span")));
		 //way1
		 act.clickAndHold(from).perform();
		 Thread.sleep(2000);
		 act.moveToElement(to).perform();
		 act.click(to).perform();
		 //way 2
		 /*Action dragdrop=act.clickAndHold(from)
				 .moveToElement(to)
				 .click(to)
				 .build();
		 dragdrop.perform();*/
		 //way 3
		//act.dragAndDrop(from, to).perform();
		//way 4
		/*Point ObjFrm = from.getLocation();
		//get x and y
		//int FromX=ObjFrm.getX();
		//int FromY=ObjFrm.getY();
		//--------------------------------------------------------------
		Point ObjTo=to.getLocation();
		//get x and y
		int ToX=ObjTo.getX();
		int ToY=ObjTo.getY();
		//-------------------------------------------------------------
		//act.dragAndDropBy(from, ToX, ToY).perform();
		//-------------------------------------------------------------
		act.clickAndHold(from).perform();
		act.moveToElement(to).moveByOffset(ToX, ToY).perform();
		act.release(to).perform();
		 Thread.sleep(6000);
		 //driver.close();
		 //driver.quit();*/
	}
}
