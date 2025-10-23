package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
	/**
	 * - Instantiate the Browser driver
	 *  - Load the url https://www.facebook.com/  
	 *  - Enter the email id as testleaf.2023@gmail.com 
	 *  - Enter the password as Tuna@321 
	 *  - Click on the Login button.
	 *  -print the title of the current page
	 */
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		try {
		    Thread.sleep(3000);
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		driver.findElement(By.name("login")).click();
		System.out.println(driver.getTitle());
		

		
	}

}
