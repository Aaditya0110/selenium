package day10;


import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.github.bonigarcia.wdm.WebDriverManager;


	public class e01 {
		static ExtentTest test;
		static ExtentReports extent;
		ExtentHtmlReporter htmlReporter;
		String sstloc="C:\\Users\\vhari\\Desktop\\scr\\scrsht.png";
		@BeforeClass
		public void startReport() {
			//ExtentSparkReporter htmlReporter = new ExtentSparkReporter("extentReport.html");
			//htmlReporter =  new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/extentReport.html");
			htmlReporter =  new ExtentHtmlReporter("C:\\Users\\vhari\\Desktop\\scr\\extr.html");
			extent = new ExtentReports();
			extent.attachReporter(htmlReporter);
			
			//configuration items to change the look and feel
	        //add content, manage tests etc
	        htmlReporter.config().setChartVisibilityOnOpen(true);
	        htmlReporter.config().setDocumentTitle("Simple Automation Report");
	        htmlReporter.config().setReportName("Test Report");
	        htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
	        htmlReporter.config().setTheme(Theme.STANDARD);
	       // htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
		}
		@Test(groups = "smoketest")
		  public void test1() {
			test = extent.createTest("Test Case 1", "The test case 1 has passed");
			  WebDriverManager.chromedriver().setup();
				ChromeOptions co=new ChromeOptions();
				co.addArguments("--remote-allow-origins=*");
				WebDriver driver=new ChromeDriver();
				driver.navigate().to("https://godaddy.com/");
				driver.manage().window().maximize();
				Assert.assertEquals(driver.getTitle(), "Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN");
				Assert.assertEquals(driver.getCurrentUrl(), "https://www.godaddy.com/en-in");
		  }
		
	 
	  

	  @AfterMethod
	  public void getResult(ITestResult result) throws AWTException, IOException {
		  if(result.getStatus() == ITestResult.FAILURE) {
			  screencapture(sstloc);
	          test.log(Status.FAIL,result.getThrowable());
	          test.addScreenCaptureFromPath(sstloc);
	      }
	      else if(result.getStatus() == ITestResult.SUCCESS) {
	          test.log(Status.PASS, result.getTestName());
	          
	      }
	      else {
	          test.log(Status.SKIP, result.getTestName());
	      }
	  }
	  void screencapture(String sstloc1) throws AWTException, IOException
	  {
		  Robot robot=new Robot();
	       Dimension scr_size=Toolkit.getDefaultToolkit().getScreenSize();
	       Rectangle rect=new Rectangle(scr_size);
	       BufferedImage scrshot=robot.createScreenCapture(rect);
	       File dest=new File(sstloc1);
	       ImageIO.write(scrshot,"png",dest);
	  }
	  @AfterTest
	  public void tearDown() {
	      //to write or update test information to reporter
	      extent.flush();
	  }

	

}