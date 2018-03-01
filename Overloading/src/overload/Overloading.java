package overload;

public class Overloading {
	public static void main(String[] args) {
		sumfactory(2, 3);
		sumfactory(4, 5, 6);
	}
	public static void sumfactory(int a, int b) {
		int c = a+b;
		System.out.println("2 int-tel: ");
		System.out.println("Összeg: " +c+ "\n");
	}
	
	public static void sumfactory(double a, double b, double c) {
		double d = a+b+c;
		System.out.println("3 double-al:");
		System.out.println("Összeg: " +d);
}
}