package Step_Defination;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Cost_Calculator_StepDefination {
	@Given("Cost calculater should present and validate the discount.")
	public void cost_calculater_should_present_and_validate_the_discount() throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","G:\\Automation Testing\\Automation Testing\\Selinium\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://gor-pathology.web.app/dashboard");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//Email
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("test@kennect.io");
		//Password
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Qwerty@1234");
		//Login
		WebElement login = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/form/button[1]/span[1]"));
		login.click();
		Thread.sleep(2500);
		
		//Access cost calculator
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(2500);
		
		driver.findElement(By.id("patient-test")).click();
		driver.findElement(By.id("patient-test")).sendKeys("VITAMIN B12, SERUM - 900₹");
		driver.findElement(By.id("patient-test")).sendKeys(Keys.ENTER);
		
		WebElement discount = driver.findElement(By.cssSelector("div[class=\"MuiSelect-root MuiSelect-select MuiSelect-selectMenu MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input\"]"));
		discount.click();
		WebElement five = driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[2]"));
		five.click();
	    
	}

	@Then("Apply discount sucessfully and show accurate cost")
	public void apply_discount_sucessfully_and_show_accurate_cost() {
	    System.out.println("Apply sucessfully discount");
	}



}
