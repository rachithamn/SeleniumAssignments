package week3.day2;

public class Browser {
	 String browserName = "chrome";
     double browserVersion = 131.0;

     public void openURL() {
         System.out.println(browserName + " are opening now----superclass(browser)");
     }

     public void closeBrowser() {
         System.out.println("Browser is closing--superclass(browser)");
     }
     public void navigateBack() {
         System.out.println("Navigating back");
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
