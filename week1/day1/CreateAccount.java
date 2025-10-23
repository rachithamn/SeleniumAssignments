package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		try {
		    Thread.sleep(3000);
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//password
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		//click login
		driver.findElement(By.className("decorativeSubmit")).click();
		//click crmsfa
		driver.findElement(By.partialLinkText("SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();

		//driver.findElement(By.partialLinkText("Accounts")).click();
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();

		//driver.findElement(By.partialLinkText("Create")).click();
		//driver.findElement(By.id("accountName")).sendKeys("rachitha1");
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("rachitha1");

		//driver.findElement(By.id("ext-gen618")).sendKeys("Selenium Automation Tester");
		//driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");

		driver.findElement(By.xpath("//textarea[contains(@class,'inputBox') and @name='description']")).sendKeys("Selenium Automation Tester");

		driver.findElement(By.id("numberEmployees")).sendKeys("10");
		driver.findElement(By.id("officeSiteName")).sendKeys("www.testleaf.com");

		//driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.cssSelector("input[value='Create Account']")).click();

		String title=driver.getTitle();
		System.out.println(title);
		driver.close();
		
		

		


		

	}

}
