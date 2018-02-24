package if_in_if;

import java.util.Scanner;

public class If_in_if {
	
	 public static void main(String[] args) {
	     String color = "white";
	     Scanner scan = new Scanner(System.in);
	     System.out.print("Size: ");
	     int size = scan.nextInt();
	     if(size == 27){
	       
	       if("white".equals(color)){ // Inner If Condition
	         System.out.println( "Football size is 27 inches and color is White." );
	       }
	     }
	     else{
	       System.out.println( "Size is not equals to 27 inches" );
	     }
	   }
	}