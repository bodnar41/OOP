package overriding;

public class Walk extends Run {
	@Override // methodus felülírása gyerek osztályban
	public void show() {
		System.out.println("People are walking in the ground");
		
	}
	
	public static void main(String [] args) {
		Walk obj = new Walk();
		obj.show();
	}

}
