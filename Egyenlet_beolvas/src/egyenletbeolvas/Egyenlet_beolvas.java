package egyenletbeolvas;

import java.util.Scanner;

public class Egyenlet_beolvas {
	public static void main(String args[]){
		int egyutt[] = new int[3];
		double discriminant = 0;
		double x1,x2 = 0;
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		
		System.out.println("Kerem az 1. egy�tthat�t: ");
		egyutt[0] = sc.nextInt();
		
		System.out.println("Kerem az 2. egy�tthat�t: ");
		egyutt[1] = sc.nextInt();
		
		System.out.println("Kerem az 3. egy�tthat�t: ");
		egyutt[2] = sc.nextInt();
		a = egyutt[0];
		b = egyutt[1];
		c = egyutt[2];
		
		discriminant = (b * b) - 4 * a * c;
		System.out.println("Diszkrimin�ns: " +discriminant);
		
		if(discriminant<0){
			System.out.println("Nincs megold�s");
			
		} else {
			x1 = (b * (-1) + discriminant)/2 * a;
			x2 = (b * (-1) - discriminant)/2 * a;
			System.out.println("A megold�sok: x1:" +x1 + " x2:" + x2);
		}
		
		
		
	}


}
