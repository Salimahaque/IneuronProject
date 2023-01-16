package PagesTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignupPage extends BaseTest  {

	//WebDriver driver;
	//WebDriver driver1;


	@Test(priority=1)
	public void VerifySignUpButton() {
		driver.findElement(By.xpath("//a[normalize-space()='Sign Up']")).click();	
		String expectedTile = "Add new user"; 
		String actualTile = driver.findElement(By.xpath("//body//div//h2")).getText();

		if(actualTile.equals(expectedTile)){
			System.out.println("The actual title of the sign up form equals the expected title: " + actualTile);

		}

		else  {
			System.out.println("The actual title of the sign up form  equals the expecredtiel: " + actualTile);			
		}

		Assert.assertEquals(actualTile, expectedTile);

	}

	@Test(priority=2)
	public void RegisterNewUserForm() {

		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Salima");
		driver.findElement(By.xpath("//input[@id='Surname']")).sendKeys("Haque");
		driver.findElement(By.xpath("//input[@id='E_post']")).sendKeys("lamiya100@yhaoo.com");
		driver.findElement(By.xpath("//input[@id='Mobile']")).sendKeys("222-222-2222");
		driver.findElement(By.xpath("//input[@id='Username']")).sendKeys("HB78910");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("sh1234");
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("sh1234");
		driver.findElement(By.xpath("//input[@id='submit']")).click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String expectedText = "Registration Successful"; 
		String actualText = driver.findElement(By.xpath("(//label)[8]")).getText();
		if(actualText.equals(expectedText)){
			System.out.println("The confirmation of registration test equals the: " + actualText);

		}

		else  {
			System.out.println("The confirmation of registration test is not equal the: " + actualText);			
		}

		Assert.assertEquals(actualText, expectedText);

	}

}