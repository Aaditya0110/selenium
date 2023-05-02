package day09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class e04 {
  WebDriver driver;
  @Parameters({"browser"})
  @BeforeMethod
  public void setup(String browser1) {
	  if(browser1.equals("edge"))  {
   	    WebDriverManager.edgedriver().setup();
		EdgeOptions co=new EdgeOptions();
	    co.addArguments("--remote-allow-origins=*");
	    driver=new EdgeDriver(co);
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.manage().window().maximize();
	  }
	  else if(browser1.equals("chrome")) {
	   	    WebDriverManager.chromedriver().setup();
			ChromeOptions co=new ChromeOptions();
		    co.addArguments("--remote-allow-origins=*");
		    driver=new ChromeDriver(co);
		    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		    driver.manage().window().maximize();
		  }
	  
  }
  
  @Test
  public void sleep() throws InterruptedException{
	  Thread.sleep(1000);
	  WebElement uname=driver.findElement(By.name("username"));
	  uname.sendKeys("Admin");
	  WebElement pass=driver.findElement(By.name("password"));
	  pass.sendKeys("admin123");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	  String t=driver.getCurrentUrl();
	  Assert.assertEquals(t,"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
  }
  
  @AfterMethod
  public void teardown() throws InterruptedException {
	  Thread.sleep(6000);
	  driver.close();
  }
} 
