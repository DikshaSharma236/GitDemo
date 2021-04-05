package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://facebook.com");
//Generating customized css path from html attributes
		//tagname[attribute='value']
		
		//driver.findElement(By.cssSelector("input[name='email']")).sendKeys("2346678");
		//driver.findElement(By.cssSelector("[value='1']")).click();
		
		//Generating customized xpath from html attributes 
		 ////tagname[@attribute= 'value']
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("myown xpath");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("212355");
		driver.findElement(By.xpath("//button[@value='1']")).click();

	}

}
