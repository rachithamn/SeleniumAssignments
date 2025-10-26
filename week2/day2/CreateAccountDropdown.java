package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			//- Initialize the WebDriver (ChromeDriver).
			ChromeDriver driver=new ChromeDriver();
			//- Load the URL http://leaftaps.com/opentaps/.
			driver.get("http://leaftaps.com/opentaps/");
			//- Maximize the browser window.
			driver.manage().window().maximize();
				//- Enter a username and password.
			driver.findElement(By.id("username")).sendKeys("demosalesmanager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			//- Click the "Login" button.
			driver.findElement(By.className("decorativeSubmit")).click();
			//- Click on the "CRM/SFA" link.
			driver.findElement(By.partialLinkText("CRM")).click();
			//- Click on the "Accounts" tab.
			driver.findElement(By.linkText("Accounts")).click();
			//- Click on the "Create Account" button.
			driver.findElement(By.linkText("Create Account")).click();
			//- Enter an account name.
			driver.findElement(By.id("accountName")).sendKeys("Rachithi");
			//- Enter a description as "Selenium Automation Tester."
			driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
			//- Select "ComputerSoftware" as the industry.
			WebElement industry=driver.findElement(By.name("industryEnumId"));
			Select sl1=new Select(industry);
			sl1.selectByValue("IND_SOFTWARE");
			//- Select "S-Corporation" as ownership using SelectByVisibleText.
			WebElement ownership=driver.findElement(By.name("ownershipEnumId"));
			Select sl2=new Select(ownership);
			sl2.selectByVisibleText("S-Corporation");
			//- Select "Employee" as the source using SelectByValue.
			WebElement source=driver.findElement(By.id("dataSourceId"));
			Select sl=new Select(source);
			sl.selectByValue("LEAD_EMPLOYEE");
			//- Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex.
			WebElement marketing=driver.findElement(By.id("marketingCampaignId"));
			Select sl3=new Select(marketing);
			sl3.selectByIndex(5);
			//- Select "Texas" as the state/province using SelectByValue.
			WebElement state=driver.findElement(By.id("generalStateProvinceGeoId"));
			Select sl4=new Select(state);
			sl4.selectByValue("TX");
			//- Click the "Create Account" button.
			driver.findElement(By.className("smallSubmit")).click();
			//-Print the account name.
			WebElement createdAccountName = driver.findElement(By.xpath("//span[@class='tabletext']"));
	        String displayedAccountName = createdAccountName.getText();
	        System.out.println("Created Account Name is: " + displayedAccountName);
			
			//- Close the browser window.
	        driver.close();
			

	}

}
