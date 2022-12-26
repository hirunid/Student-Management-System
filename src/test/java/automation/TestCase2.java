package test.java.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import pageObject.PracticeForm;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		driver.findElement(By.xpath("//h5[text()='Forms']")).click();
		
		PracticeForm form=new PracticeForm(driver);
		
		try {
			form.clickPracticeform();
		}
		 catch(Exception e) {
			 form.clickForm();
			 form.clickPracticeform();
		 }
		
		form.enterFirstname("Kelvin");
		
		form.enteremail("test@email.com");
		
		form.entergender();
		
		form.entermobileNo("9876543210");
		
		form.clickBirthday();
		
		form.selectYear("1990");
		
		form.selectMonth("November");
		
		form.clickdate();
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	
		form.enterSub("Co");
		Thread.sleep(1000);
		
		form.selectSubject("Computer Science");
		
		form.enterSub("En");
		Thread.sleep(1000);
		
		form.selectSubject("English");
		
		form.selectSport();
		
		form.selectMusic();
		
		form.clickfilebtn();
		
		form.enteraddress("‘21 Simei Road 1'","‘#04-02’","‘Singapore’","458714");
		
		form.clickwidget();
		Thread.sleep(1000);
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		form.clickState();
		Thread.sleep(1000);
		
		form.selectState("NCR");
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		form.clickCity();
		Thread.sleep(1000);
		
		form.selectCity("Noida");
		
		form.clickSubmitButton();
		Thread.sleep(3000);
		
		form.enterlastname("Lim");
		Thread.sleep(1000);
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		form.clickSubmitButton();
		
		form.clickCloseButton();
		
		driver.close();
		
		}

}

