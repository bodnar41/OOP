package for_loop;

public class For_loop {
	public static void main(String[] args) {
	     int sum = 0;
	     int number = 1;
	     for(int count=0; count<5; count++) {
	       System.out.println( + number + " number : " + count );
	       sum+=count;
	       number++;
	     }
	     System.out.print("SUM: " + sum);
	   }
	} 

