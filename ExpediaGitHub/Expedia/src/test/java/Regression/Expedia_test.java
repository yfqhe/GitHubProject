package Regression;

import org.testng.annotations.Test;
import Pages.Expedia_page;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Expedia_test {
public  WebDriver driver;

 
	@BeforeTest
	  @Parameters({"browser", "url"})
	   public void beforeTest(String browser,String url ) throws InterruptedException, IOException {
	 	  
	 	 browsers(browser);
	 	 driver.get(url);
	     driver.manage().window().maximize();
	     Thread.sleep(5000);
	       }

  @Test
  public void f() throws InterruptedException {
	  Expedia_page ob = new Expedia_page(driver);
	  ob.flight();
	  Thread.sleep(5000);
	 
	  ob.fromcity();
	  Thread.sleep(5000);

	  ob.tocity();
	  Thread.sleep(5000);

	  ob.date1();
	  Thread.sleep(5000);

	  ob.date2();
	  Thread.sleep(5000);

	  ob.search();
	  Thread.sleep(5000);

	  ob.trip1();
	  Thread.sleep(5000);

	  ob.select1();
	  Thread.sleep(5000);

	  ob.trip2();
	  Thread.sleep(5000);

	  ob.select2();
	  Thread.sleep(5000);

	  ob.nothanks();
	  Thread.sleep(5000);

	  ob.checkout();
	  Thread.sleep(5000);

	  ob.firstname();
	  Thread.sleep(5000);

	  ob.lastname();
	  Thread.sleep(5000);

	  ob.phone();
	  Thread.sleep(5000);

	  ob.gender();
	  Thread.sleep(5000);

	  ob.month();
	  Thread.sleep(5000);

	  ob.day();
	  Thread.sleep(5000);

	  ob.year();
  }
  
  @AfterTest
  public void afterTest() throws InterruptedException {
	  Thread.sleep(5000);
	  driver.close();
  }
public void browsers(String browser) throws IOException {
	  
	  if(browser.equalsIgnoreCase("Chrome")) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\cheri\\eclipse-workspace10\\Home_depot\\Drivers\\chromedriver.exe");
	driver=new ChromeDriver(); 
	  }
	  else if(browser.equalsIgnoreCase("firefox")) {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\cheri\\eclipse-workspace10\\Home_depot\\Drivers\\geckodriver.exe");
	driver=new FirefoxDriver();   
	  }
	  else if(browser.equalsIgnoreCase("edge")) {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\cheri\\eclipse-workspace10\\Home_depot\\Drivers\\msedgedriver.exe");
	driver=new EdgeDriver();  
	  }
	  else {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cheri\\eclipse-workspace10\\Home_depot\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();  
	  }}

}
