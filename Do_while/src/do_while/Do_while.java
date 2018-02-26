package do_while;

public class Do_while {
	public static void main(String[] args) {
	     int count = 0;
	     int sum = 0;
	     int number = 1;
	     do {
	       System.out.println( + number + " number : " + count );
	       sum+=count;
	       count++;
	       number++;
	     } while ( count < 5 );

	    System.out.print("SUM: " + sum);
	   }
}

