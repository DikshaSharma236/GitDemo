package introduction;



import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddCart {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//implicit wait
	//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	//explicit wait
	 WebDriverWait w= new WebDriverWait(driver,5);
    driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
    //declearation of array in selenium
    
    String[] ItemNeeded ={"Cucumber","Brocolli","Beetroot"};
  List<WebElement> products =driver.findElements(By.cssSelector("h4.product-name"));
  
  for(int i=0;i<products.size();i++)
  {
	  //Brocolli  - 1 Kg
	//Brocolli, 1 Kg
	//Brocolli[0]
	//1 Kg[1]
	  
	  
	  
	 String[] name= products.get(i).getText().split("-");
	   String Formattedname=name[0].trim(); 
	 //format it to get actual vegitable name
	 //convert array into arraylist
	 //check wheather the name you extracted  is present in arraylist or not
	 List ItemNeededList= Arrays.asList(ItemNeeded);
	 int j=0;
	  if(ItemNeededList.contains(Formattedname))
	  {
		  j++;
		  //driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		  driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
		  if(j==3)
		  {
 			  break; 
		  }
	  }
	  
  }
  driver.findElement(By.cssSelector("img[alt='Cart']")).click();
  driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
  
  w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
  driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
  driver.findElement(By.cssSelector("button[class='promoBtn']")).click();
  //explicit wait
 w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
 
   System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
   
   driver.findElement(By.xpath("//button[text()='Place Order']")).click();
	}

}
