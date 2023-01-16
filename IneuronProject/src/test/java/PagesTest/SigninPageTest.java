package PagesTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SigninPageTest extends BaseTest{
	
	@Test
	public void VerifyloginButton() {
		driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
		String actualTile = driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText();
		//driver.findElement(By.xpath("")).click();	
		String expectedTile = "LOGIN"; 
		//String actualTile = driver.findElement(By.xpath("")).getText();
	    
		if(actualTile.equals(expectedTile)){
		System.out.println("The actual title of the sign in  form equals the expected title: " + actualTile);
	    
	    }
	    
		else  {
			System.out.println("The actual title of the sign in form  is not equals the expecredtiel: " + actualTile);			
		}
		
		Assert.assertEquals(actualTile, expectedTile);
		
		}
	@Test(priority=2)
	public void LoginPage() {

		driver.findElement(By.xpath("//input[@id='Username']")).sendKeys("AT78910");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("sh1234");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		String expectedUsrValidation = "Welcome AT78910";
		String userValidation = driver.findElement(By.xpath("(//h3)[1]")).getText();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(userValidation.equals(expectedUsrValidation)){
			System.out.println("User Validation test equals: " + userValidation);
		}

		else  {
			System.out.println("User Validation test is not equal : " + userValidation);			
		}

		Assert.assertEquals(userValidation, expectedUsrValidation);

	}

	}
	


