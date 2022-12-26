package pageObject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookStoreApplication {
	WebDriver driver;
	
	By login=By.xpath("//span[text()='Login']");
	
	By userName=By.id("userName");
	
	By userpassword=By.id("password");
	
	By loginButton=By.id("login");
	
	By bookstore=By.xpath("//span[text()='Book Store']");
	
	By search=By.id("searchBox");
	
	By searchButton=By.id("basic-addon2");
	
	By bookLink=By.xpath("//a[text()='Speaking JavaScript']");
	
	By addCollection=By.xpath("//button[text()='Add To Your Collection']");
	
	By backToBookStore=By.xpath("//button[text()='Back To Book Store']");
	
	By profile=By.xpath("//span[text()='Profile']");
	
	By deleteBooks=By.xpath("//div[@class='text-right button di']/child::button[@id='submit']");
	
	By okBtn=By.xpath("//button[text()='OK']");
	
	By logoutBtn=By.xpath("//div[@class='text-right col-md-5 col-sm-12']/button[@id='submit']");
	
	public BookStoreApplication(WebDriver driver) {
		this.driver=driver;
	}
	
	public void loginPage() {
		driver.findElement(login).click();
	}
	public void enterUserNmae(String name) {
		driver.findElement(userName).sendKeys(name);
	}
	public void enterPassword(String password) {
		driver.findElement(userpassword).sendKeys(password);
	}
	public void clickLoginButton() {
		driver.findElement(loginButton).click();
	}
	public void clickBookstoreButton() {
		driver.findElement(bookstore).click();
	}
	public void entersearch(String bookName) {
		driver.findElement(search).sendKeys(bookName);
	}
	public void clicksearch() {
		driver.findElement(searchButton).click();
	}
	public void clickBookLink() {
		driver.findElement(bookLink).click();
	}
	public void clickAddCollection() {
		driver.findElement(addCollection).click();
	}
	public void clickAlert() throws InterruptedException {
		Alert alert=driver.switchTo().alert();
		String alertMessage=alert.getText();
		System.out.println(alertMessage);
		Thread.sleep(5000);
		alert.accept();
	}
	public void clickBacktoBookStore() {
		driver.findElement(backToBookStore).click();
	}
	public void loginProfile() {
		driver.findElement(profile).click();
	}
	public void clickDeleteBooks() {
		driver.findElement(deleteBooks).click();
	}
	public void clickLogoutButton() {
		driver.findElement(logoutBtn).click();
	}
	public void clickOKButton() {
		driver.findElement(okBtn).click();
	}

}
