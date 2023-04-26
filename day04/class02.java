package d04e02;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class class02 {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeOptions co=new EdgeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver=new EdgeDriver(co);
        driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
        driver.manage().window().maximize();
        WebElement fname=driver.findElement(By.id("input-firstname"));
        fname.sendKeys("Aadi");
        WebElement lname=driver.findElement(By.id("input-lastname"));
        lname.sendKeys("B P");
        WebElement email=driver.findElement(By.id("input-email"));
        email.sendKeys("aadi@gmail.com");
        WebElement pass=driver.findElement(By.id("input-password"));
        pass.sendKeys("aadi123");
        JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,150)","");
        WebElement bttn=driver.findElement(By.id("input-newsletter-yes"));
        bttn.click();
	}
}
