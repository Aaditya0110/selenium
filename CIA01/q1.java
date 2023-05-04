package CIA01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class q1 {
  @Test
  public void f() throws InterruptedException {
			WebDriverManager.edgedriver().setup();
			EdgeOptions co=new EdgeOptions();
		    co.addArguments("--remote-allow-origins=*");
		    WebDriver driver=new EdgeDriver(co);
		    driver.get("https://amazon.in");
		    driver.manage().window().maximize();
		    String title=driver.getTitle();
		    String tcheck="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		    System.out.println("Title: "+title);
		    if(title.equals(tcheck)) {
		    	System.out.println("correct title");
		    }
//		    String t=driver.getTitle();
		   driver.get("https://www.amazon.in/Crocs-Unisex-Bayaband-Sandal-205400-4CC/dp/B09774XHVC/?_encoding=UTF8&pd_rd_w=XDkm3&content-id=amzn1.sym.9046fe4d-1bc1-415f-a68e-9526b3dfc077&pf_rd_p=9046fe4d-1bc1-415f-a68e-9526b3dfc077&pf_rd_r=0731K4MX1QCVE0M47XV0&pd_rd_wg=6AlHu&pd_rd_r=af7a6f6f-32e0-4591-acd5-7224df0389ef&ref_=pd_gw_JWEL&th=1&psc=1");
		   if(driver.findElement(By.id("add-to-cart-button")).isDisplayed()) 
		   {
			   
			   System.out.println("Add to cart is working");
		   }
//		    driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("samsung galaxybuds pro");
		    driver.findElement(By.id("add-to-cart-button")).click();
		    if(driver.findElement(By.xpath("//*[@id=\"sw-gtc\"]/span/a")).isDisplayed()) 
			   {
				   
				   System.out.println("Checkout is working");
			   }
		    driver.findElement(By.xpath("//*[@id=\"sw-gtc\"]/span/a")).click();
//		    driver.findElement(By.name("submit.delete.ab5b2773-5857-42b1-ba63-e67423e91d60")).click();
//		    
//		    driver.get("https://www.amazon.in/Crocs-Unisex-Bayaband-Sandal-205400-4CC/dp/B09774XHVC/?_encoding=UTF8&pd_rd_w=XDkm3&content-id=amzn1.sym.9046fe4d-1bc1-415f-a68e-9526b3dfc077&pf_rd_p=9046fe4d-1bc1-415f-a68e-9526b3dfc077&pf_rd_r=0731K4MX1QCVE0M47XV0&pd_rd_wg=6AlHu&pd_rd_r=af7a6f6f-32e0-4591-acd5-7224df0389ef&ref_=pd_gw_JWEL&th=1&psc=1");
////		    driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("samsung galaxybuds pro");
//		    driver.findElement(By.id("add-to-cart-button")).click();
//		    driver.findElement(By.xpath("//*[@id=\"sw-gtc\"]/span/a")).click();
		    driver.findElement(By.id("a-autoid-0-announce")).click();
		    driver.findElement(By.id("quantity_2")).click();
		    String price=driver.findElement(By.xpath("//*[@id=\"sc-subtotal-amount-buybox\"]/span")).getText();
		    System.out.println("Price: "+price);
		    driver.findElement(By.xpath("//*[@id=\"sc-buy-box-ptc-button\"]/span/input")).click();
		    
  }
}

