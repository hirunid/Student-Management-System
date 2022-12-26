package automation;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import pageObject.CheckBox;
import pageObject.RadioButton;
import pageObject.TextBox;
import pageObject.WebTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		driver.findElement(By.xpath("//h5[text()='Elements']")).click();
		
		TextBox textBox=new TextBox(driver);
		CheckBox checkBox=new CheckBox(driver);
		RadioButton radioButton=new RadioButton(driver);
		WebTable table=new WebTable(driver);
		
		
		textBox.clicktextbox();
		
		textBox.entername("Kelvin Lim");
		
		textBox.enteremail("test@email.com");
		
		textBox.entercurrentaddress("‘21 Simei Road 1'","‘#04-02’","‘Singapore’","458714");
		
		textBox.enterpermenentaddress("‘21 Simei Road 1'","‘#04-02’","‘Singapore’","458714");
		Thread.sleep(1000);
		
		js.executeScript("window.scrollBy(0,350)");
		
		textBox.clicksubmitbtn();
		
		checkBox.checkboxclick();
		
		checkBox.homeclick();
		
		checkBox.desktopclick();
		
		checkBox.commandclick();
		Thread.sleep(1000);
		
		radioButton.radiobuttonclick();
		
		radioButton.radioclick();
		Thread.sleep(1000);
		
		table.tableclick();
		
		table.addclick();
		
		table.enterfirstname("Kelvin");
		
		table.enterlastname("Lim");
		
		table.enteremail("test@email.com");
		
		table.enterage("30");
		
		table.entersalary("25000");
		
		table.enterdepart("IT");
		Thread.sleep(1000);
		
		table.clickSubmitBtn();
		
		table.entersearch("Kelvin");
		
		table.editbtn();
		
		table.clrsalary();
		
		table.entersalary("30000");
		Thread.sleep(1000);
		
		table.clickSubmitBtn();
		
		table.browserclose();
		
		driver.close();
	}

}
