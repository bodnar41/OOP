package method;

public class StaticMethod {
	String name;
	int age;
	static String gender = "Male";
	static String team_name;
	
	StaticMethod(String n, int a){
		age=a;
		name=n;
	}
//static method
	static void team() {
		team_name="csapat";
	}
	public void show() {
		System.out.println("Team name: "+ team_name);
		System.out.println("Player name: "+ name);
		System.out.println("Player age: " + age);
		System.out.println("Player gender: " + gender+"\n--------------");
	}
	
	public static void main(String [] args) {
		StaticMethod.team();
		StaticMethod object1= new StaticMethod("Suarez", 22);
		StaticMethod object2= new StaticMethod("Messi", 28);
		StaticMethod object3= new StaticMethod("Neymar", 24);
		
		object1.show();
		object2.show();
		object3.show();
	}
}
