/* Azaz ki�rja a sz�mokat 10-t�l 1-ig, majd ki�rja hogy Bumm!(do while) */
package visszaszamol;

public class Visszaszamol {
	public static void main(String [] args) {
		int i=10;
		
		do {
			System.out.println(i);
			i--;
		}while(i>0);
		System.out.println("Bumm");
	}

}
