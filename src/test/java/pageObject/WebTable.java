package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebTable {
	WebDriver driver;
	
	public WebTable(WebDriver driver) {
		this.driver=driver;
	}
	By webTable=By.xpath("//span[text()='Web Tables']");
	
	By add=By.xpath("//button[@id='addNewRecordButton']");
	
	By firstname=By.id("firstName");
	
	By lastname=By.id("lastName");
	
	By email=By.xpath("//input[@id='userEmail']");
	
	By age=By.id("age");
	
	By salary=By.id("salary");
	
	By department=By.id("department");
	
	By btnSubmit=By.xpath("//button[@id='submit']");
	
	By search=By.xpath("//input[@id='searchBox']");
	
	By edit=By.xpath("//*[@id='edit-record-4']");
	
    public void tableclick() {
		driver.findElement(webTable).click();
	}
    public void addclick() {
		driver.findElement(add).click();
	}
	public void enterfirstname(String userFirstName) {
		driver.findElement(firstname).sendKeys(userFirstName);
	}
	public void enterlastname(String userLastName) {
		driver.findElement(lastname).sendKeys(userLastName);
	}
	public void enteremail(String userEmail) {
		driver.findElement(email).sendKeys(userEmail);
	}
	public void enterage(String userAge) {
		driver.findElement(age).sendKeys(userAge);
	}
	public void entersalary(String userSalary){
		driver.findElement(salary).sendKeys(userSalary);
	}
	
	public void enterdepart(String userDepartment) {
		driver.findElement(department).sendKeys(userDepartment);
	}
	
	public void clickSubmitBtn() {
		driver.findElement(btnSubmit).click();
	}
	public void entersearch(String reName) {
		driver.findElement(search).sendKeys(reName);
	}
	public void clrsalary() {
		driver.findElement(salary).clear();
	}
	public void editbtn() {
		driver.findElement(edit).click();
	}
	public void browserclose() {
		driver.close();
	}
	
}
	
	


