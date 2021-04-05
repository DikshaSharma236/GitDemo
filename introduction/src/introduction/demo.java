package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
      driver.get("http://google.com");
      System.out.println(driver.getTitle());
      System.out.println(driver.getCurrentUrl());
      
      //System.out.println(driver.getPageSource());
      driver.navigate().to("http://yahoo.com");
      driver.navigate().back();
	}

}
