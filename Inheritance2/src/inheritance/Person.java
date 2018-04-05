package inheritance;

import java.util.Scanner;

public class Person {
	int ssn, age;
	Scanner scan=new Scanner(System.in);
	public void personInfo() {
		System.out.println("Enter your SSN number:");
		ssn=scan.nextInt();
		System.out.println("Enter your age:");
		age=scan.nextInt();
	}
}
