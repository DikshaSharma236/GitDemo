package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\work\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		
		driver.get("http://google.com");
	      System.out.println(driver.getTitle());
	      System.out.println(driver.getCurrentUrl());

	}

}


