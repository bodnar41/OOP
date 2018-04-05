package static_variable;

public class FootballTeam {
	String name;
	int age;
	static String gender = "male";
	
	FootballTeam(String n, int a){
		name = n;
		age = a;
	}

	public void show() { 
		System.out.println("Player name: "+ name);
		System.out.println("Player age: " + age);
		System.out.println("Player gender: " + gender+"\n-----------------");
	}
	
	public static void main(String [] args) {
		FootballTeam object1 = new FootballTeam("Suarez", 22);
		FootballTeam object2 = new FootballTeam("Messi", 28);
		FootballTeam object3 = new FootballTeam("Neymar", 24);
		
		object1.show();
		object2.show();
		object3.show();
		
	}

}
