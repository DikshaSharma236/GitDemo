package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		//Assert.assertFalse(false, null);
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click(); 
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		System.out.println(driver.findElement(By.cssSelector("input[type='checkbox']")).getSize());
		
		//driver.findElement(By.cssSelector("input[id*='ctl00_mainContent_rbtnl_Trip_1']")).click(); 


		//System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		//System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
	//how to enables the calendar in site
	   System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
	   
	   if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
	   {
		   
		   System.out.println("its enables");
		   Assert.assertTrue(true);
	   }
	   else
		   
	   {
		   Assert.assertTrue(false);
		   
		   
	   }
	}

}
