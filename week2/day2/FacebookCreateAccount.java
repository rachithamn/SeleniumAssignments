package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookCreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Precondition:
- Initialize ChromeDriver
- Load the URL https://en-gb.facebook.com/
- Maximize the browser window
- Add an implicit wait to ensure the web page elements are fully loaded
Requirements:
- Click on the Create new account button.
- Enter the First name.
- Enter the Surname.
- Enter the Mobile number or email address.
- Enter the New password.
- Handle all three dropdowns in Date of birth
- Select the radio button in Gender.

		 */
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		try {
		    Thread.sleep(3000);
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Teena");
		driver.findElement(By.name("lastname")).sendKeys("gomez");
		driver.findElement(By.name("reg_email__")).sendKeys("teena123@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("teenaR@123");
		
		WebElement date=driver.findElement(By.id("day"));
		Select sl1=new Select(date);
		sl1.selectByIndex(7);
		
		WebElement month=driver.findElement(By.id("month"));
		Select sl2=new Select(month);
		sl2.selectByValue("5");
		
		WebElement year=driver.findElement(By.id("year"));
		Select sl3=new Select(year);
		sl3.selectByVisibleText("2003");
		
		driver.findElement(By.xpath("//input[@name='sex' and @value='1']")).click();
		driver.findElement(By.name("websubmit")).click();
		System.out.println(driver.getTitle());
		
		
		
		
		

	}

}
