package d05;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class e04 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		EdgeOptions co=new EdgeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver=new EdgeDriver(co);
        driver.get("https://www.abhibus.com/bus-ticket-booking");
        driver.manage().window().maximize();
        WebElement l=driver.findElement(By.id("source"));
        l.sendKeys("Chennai"); 
        Thread.sleep(1500);
        l.sendKeys(Keys.ENTER);
        WebElement d=driver.findElement(By.id("destination"));
        d.sendKeys("Bangalore");
        Thread.sleep(1500);
        d.sendKeys(Keys.ENTER);
        WebElement dp=driver.findElement(By.id("datepicker1"));
        dp.click();
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].setAttribute('value','29-04-2023')",dp);
        driver.findElement(By.xpath("//*[@id=\"seo_search_btn\"]")).click();
	}
}
