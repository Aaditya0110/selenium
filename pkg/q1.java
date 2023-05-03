package pkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class q1 {
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
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        Thread.sleep(1500);
        if(driver.findElement(By.id("remove-sauce-labs-backpack")).isDisplayed()) 
        {
             
             System.out.println("Add to cart is working");
        }
        else {
        	System.out.print("Add to cart not working");
        }
     
       
     driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
           
     String l=driver.getCurrentUrl();
     String lt="https://www.saucedemo.com/cart.html";
     if(l.equals(lt)) {
     	System.out.println("Cart can be viewed");
     }
     else {
     	System.out.println("Cart connot be viewed");
     }
     
     driver.findElement(By.id("checkout")).click();
     if(driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).isDisplayed()) {
    	 System.out.println("Information is displayed");
     }
     else {
    	 System.out.print("Info is not displayed");
     }
     driver.findElement(By.id("first-name")).sendKeys("Aadita");
     driver.findElement(By.id("last-name")).sendKeys("B P");
     driver.findElement(By.id("postal-code")).sendKeys("602201");
     driver.findElement(By.id("continue")).click();
     
     String url2=driver.getCurrentUrl();
     String urlt2="https://www.saucedemo.com/checkout-step-two.html";
     if(url2.equals(urlt2)) {
     	System.out.println("Product overview is displayed");
     }
     else {
     	System.out.println("Product overview is not displayed");
     }
     
     System.out.println("Name:");
     List<WebElement> l1=driver.findElements(By.xpath("//*[@id=\"item_4_title_link\"]/div"));
     for(WebElement link:l1) {
     	System.out.println(link.getText()+" ");
     }
     System.out.println("Price:");
     List<WebElement> l2=driver.findElements(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[1]/div[3]/div[2]/div[2]/div"));
     for(WebElement link:l2) {
     	System.out.println(link.getText()+" ");
     }
     String aTitle="Swag Labs";
     String title=driver.getTitle();
     if(aTitle.equals(title)) {
    	 System.out.println("Title is correct");
     };
     
     String aURL="https://www.saucedemo.com/checkout-step-two.html";
     String URL=driver.getCurrentUrl();
     if(aURL.equals(URL)) {
    	 System.out.println("URl is correct");
     };
     
}

}
