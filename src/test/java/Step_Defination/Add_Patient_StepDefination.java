package Step_Defination;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Add_Patient_StepDefination {
	@Given("Add the patient by fill full form")
	public void add_the_patient_by_fill_full_form() throws InterruptedException {
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
		Thread.sleep(3000);
		WebElement patient = driver.findElement(By.xpath("//*[@id=\"root\"]/div/nav/div[2]/div/div/div/div[2]/ul/a[4]/div/div[2]/span"));
		patient.click();
		Thread.sleep(3000);
		WebElement addPatient = driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/a/button/span[1]"));
		addPatient.click();
		Thread.sleep(3000);
		// fill form
		WebElement name = driver.findElement(By.name("name"));
		name.sendKeys("Xyz");
		WebElement mail = driver.findElement(By.name("email"));
		mail.sendKeys("xyz42@gmail.con");
		WebElement number = driver.findElement(By.name("phone"));
		number.sendKeys("8888888888");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div[2]/div[2]/button[2]/span[1]")).click();
		
		//General details
		Thread.sleep(3000);
		WebElement height = driver.findElement(By.name("height"));
		height.sendKeys("155");
		WebElement weight = driver.findElement(By.name("weight"));
		weight.sendKeys("55");
		WebElement gender = driver.findElement(By.xpath("//*[@id=\"mui-component-select-gender\"]"));
		gender.click();
		driver.findElement(By.xpath("//*[@id=\"menu-gender\"]/div[3]/ul/li[2]")).click();
		WebElement age = driver.findElement(By.name("age"));
		age.sendKeys("25");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(2500);
		WebElement addTest = driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div[2]/div[2]/button[2]/span[1]"));
		addTest.click();
		
		//add test
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,400)", "");
		Thread.sleep(2500);
		WebElement addequipment =driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div[1]/div[3]/div/div[1]/div/div[3]/div/div/span/button/span[1]/span"));
		addequipment.click();
		Thread.sleep(2500);
		WebElement addlab = driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div[1]/div[3]/div/div[2]/div/div/div/table/tbody/tr[1]/td[1]/div/div"));
		addlab.click();
		WebElement testequipment = driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li"));
		testequipment.click();
		WebElement ok =driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div[1]/div[3]/div/div[2]/div/div/div/table/tbody/tr[1]/td[4]/div/button[1]/span[1]/span"));
		ok.click();
		WebElement addPatients =driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div[2]/div[2]/button[2]/span[1]"));
		addPatients.click();
		
		
	}

	@Then("Sucessfully add the patient")
	public void sucessfully_add_the_patient() {
	    
	}



}
