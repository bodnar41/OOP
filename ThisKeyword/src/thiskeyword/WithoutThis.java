package thiskeyword;

public class WithoutThis {
	String name;
	//constructor
	WithoutThis (String name){
		name=name;
	}

	public void show() {
		System.out.println(name);
	}
	public static void main(String [] args) {
		WithoutThis obj = new WithoutThis("onlinesad");
		obj.show();
	}
}

