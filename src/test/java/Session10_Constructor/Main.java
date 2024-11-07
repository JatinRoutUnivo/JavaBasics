package Session10_Constructor;



/*
 * A constructor in java is a special method which is used to initialize objects. The constructor is called when the object of a class is created.
 * Constructor name and class name should be same.
 * Constructor have no explicit return type.
 * A java constructor cannot be abstract, static, final.
 * Abstract:-Abstract method ki koi body nahi hoti. A method without body is called abstract method.
 * Static method me hum, main method me bina class k object banaye static method ko call kar sakte hai. static method ko hum direct method k name se call kar sakte hai main method me.
 * Final method:- Final method ko hum sub class ne overwrite nahi kar sakte.
 * Syntax of constructor:-
 */

public class Main {
	
	String	StudentName;  //Attribute of class
	int	RollNumber;
	
//---------------------Constructor without parameter-----------------------------
	
	public Main() {
	
		StudentName="Jatin Rout"; //initialize value to the attribute
		RollNumber=12;
		
	}
	
	

	public static void main(String[] args) {

		
//create object of the  class
		
		Main obj= new Main(); //this will call constructor
		System.out.println(obj.StudentName);//print value of student name
		System.out.println(obj.RollNumber);//print value of Roll number
		
		


		




	}

}
