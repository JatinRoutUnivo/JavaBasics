package javaBasics_.JavaBasics;

public class Session08_Classes_Objects {
	
	/*OOP:- Object oriented programming.
	 * 2 types of programming languages.
	 * Structured programming language:-C, visual basics etc.
	 * Object oriented programming language:-java, C#, c++, python are OOP languages.
	 * Class:- Class is a collection of variables and methods. class is a logical entity and does not consume any space. A class can have multiple objects.
	 * 
	 * Eg:- Animal is a class and dog, cat, elephant are the objects of the class. 
	 * Objects:- objects are instance of class and occupies some space in memory. Objected are real world entity or physical entity as we can see them. Objects have some attributes and behaviors.
	 * har object ka apna attribute and behaviour hota hai.//attribute matlab ki object ka gun ya quality ya property.
	 *  An instance refers to a specific object created from a class. When a class is defined, it serves as a blueprint for creating objects. Each time an object is created from a class, that object is called an instance of that class.
	 * programming language me hum attribute ko variable kehte hai.
	 * behavior ko hum methods kehte hai.	
	 * Instance variable:- instance variable wo hote hai jo class k andar hote hai lekin method se bahar hote hai. instance variable ko compile time pe memory allocate nahi hoti hai.
	 * jab class ka object banaya jata hai run time pe tab instance variable ko memory allocate ki jaati hai.
	 * Constructor:- ek special type ka method jo tab call hota hai jab hum class ka object banate hai. class ka jo name hota hai wahi constructor ka hota hai.
	 * methods:- kisi bhi kaam k karne k tarike ko hum methods kehte hai. Method is a set of instruction or statements to perform a certain task.
	 * How to create object of class:- class ka object banane k liye hum "new" keyword ka use karte hai.
	 * Ways to initialize object/assign value to the object
	 * 1. by reference variable 
	 * 2. by methods
	 * 3. by Constructor
	 */
		

	
//-----------------------------------by reference variable--------------------------------------------------------------------
	
	
	//Instance variable:- class k andar and method se bahar
	
	String name;
	int rollno;
	
	//method
	
	void displayInformation() {  //Void jo hai wo return type hai. agar methods koi information return karta hai to uska data type void ki jagah aata hai. agar kuch return nahi karta to void use karte hai.

	System.out.println("Name:-" + name);	
	System.out.println("Roll no.:-" + rollno);// abhi value print nahi hogi because humne instance varibale ko value assign nahi ki hai. uske liye class ka object create karnba hoga.
	//class ka object main function k andar create kiya jata hai. Jab bhi code execute bkarte hai to sabse pehle main function execute hota hai.islye class ka opbject hum main function me banate hai.
	
	
		
	}
	
	
	
	public static void main(String[] args) {

		Session08_Classes_Objects student1=new 	Session08_Classes_Objects();// class ka object banaya hai. class ka naam Session08_Classes_Objects hai.
		Session08_Classes_Objects student2=new 	Session08_Classes_Objects();// 2nd object created 
		//initialize object/store data to the object student1
		
		student1.name="Jatin";
		student1.rollno=12;
	
		student2.name="KK";
		student2.rollno=13;
		
		//print information of Student 1 and student 2
		
		student1.displayInformation();
		student2.displayInformation();
		
		
		
		
	}

}
