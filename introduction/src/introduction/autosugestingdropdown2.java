package introduction;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class autosugestingdropdown2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	//declearing array list
	 
	String[] ItemsNeeded= {"Cucumber","Brocolli","Beetroot"};
	
	
	List<WebElement> products =driver.findElements(By.cssSelector("h4.product-name"));
	
	 for(int i=0;i<products.size();i++)
	 {
		  //Brocolli  - 1 Kg
			//Brocolli, 1 Kg
			//Brocolli[0]
			//1 Kg[1]
			  
			  
		 
	String[] name=products.get(i).getText().split("-");
	String Formattedname=name[0].trim();
	 //format it to get actual vegitable name
	 //convert array into arraylist
	 //check wheather the name you extracted  is present in arraylist or not
	
	 List ItemsNeededList = Arrays.asList(ItemsNeeded);
	 int j=0;
	if(ItemsNeededList.contains(Formattedname))
	{
		j++;
		//driver.findElement(By.xpath("//div[@class='product-action']/button")).click();
		driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
		if(j==3)
		{
			break;
		}
	}
		 
		}


	}
	}
