package random_number;

import java.util.Random;

public class Random_number {
public static void main(String[] args){
		
		int array[] = new int [10];
		Random rnd = new Random();
		
		//random felt�lt�s
		for(int i=0;i<array.length;i++){
			
			array[i] = rnd.nextInt(50)+1;
			//array[i] = (int)(Math.random() * 50) +1;
			//System.out.println(array[i]);
		}
		
		for(int e : array){
			System.out.println(e);
		}
		//ford�tva
		System.out.println("\n");
		for(int i=0;i<array.length;i++){
			System.out.println(array[9-i]);
		}
		//maximum p�ros keres�s
		System.out.println("\n");
		 int max=array[0];
		 int maxp = array[0];
	    
	    for(int i=0;i<array.length;i++) {
		    if(array[i]%2 ==0 && array[i] > max)
		    	maxp=array[i];
		    }
	    for(int i=0;i<array.length;i++) {
		    if(array[i]>max)
		    	max=array[i];
	    }
	    
	    System.out.println("A legnagyobb p�ros sz�m: " + maxp);
	    System.out.println("A legnagyobb sz�m: " + max);
}
}

