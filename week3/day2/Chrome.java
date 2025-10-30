package week3.day2;



public class Chrome  extends Browser {
    public void openIncognito() {
        System.out.println("Entering incognito mode now-----subclass(chrome)");
    }
    public void clearCache() {
        System.out.println("Clearing cache----subclass(chrome)");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chrome chrome=new Chrome();
		chrome.openURL();
		chrome.openIncognito();
		chrome.clearCache();
	}

}
