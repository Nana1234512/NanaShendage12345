package mock3jun;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Contats {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
     WebDriver driver=new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     driver.get("https://demo.vtiger.com/vtigercrm/");
     driver.findElement(By.xpath("//button[text()='Sign in']")).click();
     driver.findElement(By.id("appnavigator")).click();
     Thread.sleep(2000);
    WebElement ele=  driver.findElement(By.id("SALES_modules_dropdownMenu"));
    		  Actions a= new Actions(driver);
          a.moveToElement(ele).perform();
          Thread.sleep(2000);
         WebElement ele1= driver.findElement(By.xpath("(//span[text()=' Contacts'])[2]"));
         Actions b=new Actions(driver);
         b.moveToElement(ele1).click();
         b.perform();
         
          driver.findElement(By.id("Contacts_listView_basicAction_LBL_ADD_RECORD")).click();
          driver.findElement(By.name("firstname")).sendKeys("nana");
          driver.findElement(By.name("lastname")).sendKeys("shendage");
          driver.findElement(By.name("title")).sendKeys("contact");
       
          driver.findElement(By.id("Contacts_editView_fieldName_phone")).sendKeys("123456780");
          driver.findElement(By.id("Contacts_editView_fieldName_homephone")).sendKeys("907654321");
          driver.findElement(By.id("Contacts_editView_fieldName_otherphone")).sendKeys("2345678");
         
          driver.findElement(By.id("Contacts_editView_fieldName_fax")).sendKeys("123@#4");
          driver.findElement(By.id("Contacts_editView_fieldName_department")).sendKeys("IT");
          driver.findElement(By.id("Contacts_editView_fieldName_email")).sendKeys("nanashendage1712@gmail.com");
          driver.findElement(By.id("Contacts_editView_fieldName_assistant")).sendKeys("abc123");
          driver.findElement(By.id("Contacts_editView_fieldName_assistantphone")).sendKeys("abc123");
         WebElement Day =driver.findElement(By.id("Contacts_editView_fieldName_birthday"));
          Select s=new Select(Day);
          s.selectByValue("day");
          
	}
	

}
