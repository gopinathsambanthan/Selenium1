package Jenkins;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestScript {
	
	WebDriver driver;
	@Test
	  public void f() {
		  driver.findElement(By.name("userName")).sendKeys("mercury");
		  driver.findElement(By.name("password")).sendKeys("mercury");
		  driver.findElement(By.xpath("//input[@value='Login']")).click();
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  //launch browser and application
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_c2d.02.11\\Downloads\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://newtours.demoaut.com");
	  }

	  @AfterMethod
	  public void afterMethod() {
		 // Assert.assertTrue(driver.getTitle().contains("Flight"));
		  driver.close();
	  }
}
