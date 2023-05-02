package day07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class e04 {
	  WebDriver driver;
	@BeforeSuite
	  public void setup() {
	   	    WebDriverManager.edgedriver().setup();
			EdgeOptions co=new EdgeOptions();
		    co.addArguments("--remote-allow-origins=*");
		    driver=new EdgeDriver(co);
		    
	  }
	  
	  @Test
	  public void login() throws InterruptedException{
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  driver.manage().window().maximize();
		  Thread.sleep(3000);
		  WebElement uname=driver.findElement(By.name("username"));
		  uname.sendKeys("Admin");
		  WebElement pass=driver.findElement(By.name("password"));
		  pass.sendKeys("admin123");
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		  String t=driver.getCurrentUrl();
		  Assert.assertEquals(t,"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		  
	  }
	  
	  @Test(dependsOnMethods="login")
	  void test2() throws InterruptedException{
		  
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span")).click();
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
		  String t=driver.getCurrentUrl();
		  Assert.assertEquals(t,"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	      
		  
	  }
}
