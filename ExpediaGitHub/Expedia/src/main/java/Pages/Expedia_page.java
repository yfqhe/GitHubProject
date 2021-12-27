package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Expedia_page {
public static WebDriver driver;
	
	@FindBy(xpath="(//*[@class='uitk-tab-anchor'])[1]") WebElement flight;
	@FindBy(xpath="(//*[@class='uitk-fake-input uitk-form-field-trigger'])[1]") WebElement fromcity;
	@FindBy(xpath="(//*[@class='uitk-fake-input uitk-form-field-trigger'])[2]") WebElement tocity;
	@FindBy(xpath="//*[@aria-label='Departing January 2, 2022']") WebElement date1;
	@FindBy(xpath="//*[@aria-label='Returning January 5, 2022']") WebElement date2;
	@FindBy(xpath="//*[text()='Search']") WebElement search;
	@FindBy(xpath="(//*[@class='uitk-card-link'])[1]") WebElement trip1;
	@FindBy(xpath="(//*[@aria-label='Select Economy for $121'])[1]") WebElement select1;
	@FindBy(xpath="(//*[@class='uitk-card-link'])[1]") WebElement trip2;
	@FindBy(xpath="(//*[@aria-label='Select Economy for $121'])[1]") WebElement select2;
	@FindBy(xpath="//*[@aria-label='No thanks. Opens in a new tab']") WebElement nothanks;
	@FindBy(xpath="//*[text()='Check out']") WebElement checkout;
	@FindBy(xpath="//*[text()='Check out']") WebElement firstname;
	@FindBy(xpath="(//*[@type='text'])[8]") WebElement lastname;
	@FindBy(xpath="(//*[@type='tel'])[1]") WebElement phone;
	@FindBy(xpath="(//*[@type='radio'])[1]") WebElement gender;
	@FindBy(xpath="(//*[@class='cko-field date-of-birth-month compound-validation main-traveler'])[1]") WebElement month;
	@FindBy(xpath="(//*[@class='cko-field date-of-birth-day compound-validation main-traveler'])[1]") WebElement day;
	@FindBy(xpath="(//*[@class='cko-field date-of-birth-year compound-validation main-traveler'])[1]") WebElement year;
	
	public Expedia_page(WebDriver driver) {
		  Expedia_page.driver=driver;
	  	  PageFactory.initElements(driver, this);
	  	}
	public void flight() {
		flight.click();
	}
	public void fromcity() {
		fromcity.sendKeys("Philadelphia, PA (PHL-Philadelphia Intl.)");
	}
	public void tocity() {
		tocity.sendKeys("Miami, FL (MIA-Miami Intl.)");
	}
	public void date1() {
		date1.click();
	}
	public void date2() {
		date2.click();
	}
	public void search() {
		search.click();
	}
	public void trip1() {
		trip1.click();
	}
	public void select1() {
		select1.click();
	}
	public void trip2() {
		trip2.click();
	}
	public void select2() {
		select2.click();
	}
	public void nothanks() {
		nothanks.click();
	}
	public void checkout() {
		checkout.click();
	}
	public void firstname() {
		firstname.sendKeys("john");
	}
	public void lastname() {
		lastname.sendKeys("smith");
	}
	public void phone() {
		phone.sendKeys("2159997863");
	}
	public void gender() {
		gender.click();
	}
	public void month() {
		Select obj=new Select (month);
	    obj.selectByVisibleText("Dec");
	}
	public void day() {
		Select obj1=new Select (day);
	    obj1.selectByValue("15");
	}
	public void year() {
		Select obj2=new Select (year);
	    obj2.selectByValue("1990");
	       
	}

}
