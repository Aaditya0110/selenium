package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class q2 {
	public static void main(String[] agrs) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
    	EdgeOptions co=new EdgeOptions();
        co.addArguments("--remote-allow-origins=*");
    	WebDriver driver=new EdgeDriver(co);
    	driver.get("https://www.saucedemo.com/checkout-step-two.html");
    	driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(1500);

    	driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
    	if(driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[1]")).isDisplayed()) 
        {
            
            System.out.println("A-Z works");
       }
       else {
       	System.out.print("A-Z not working");
       }
    	driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[1]")).click();
    	 Thread.sleep(1500);
    	
    	 String temp1=driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();
    	 System.out.println(temp1);
    	 
    	driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
    	if(driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[2]")).isDisplayed()) 
        {
            
            System.out.println("Z-A works");
       }
       else {
       	System.out.print("Z-A not working");
       }
    	driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[2]")).click();
    	 Thread.sleep(1500);
    	 String temp2=driver.findElement(By.xpath("//*[@id=\"item_3_title_link\"]/div")).getText();
    	 System.out.println(temp2);
    	 
    	
    	driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
    	if(driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[3]")).isDisplayed()) 
        {
            
            System.out.println("price high-low works");
       }
       else {
       	System.out.print("price high-low not working");
       }
    	driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[3]")).click();
    	 Thread.sleep(1500);
    	 String temp3=driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[2]/div")).getText();
    	 System.out.println(temp3);
    	
    	driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
    	if(driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[4]")).isDisplayed()) 
        {
            
            System.out.println("price low to high works");
       }
       else {
       	System.out.print("price high to low not working");
       }
    	driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[4]")).click();
    	 Thread.sleep(1500);
    	 String temp4=driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[2]/div")).getText();
    	 System.out.println(temp4);
	}
}