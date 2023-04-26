package d05;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class e05 {
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeOptions co=new EdgeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver=new EdgeDriver(co);
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        driver.findElement(By.id("APjFqb")).sendKeys("Apple");
        driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
        String p1=driver.getWindowHandle();
        System.out.println(p1);
        String t1=driver.getTitle();
        System.out.print(t1);
        
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.google.com");
        driver.findElement(By.id("APjFqb")).sendKeys("Selenium");
        driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
        String p2=driver.getWindowHandle();
        System.out.println(p2);
        String t2=driver.getTitle();
        System.out.println(t2);
        
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.google.com");
        driver.findElement(By.id("APjFqb")).sendKeys("Cucumber");
        driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
        String p3=driver.getWindowHandle();
        System.out.println(p3);
        String t3=driver.getTitle();
        System.out.println(t3);
	}
}
