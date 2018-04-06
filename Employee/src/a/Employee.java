package a;

public class Employee {
	private String name;
	private int age;
	private int payment;
	private static int ageLimit=65;
	
	public Employee(String name, int age, int payment) {
		this.name=name;
		this.age=age;
		this.payment=payment;
	}
	
	public Employee(String name, int age) {
		this.name=name;
		this.age=age;
		this.payment=10000*age;
	}
	
	public int getEvekNyugdijig() {
		return ageLimit-this.age;
	}
	
	public String getAdatok() {
		return "N�v:"+name+"Kor:"+age+"Fizet�s:"+payment+"Nyugd�jig h�tral�v� �vek:"+getEvekNyugdijig();
	}
	
	public static void setNyugdijKorhatar(int limit) {
		ageLimit=limit;
	}
	
	public Employee getTobbEv(Employee a1, Employee a2) {
		if(a1.getEvekNyugdijig()>a2.getEvekNyugdijig())
			return a1;
		else
			return a2;
	}
}

