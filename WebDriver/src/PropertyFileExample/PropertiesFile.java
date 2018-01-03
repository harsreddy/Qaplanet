package PropertyFileExample;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
public class PropertiesFile 
{
	public static void main(String[] args)throws Exception
	{
		Properties obj=new Properties();
		obj.load(new FileInputStream("D:\\Harish Reddy\\WebDriver\\FlipKart.Properties"));
		
		String strurl=obj.getProperty("url");
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeDriver br=new ChromeDriver();
		br.navigate().to(strurl);
		//Explict wait object
		WebDriverWait wait=new WebDriverWait(br, 60);
		Actions Act=new Actions(br);
		br.findElement(By.xpath("//html/body/div[2]/div/div/button")).click();
		Thread.sleep(1000);
		WebElement objElectronics=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='container']/div/header/div[2]/div/ul/li[1]/a/span")));
		//Verify Electronics
		if(objElectronics.isDisplayed())
		{
			System.out.println("Electronics is displayed");
		}
		Thread.sleep(1000);
		//Mouse over on Electronics
		Act.moveToElement(objElectronics).perform();
		Thread.sleep(1000);
		WebElement objMobiles=wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Mobiles")));
		//Verify Mobiles
		if(objMobiles.isDisplayed())
		{
			System.out.println("Mobiles is displayed");
		}
		Thread.sleep(1000);
		br.findElement(By.linkText("Mobiles")).click();
		Thread.sleep(2000);
		br.findElement(By.linkText("Samsung")).click();
		Thread.sleep(2000);
		br.findElement(By.linkText("VIEW ALL")).click();
		Thread.sleep(3000);
		br.findElement(By.xpath("//*[@id='container']/div/div[1]/div/div[2]/div/div[2]/div/div[2]/section/ul/li[3]")).click();
		Thread.sleep(2000);
		//Get row count
		int rc=br.findElements(By.xpath("//html/body/div[1]/div/div[1]/div/div[2]/div/div[2]/div/div[3]/div[1]/div/div/div")).size();
		System.out.println(rc);
			//Get third column data
			List<WebElement>PName=br.findElements(By.xpath("//*[@id='container']/div/div[1]/div/div[2]/div/div[2]/div/div[3]/div[1]/div/div/div/a/div[3]/div[1]/div[1]"));
			System.out.println(PName.size());
			List<WebElement>Price=br.findElements(By.xpath("//*[@id='container']/div/div[1]/div/div[2]/div/div[2]/div/div[3]/div[1]/div/div/div/a/div[3]/div[2]/div[1]/div/div[1]"));
			System.out.println(Price.size());
			Thread.sleep(10000);
			//printing the mobile names and prices
			
			for (int i = 0 ;i<PName.size();i++)
			{
				System.out.println(PName.get(i).getText() +"   "+Price.get(i).getText());
				
			}
				WritableWorkbook wwb=Workbook.createWorkbook(new File("D://Flipkart2.xls"));
				WritableSheet ws=wwb.createSheet("Flipkart", 0);
				Label l=new Label(0,0,"PName");
				Label l1=new Label(1,0,"Price");
				ws.addCell(l);
				ws.addCell(l1);
				//get rows count
				for(int j=0;j<PName.size();j++)
				{
					String PName1=PName.get(j).getText();
					String Price1=Price.get(j).getText();
					Label r1=new Label(0,j,PName1);
					Label r2=new Label(1,j,Price1);
					ws.addCell(r1);
					ws.addCell(r2);
				}
				wwb.write();
				wwb.close();
		/*br.close();
		br.quit();*/
	}
}
