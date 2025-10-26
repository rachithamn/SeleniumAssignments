package week2.day2;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLeadPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Precondition: - Initialize the WebDriver (ChromeDriver).
		 *  - Load the URL http://leaftaps.com/opentaps/.
		 *   - Maximize the browser window. 
 
Requirements: 
 - Enter the Username as "DemoSalesManager" and the Password as "crmsfa".
  - Click on the Login Button. - Click on the CRM/SFA Link. 
  - Click on the Leads Button. - Click on Create Lead.
   - Enter the CompanyName Field Using Xpath.
    - Enter the FirstName Field Using Xpath. 
    - Enter the LastName Field Using Xpath.
     - Enter the FirstName (Local) Field Using Xpath.
      - Enter the Department Field Using any Locator of Your Choice. 
      - Enter the Description Field Using any Locator of your choice.
       - Enter your email in the E-mail address Field using the locator of your choice. 
       - Select State/Province as NewYork Using Visible Text. 
       - Click on the Create Button. 
       - Click on the edit button. - Clear the Description Field. 
       - Fill the Important Note Field with Any text.
        - Click on the update button. 
        - Get the Title of the Resulting Page.
          - Close the browser window. 
		 */
		System.setProperty("webdriver.chrome.driver", "C:\\chromefortesting\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");


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
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Rachitha");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("M N");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Rach");
		//driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("rachitha1");
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("testleaf");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("lead account");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("rachithamn2@gmail.com");
		
		//createLeadForm_generalCountryGeoId
		WebElement country=driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select sl2=new Select(country);
		sl2.selectByValue("USA");
		
		WebElement state=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sl1=new Select(state);
		sl1.selectByValue("NY");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9123456789");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Important");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		System.out.println(driver.getTitle());
		driver.close();

		
		
		
		

	}

}
