package week3.day2;

public class LoginTestData extends TestData {
	/**
	 * 
	 *  - enterUsername()
 - enterPassword()
	 */
	void enterUsername() {
		System.out.println("Enter your username");
	}
	void enterPassword() {
		System.out.println("Enter the password");
		
	}

	public static void main(String[] args) {
		LoginTestData login=new LoginTestData();
		login.enterCredentials();
		login.enterUsername();
		login.enterPassword();
		
	}

}
