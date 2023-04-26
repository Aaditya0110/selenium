package d04e03;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class class5p1 {
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeOptions co=new EdgeOptions();
	    co.addArguments("--remote-allow-origins=*");
	    WebDriver driver=new EdgeDriver(co);
	    driver.get("https://j2store.net/free/");
	    driver.manage().window().maximize();
        String l=driver.getCurrentUrl();
        String lt="https://j2store.net/free/";
        if(l.equals(lt)) {
        	System.out.println("URL1 is valid");
        }
        else {
        	System.out.println("URL1 is not valid");
        }
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,1000)","");
        driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]")).click();
        String l2=driver.getCurrentUrl();
        String lt2="https://j2store.net/free/index.php/shop?filter_catid=11";
        if(l2.equals(lt2)) {
        	System.out.print("URL2 is valid");
        }
        else {
        	System.out.print("URL2 is not valid");
        }

	}
}
