package linearis;

import java.util.Scanner;

public class Lineariskereses {
	public static void main(String[] args) {
		int[] array = {10, 20, 30, 40, 50};
		int check = -1;
		
		 System.out.println( "Enter value to find" );
	
		 Scanner scan = new Scanner(System.in);
		 	int value = scan.nextInt();
		 	
		 	for (int i = 0; i < array.length; i++) {
		        if (array[i] == value) {
		          check = i;
		       }
		     }
		     if (check == -1) {
		        System.out.println( "Value is not found in the array." );
		     }
		     else {
		        System.out.println( "Value is found." );
		     }
		   }
	}


