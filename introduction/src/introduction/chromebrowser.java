package introduction;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromebrowser {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		//driver.findElement(By.id("email")).sendKeys("testing");
		//driver.findElement(By.name("pass")).sendKeys("123456");
	   // driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.cssSelector("#email")).sendKeys("diksha.sharma@effectualtech.com");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("12334556");
		driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
		
       
	}

}
