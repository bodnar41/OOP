package whileexample;

public class WhileExample {
	 public static void main(String[] args) {
	     int count = 0;
	     int sum = 0;
	     int number = 1;
	     while ( count < 5 ) {
	       System.out.println( + number + " number : " + count );
	       sum+=count;
	       count++;
	       number++;
	     }
	     System.out.print("SUM: " + sum);
	   }
	} 
