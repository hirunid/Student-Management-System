package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class TextBox {
	 WebDriver driver;
	  
	 public TextBox(WebDriver driver) {
		 this.driver=driver;
	 }
	 By textbox=By.xpath("//span[text()='Text Box']");
	 
	 By name=By.id("userName");
	 
	 By email=By.id("userEmail");
	 
	 By currentaddress=By.id("currentAddress");
	 
	 By permanentaddress=By.id("permanentAddress");

	 By submitbtn=By.xpath("//button[text()='Submit']");
	 
	 public void clicktextbox() {
		 driver.findElement(textbox).click();
	 }
	 public void entername(String uname) {
		 driver.findElement(name).sendKeys(uname);
	 }
	 public void enteremail(String uemail) {
		 driver.findElement(email).sendKeys(uemail);
	 }
	 public void entercurrentaddress(String line1,String line2,String line3,String line4) {
		 driver.findElement(currentaddress).sendKeys(line1,Keys.ENTER);
		 driver.findElement(currentaddress).sendKeys(line2,Keys.ENTER);
		 driver.findElement(currentaddress).sendKeys(line3,Keys.ENTER);
		 driver.findElement(currentaddress).sendKeys(line4);
	 }
	 public void enterpermenentaddress(String line1,String line2,String line3,String line4) {
		 driver.findElement(permanentaddress).sendKeys(line1,Keys.ENTER);
		 driver.findElement(permanentaddress).sendKeys(line2,Keys.ENTER);
		 driver.findElement(permanentaddress).sendKeys(line3,Keys.ENTER);
		 driver.findElement(permanentaddress).sendKeys(line4,Keys.ENTER);
	 }
	 public void clicksubmitbtn() {
		 driver.findElement(submitbtn).click();
	 }

}
