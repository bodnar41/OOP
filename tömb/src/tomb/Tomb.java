package tomb;

public class Tomb {
	public static void main(String[] args){
		int[] tomb = new int[10];
		
		for(int i=0;i<tomb.length;i++) {
			tomb[i] = i+1;
			System.out.println("Az " + i + ".elem: " + tomb[i]);
		}
		
		int max= tomb[0];
		for(int i=0;i<tomb.length;i++){
		
			if(tomb[i] > max) 
				max=i;
		
	}
		System.out.println("A tomb maximuma: " + tomb[max]);
		
		
		int keresett = 5;
		for(int i=0;i<tomb.length;i++) {
			if(tomb[i] == keresett) {
				System.out.println("Van benne");
			}else
				System.out.println("Nincs benne");
		}
	}

	
}