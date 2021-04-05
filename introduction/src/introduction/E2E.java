package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class E2E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		 driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		 driver.findElement(By.xpath("//a[@value='IXU']")).click();
		 //driver.findElement(By.xpath("(//a[@value='ATQ'])[2]")).click();
		 
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='ATQ']")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			
			System.out.println("its enabled");
			Assert.assertTrue(true);
		}
		else
			
		{
			Assert.assertTrue(false);
		}
		
		WebElement DivClick =driver.findElement(By.id("divpaxinfo"));
		DivClick.click();
		WebElement StaticDropdown = driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
		
		Select dropdown =new Select(StaticDropdown);
		dropdown.selectByIndex(2);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		

		WebElement StaticDropdown1 =driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select dropdown1 =new Select(StaticDropdown1);
		dropdown1.selectByIndex(3);
		System.out.println(dropdown1.getFirstSelectedOption().getText());
		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		//Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click(); 
		//Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("input[type='checkbox']")).getSize());
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
	
		}
		
		
	}


