package Step_Defination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Login_With_Valid_cr_StepDefination {

@Given("Login with valid username and password")
public void login_with_valid_username_and_password() throws InterruptedException {
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
    
}

@Then("Login Sucessfully.")
public void login_sucessfully() {
	System.out.println("Login Sucessfully");
    
}




}
