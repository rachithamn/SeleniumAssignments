package week3.day2;

public class HomepageTEstData extends TestData {
	void WelcomeUser() {
		System.out.println("Welcome to the home page");
	}
	void Greetings() {
		System.out.println("Hello user");
	}

	public static void main(String[] args) {
		HomepageTEstData home=new HomepageTEstData();
		home.navigateToHomePage();
		home.WelcomeUser();
		home.Greetings();
	}

}
