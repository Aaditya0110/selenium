package CIA01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class q2 {
	public static void main(String[] args) {
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
			    driver.findElement(By.id("twotabsearchtextbox")).click();
			    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("galaxy buds pro");
			    driver.findElement(By.id("nav-search-submit-button")).click();
			    System.out.println("Products");
			    String l1=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span[6]")).getText();
			     
			     	System.out.println(l1);
			 
			     
			     
			     
			     
			     
			     
			     	String l2=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[6]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span[8]")).getText();
			     
			     	System.out.println(l2);
			    
			     String l3=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[7]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span[6]")).getText();
			    
			     	System.out.println(l3);
			    
			     String l4=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span[6]")).getText();
			     
			     	System.out.println(l4);
			    
			     String l5=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span[6]")).getText();
			     
			     	System.out.println(l5);
			     
			     driver.findElement(By.xpath("//*[@id=\"p_89/Samsung\"]/span/a/div/label/i")).click();
				   
	}
	
}
