package inheritance;

public class Child extends Parent {
	String childString = "Hey! This is a child class string.";
	
	public static void main(String [] args) {
		Child object = new Child();
		System.out.println(object.childString);
		System.out.println(object.parentString);
	}
}
