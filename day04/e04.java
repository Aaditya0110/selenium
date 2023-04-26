package d04e03;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class class04 {
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeOptions co=new EdgeOptions();
	    co.addArguments("--remote-allow-origins=*");
	    WebDriver driver=new EdgeDriver(co);
	    driver.get("https://j2store.net/free/");
	    driver.manage().window().maximize();
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,1000)","");
	    driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]")).click();
	    driver.navigate().back();
	    driver.navigate().forward();
	    driver.navigate().refresh();
	    driver.close();
	}
}
