package switch_case;

import java.util.Scanner;

public class Switch_case {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Adja meg a kort: ");
		int kor = scan.nextInt();
		
		switch(kor) {
		case 10 : System.out.print("Gyerek"); break;
		case 20 : System.out.print("Fiatal felnõtt"); break;
		case 30 : System.out.print("Felnõtt"); break;
		default : System.out.print("Nem definiált kor"); break;
		}
	}

}
