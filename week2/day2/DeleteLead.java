package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeleteLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instantiate webdrive
		ChromeDriver driver = new ChromeDriver();
		//load the website
	    driver.get("http://leaftaps.com/opentaps/");
	    //maximize the window
	    driver.manage().window().maximize();
	    //enter username
	    driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	    //enter password
	    driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
	    //click on submit
	    driver.findElement(By.className("decorativeSubmit")).click();
	    //click on CRM/SFA
	    driver.findElement(By.partialLinkText("SFA")).click();
	    //click on leads
	    driver.findElement(By.linkText("Leads")).click();
	    //click on find leads
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Find Leads"))).click();

	    // Click the Phone tab
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Phone']"))).click();

	    // Enter phone number
	    WebElement phoneInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("phoneNumber")));
	    //phoneInput.clear();
	    phoneInput.sendKeys("9123456789");


	    // Click the "Find Leads" button
	    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

	    // Wait until the results refresh (new lead appears)
	    WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(15));
	    wait1.until(ExpectedConditions.elementToBeClickable(
	        By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")
	    ));

	    // capture the first lead ID
	    WebElement firstLead = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
	    String newLeadID = firstLead.getText();
	    System.out.println("New Lead ID is: " + newLeadID);
	    firstLead.click();

	    driver.findElement(By.linkText("Delete")).click();

	}

}
