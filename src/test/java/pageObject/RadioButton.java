package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioButton {
	WebDriver driver;
	
	public RadioButton(WebDriver driver) {
		 this.driver=driver;
}
	By radioPanel=By.xpath("//span[text()='Radio Button']");
	
	By radioBtn=By.xpath("//label[@for='impressiveRadio']");
	
	public void radiobuttonclick() {
		driver.findElement(radioPanel).click();
	}
	public void radioclick() {
		driver.findElement(radioBtn).click();
	}
}