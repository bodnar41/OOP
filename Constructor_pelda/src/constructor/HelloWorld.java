package constructor;

public class HelloWorld {
	HelloWorld() { //constructor
	    System.out.println( "Object is created!" );
	  }
	public static void main(String[] args) {
	    HelloWorld obj1 = new HelloWorld();
	    HelloWorld obj2 = new HelloWorld();
	  }
	} 

