package day07;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class e01 {
  @Test
  public void f() {
			WebDriverManager.edgedriver().setup();
			EdgeOptions co=new EdgeOptions();
		    co.addArguments("--remote-allow-origins=*");
		    WebDriver driver=new EdgeDriver(co);
		    driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
		    String t=driver.getTitle();
		    Assert.assertEquals(t,"Guest Registration Form – User Registration");
  }
}
