package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Saleforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://login.salesforce.com/");
        driver.findElement(By.id("username")).sendKeys("Diksha Sharma");
        driver.findElement(By.name("pw")).sendKeys("etech121345");
       driver.findElement(By.xpath("//*[@id='Login']")).click();
       System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
	}

}
