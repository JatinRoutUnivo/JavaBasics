 package JavaBasics;

public class Session2_Variable_Datatype_Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//Variable:- Java me Variable data container hote hai jo data ki value ko store karte hai kisi program k execution k time pe.
		//	jaise x=10, math me use karte the jisme x-variable hai and 10 value hai data ki.
		//example:- a=10, b="A", c=10.2, isme a,b,c variable hai and baki uski value hai.
		//int a =10, means int - is a data type, a -is a variable name and 10 is the value.

		//Variables ko use karne k 2 tarike  hote hai.
		//1. Declaration, 

		//int a ;   //mean int is a data type and a is a varibale which we have declared.

		//2. initialization
		//a=2; // initialize karna means ki variable ko value dena. 2 value hai.

		//Declaration & initialization

		int a =2;



		// to print
		System.out.println(a);


		int a1=12;
		double d=12.6;
		char c ='A';
		boolean b=true;
		//colour shown in purple means its a primitive data type.


		String name="Jatin";// String is a class shown in black color means its a class and non-primitive data-type. 
		// to print all 
		System.out.println(a1);
		System.out.println(d);
		System.out.println(c);
		System.out.println(b);
		System.out.println(name);

		System.out.println("------------------------------------------------------------------------------------");

		//Operators are the symbol that us used to perform operations.+,-,/,=,>,< etc are the operators.


		int a2=10;
		int b2=5;

		System.out.println(a2+b2);
		System.out.println(a2-b2);
		System.out.println(a2/b2);
		System.out.println(a2%b2);
		System.out.println(a2*b2);


		System.out.println("--------------------------Relational operators-----------------------------");		
		//Relational opertiors returs a boolean means true or false.

		System.out.println(a2==b2);  //== lagaya jata hai equeal k liye. single = assignment k liye lagaya jata hai.
		System.out.println(a2!=b2);
		System.out.println(a2>b2);
		System.out.println(a2<b2);
		System.out.println(a2>=b2);
		System.out.println(a2<=b2);












	}

}
