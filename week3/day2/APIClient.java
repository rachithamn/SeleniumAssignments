package week3.day2;

public class APIClient {
	void sendRequest(String endpoint) {
		System.out.println(endpoint);
		
	}
void sendRequest(String endpoint, String requestBody, Boolean requestStatus) {
	System.out.println(endpoint);
	System.out.println(requestBody);
	System.out.println("status of your request is"+ requestStatus);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Assignment Details:
Create a Java class named APIClient and create two methods with the same name passing different input arguments.
            METHODOVERLOADING
		 */
		APIClient api=new APIClient();
		api.sendRequest("https://api.example.com/login");
		api.sendRequest("https://api.example.com/signup", "Rachitha", true);
		
	}

}
