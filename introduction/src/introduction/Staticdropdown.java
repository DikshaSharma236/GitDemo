package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Staticdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.spicejet.com/");

		WebElement divClick = driver.findElement(By.className("paxinfo"));
		divClick.click();
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());

		// dropdown.selectByVisibleText("AED");
		// System.out.println(dropdown.getFirstSelectedOption().getText());
		// dropdown.selectByValue("INR");
		// System.out.println(dropdown.getFirstSelectedOption().getText());

	}

}
