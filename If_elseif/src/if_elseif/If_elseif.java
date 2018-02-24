package if_elseif;

import java.util.Scanner;

public class If_elseif {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
	     int i = scan.nextInt();
	     
	     if(i == 1){
	       System.out.println( "Condition one is true!" );
	     }

	     else if(i == 2){
	       System.out.println( "Condition two is true!" );
	     }

	     else if(i == 3){
	       System.out.println( "Condition three is true!" );
	     }
	     else{
	       System.out.println( "All Conditions are false!" );
	     }
	   }
	}
