package beolvasas;

import java.util.Scanner; // import package

public class Beolvasas {
	 public static void main(String[] args) {
	     Scanner scan = new Scanner(System.in); //Syntax
	     int age;
	     String name,lname;

	     System.out.println( "Enter your first name: " );
	     name = scan.nextLine(); // For String

	     System.out.println( "Enter your last name: " );
	     lname = scan.nextLine(); // For String

	     System.out.println( "Enter your age: " );
	     age = scan.nextInt(); // For Integer

	     System.out.println( "\nYour name is: "+name+"\nYour father name is: "+lname );
	     System.out.println( "Your Age is:"+age );
	   }
	} 


