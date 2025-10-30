package week3.day2;

public class LoginPage extends BasePage {
	/*
	 * Override the performCommonTasks() method in the LoginPage class.
- Demonstrate the concept by creating objects for both classes and calling their methods.
	 */
	@Override
	void performCommonTasks() {
		System.out.println("performance common tasks---overriden");
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("------base page------");
		BasePage base=new BasePage();
		base.clickElement();
		base.findElement();
		base.performCommonTasks();
		System.out.println("----login page-----");
		LoginPage login=new LoginPage();
		login.performCommonTasks();
		login.clickElement();
		
		

	}

}
