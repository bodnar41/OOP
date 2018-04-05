package thiskeyword;

public class WithThis {

	String name;
	//constructor
	WithThis (String name){
		this.name=name;
	}

	public void show() {
		System.out.println(name);
	}
	public static void main(String [] args) {
		WithThis obj = new WithThis("onlinesad");
		obj.show();
	}
}
