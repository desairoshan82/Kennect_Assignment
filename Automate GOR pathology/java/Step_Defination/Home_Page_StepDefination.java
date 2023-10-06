package Step_Defination;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Home_Page_StepDefination {
	@Given("Home page should be present")
	public void home_page_should_be_present() throws InterruptedException {
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
	
	}

	@And("View a list of todos")
	public void view_a_list_of_todos() {
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div[1]/ul/li[1]/div[2]/a/span/span[1]")).click();
		Thread.sleep(2000);
		WebElement dash = driver.findElement(By.linkText("Dashboard"));
		dash.click();
	    
	}

	@And("Access the cost calculator")
	public void access_the_cost_calculator() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(2500);
		driver.findElement(By.id("patient-test")).click();
	    
	}

	@Then("Validate sucessfully")
	public void validate_sucessfully() {
	   System.out.println("View and access of cost calculator sucessfully");
	}



}
