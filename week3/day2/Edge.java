package week3.day2;

public class Edge  extends Browser {
	    public void takeSnap() {
	        System.out.println("Taking snap now---subclass(edge)");
	    }
	    public void clearCookies() {
	        System.out.println("Clearing cookies---subclass(edge)");
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Edge edge=new Edge();
		edge.closeBrowser();
		edge.takeSnap();
		edge.clearCookies();

	}

}
