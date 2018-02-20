//masodfokú egyenlet
package masodfoku;



public class Egyenlet {
	public static void main(String args[]){
		int a = 5;
		int b = 20;
		int c = 2;
		double x1,x2 = 0;
		
		double discr = 0;
		
		discr = Math.sqrt((b * b) - 4 * a * c);
		
		if(Double.isNaN(discr)){
			System.out.println("Nmo");
			
		} else {
			x1 = (b * (-1) + discr)/2 * a;
			x2 = (b * (-1) + discr)/2 * a;
			System.out.println("A megoldások: x1:" +x1 + " x2:" + x2);
		}
		
		
		
	}

}
