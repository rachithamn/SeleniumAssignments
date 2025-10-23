package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

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
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Rachitha");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M N");
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("lead account");
		
		WebElement sourcedd=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sl=new Select(sourcedd);
		sl.selectByIndex(4);
		WebElement marketing=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select sl1=new Select(marketing);
		sl1.selectByVisibleText("Automobile");
		WebElement corportation=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select sl2=new Select(corportation);
		sl2.selectByValue("OWN_CCORP");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		System.out.println(driver.getTitle());
		driver.close();


	}

}
