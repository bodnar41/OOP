package sorba;

public class Sorbarendezes {
	public static void main(String args[]) {
	      int[] array = {4, 3, 5, 2, 1};
	      int min,temp;
	      System.out.println( "Before Sorting:" );

	      //before sorting
	      for (int i=0; i<array.length; i++) {
	         System.out.print(array[i] +" ");
	      }
	      //sorting...
	      for (int i=0; i<array.length-1; i++) {
	          min = i;
	          for (int j=0; j<array.length; j++) {
	             if (array[j] < array[i]) {
	                min = j;
	             }
	             if (min != i) {

	               //swapping
	               temp = array[i];
	               array[i] = array[min];
	               array[min] = temp;
	}
}
}
	      System.out.println( "\nAfter Sorting:" );

	      //Array printing after sort
	      for (int i = 0; i<array.length; i++) {
	         System.out.print(array[i]+" ");
	      }
	   }
	} 