package WebDriverEx;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown 
{
	public static void main(String[] args)throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\tet\\Selenium_Demp\\chromedriver.exe");
		 ChromeDriver driver=new ChromeDriver();
		 //driver.manage().window().maximize();
		 //-------------------------------------------------------------------
		 driver.get("http://apps.qaplanet.in/WebApp/SelectAWebSite.html");
		 Thread.sleep(2000);
		 //create web element for drop down
		 WebElement E=driver.findElement(By.name("OptWeb"));
		 //create select object
		 Select sel=new Select(E);
		 //--------------------------------------------------------------------
		 /*//select by visible text
		 sel.selectByVisibleText("QAPlanet");
		 Thread.sleep(2000);
		 //select by index
		 sel.selectByIndex(3);
		 Thread.sleep(2000);
		 //select by value property
		 sel.selectByValue("Yahoo");
		 Thread.sleep(2000);
		 //----------------------List Box---------------------------------------
		 sel.deselectAll();
		 sel.deselectByIndex(0);
		 sel.deselectByValue("val");
		 sel.deselectByVisibleText("text");*/
		 /*//to get all items count
		 int ic=sel.getOptions().size();
		 System.out.println(ic);
		 //way2
		 List<WebElement> ops=sel.getOptions();
		 System.out.println(ops.size());
		 //----------------------------------------------------------------------
		 //to get selected items count
		 List<WebElement>selectedops=sel.getAllSelectedOptions();
		 System.out.println(selectedops.size());
		 //to get first selected option
		 WebElement E1=sel.getFirstSelectedOption();*/
		 //----------------------------------------------------------------------
		 //how to print all values
		 List<WebElement>ops=sel.getOptions();
		 //way1
		 for(int i=0;i<ops.size();i++)
		 {
			 String text=ops.get(i).getText();
			 System.out.println(text);
		 }
		 //way2:using for each loop
		 for(WebElement E1:ops)
		 {
			 String text=E1.getText();
			 System.out.println(text);
		 }
		 //way3:using iterator
		 Iterator<WebElement>it=ops.iterator();
		 while(it.hasNext())
		 {
			 WebElement E1=it.next();
			 System.out.println(E1.getText());
		 }
	}
}
