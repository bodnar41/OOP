package baby;

public class Baby { //class name

	   String name = "Alen"; // member variable
	   int age = 2; // member variable
	   
	   //void method
	   void cry(){ // member method
	     System.out.println( "Baby is Crying." );
	   }
	   
	   //not void
	   public String hungry(){ // member method
	     return( "Baby is Hungry." );
	   }
	   
	   public String NevKor() {
		   return"Name: " +name+"\n" + "Age: " +age;
	   }

	   public static void main(String[] args) {
	     Baby obj = new Baby(); //creating an object
	     
	     //one way
	    /* System.out.println( "Baby name is: "+obj.name );
	     System.out.println( "Baby age is: "+obj.age );*/
	     
	     //other way
	     System.out.println(obj.NevKor());
	     
	    
	     obj.cry();
	     //not void
	     System.out.println(obj.hungry());
	   }
	} 

