package inheritance;

import java.util.Scanner;

public class Employee extends Person {
	Scanner scan= new Scanner(System.in);
	int salary, hours;
	
	public void employeeInfo() {
		System.out.println("Enter your salary:");
		salary=scan.nextInt();
		System.out.println("Enter your weekly work hours:");
		hours=scan.nextInt();
	}
	
	public static void main(String [] args) {
		Employee object = new Employee();
		
		object.personInfo();
		object.employeeInfo();
	}

}
