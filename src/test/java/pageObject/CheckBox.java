package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBox {
	WebDriver driver;
	
	public CheckBox(WebDriver driver){
		this.driver=driver;
	}
	By checkBoxPanel=By.xpath("//span[text()='Check Box']");
	
	By home=By.xpath("//button[@title='Toggle']");
	
	By desktop=By.xpath("//*[@id='tree-node']/ol/li/ol/li[1]/span/button");
	
	By command=By.xpath("//span[text()='Commands']");
	
	public void checkboxclick() {
	driver.findElement(checkBoxPanel).click();
	}
	public void homeclick() {
		driver.findElement(home).click();
	}
	public void desktopclick() {
		driver.findElement(desktop).click();
	}
	public void commandclick() {
		driver.findElement(command).click();
	}
}
