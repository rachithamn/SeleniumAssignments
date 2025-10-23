package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instantiate the browser driver
		ChromeDriver driver=new ChromeDriver();
		//load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//maximize
		
		String title = driver.getTitle();
		System.out.println("Title is: " + title);

	}

}
