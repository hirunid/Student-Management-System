package test.java.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import pageObject.BookStoreApplication;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase3 {

	public static void main(String[] args) throws NoAlertPresentException,InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		driver.findElement(By.xpath("//h5[text()='Book Store Application']")).click();
		
		BookStoreApplication bookStore=new BookStoreApplication(driver);
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		bookStore.loginPage();
		
		bookStore.enterUserNmae("KelvinLim");
		Thread.sleep(1000);
		bookStore.enterPassword("Aa@12345");
		Thread.sleep(1000);
		
		bookStore.clickLoginButton();
		Thread.sleep(1000);
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		bookStore.clickBookstoreButton();
		Thread.sleep(3000);
		
		bookStore.entersearch("speaking JavaScript");
		
		bookStore.clicksearch();
		
		bookStore.clickBookLink();
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		bookStore.clickAddCollection();
		Thread.sleep(1000);
		
		bookStore.clickAlert();
		
		bookStore.clickBacktoBookStore();
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		bookStore.loginProfile();
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		bookStore.clickDeleteBooks();
		Thread.sleep(1000);
		
		bookStore.clickOKButton();
		Thread.sleep(1000);
		
		bookStore.clickAlert();
		
		bookStore.clickLogoutButton();
		
		driver.close();

	}

}
