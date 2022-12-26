package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



public class PracticeForm {
	WebDriver driver;
	
	By form=By.xpath("//div[text()='Forms']");
	
	By pracForm=By.xpath("//span[text()='Practice Form']");
	
	By firstname=By.xpath("//input[@id='firstName']");
	
	By lastname=By.xpath("//input[@id='lastName']");
	
	By email=By.xpath("//input[@id='userEmail']");
	
	By gender=By.xpath("//label[text()='Male']");
	
	By no=By.xpath("//input[@id='userNumber']");
	
	By birthday=By.id("dateOfBirthInput");
	
	By year=By.xpath("//select[@class='react-datepicker__year-select']");
	
	By month=By.xpath("//select[@class='react-datepicker__month-select']");
	
	By date=By.xpath("//div[text()='18']");
	
	By subjectBox=By.xpath("//input[@id='subjectsInput']");
	
	By sport=By.xpath("//label[@for='hobbies-checkbox-1']");
	
	By music=By.xpath("//label[@for='hobbies-checkbox-3']");
	
	By fileButton=By.xpath("//input[@id='uploadPicture']");
	
	By address=By.id("currentAddress");
	
	By widget=By.xpath("//div[text()='Widgets']");
	
	By state=By.xpath("//div[normalize-space()='Select State']");
	
	By city=By.xpath("//div[normalize-space()='Select City']");
	
	By submitButton=By.xpath("//button[@id='submit']");
	
	By closeButton=By.xpath("//button[@id='closeLargeModal']");
	
	public PracticeForm(WebDriver driver){
		this.driver=driver;
		}
	
	public void clickForm() {
		driver.findElement(pracForm).click();
	}
	
	public void clickPracticeform() {
		driver.findElement(pracForm).click();
	}
	public void enterFirstname(String UserFname) {
		driver.findElement(firstname).sendKeys(UserFname);
	}
	public void enterlastname(String UserLname){
		driver.findElement(lastname).sendKeys(UserLname);
	}
	public void enteremail(String Usermail){
		driver.findElement(email).sendKeys(Usermail);
	}
	public void entergender(){
		driver.findElement(gender).click();
	}
	public void entermobileNo(String userNo){
		driver.findElement(no).sendKeys(userNo);
	}
	public void clickBirthday(){
		driver.findElement(birthday).click();
	}
	public void selectYear(String value) {
        Select drop = new Select(driver.findElement(year));
        drop.selectByValue(value);
    }
	public void selectMonth(String text) {
        Select drop = new Select(driver.findElement(month));
        drop.selectByVisibleText(text);
    }
	public void clickdate(){
		driver.findElement(date).click();
	}
	public void enterSub(String subject){
		driver.findElement(subjectBox).sendKeys(subject);
	}
	
	public void selectSubject(String subject){
		List<WebElement>list=driver.findElements(By.xpath("//div[contains(@class,'subjects-auto-complete__option')]"));
		System.out.println("Size of auto suggestion subjects "+list.size());
		for(WebElement listItem:list) {
			if(listItem.getText().equals(subject)){
			listItem.click();
			break;
			}
		}
	}
	public void selectSport() {
        driver.findElement(sport).click();
	}
	public void selectMusic() {
        driver.findElement(music).click();
	}

	public void clickfilebtn() {
        driver.findElement(fileButton).sendKeys("C:\\Users\\Hiruni\\Desktop\\Selenium\\Kelvin Lim.jpg");
    }
	
	public void enteraddress(String line1,String line2,String line3,String line4) {
		 driver.findElement(address).sendKeys(line1,Keys.ENTER);
		 driver.findElement(address).sendKeys(line2,Keys.ENTER);
		 driver.findElement(address).sendKeys(line3,Keys.ENTER);
		 driver.findElement(address).sendKeys(line4);
	 }
	public void clickwidget() {
        driver.findElement(widget).click();
	}
	public void clickState() {
        driver.findElement(state).click();
	}
	public void selectState(String state) {
		List<WebElement>list=driver.findElements(By.xpath("//div[contains(@id,'react-select-3-option')]"));
		System.out.println("Size of auto suggestion states "+list.size());
		for(WebElement listItem:list) {
			if(listItem.getText().equals(state)){
			listItem.click();
			break;
			}
		}
	}
	public void clickCity() {
        driver.findElement(city).click();
	}
	public void selectCity(String city) {
		List<WebElement>list=driver.findElements(By.xpath("//div[contains(@id,'react-select-4-option-')]"));
		System.out.println("Size of auto suggestion cities "+list.size());
		for(WebElement listItem:list) {
			if(listItem.getText().equals(city)){
			listItem.click();
			break;
			}
		}
	}
	public void clickSubmitButton() {
		driver.findElement(submitButton).click();
	}
	public void clickCloseButton() {
		driver.findElement(closeButton).click();
	}
	
}