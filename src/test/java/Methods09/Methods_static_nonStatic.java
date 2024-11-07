package Methods09;

public class Methods_static_nonStatic {

//------------------------------------------------------------------------------------------------------------------------------
	/*syntax of creating a method:-
	 * modifier returntype nameofmethod(parameter list){
	 *     method body
	 *   } exit of method
	 *   
	 *   static vs non-static method
	 *   static method ko hum direct method k name se call kar sakte hai main method me.
	 *   Non- static method ko  call karne k liye hume class ka object banana padta hai main method me.
	 *   
	 *   modifier:- public modifier ko hum within the package kisi bhi class me call kar sakte hai but private modifier ko hum kisi bhi class me call nahi kar sakte wnithin the package.
	 *   private modifier sirf same class me use kar sakte hai. other class me object banake call nahi kar sakte private methods ko.
	 *   
	 */
//-------------------------------------------------------------------------------------------------------------------------------------

	static void printMessage() { //static modifier liya hai. means ki is method ko call karne k liye class ka object banane ki jarurat nahi. return typoe void liya hai means ki method data return nahi karega.

		//method body
		System.out.println("Hello world"); //print statement
	} //exit point of the method.


//---------------------------------------------------------------------------------------------------------------------------------------
	
	//method to sum 2 numbers using parameter
	
	static void sum(int a, int b) {   //  static method ko hum direct method k name se call kar sakte hai main method me. int a and int b parameter hai.
		
		System.out.println("sum of a & b is :-" + (a + b));
		
	}
	
//------------------------------------------------------------------------------------------------------------------------------
	
	//method to sum 2 numbers using parameter with retun type
	
	static int sum2(int a , int b) {

		return(a+b);// returning the sum result. main method me call karenge and parameter ko argument assign karenge//exit method
		
	}
	
//-------------------------------------------------------------------------------------------------------------------------------
	
	//return minimum value
	
	static int minimum(int a , int b) {
		
		if(a<b) //if a is smaller than b
			return a; //exit method
		else //if b is smaller than a
			return b;  //exit method
		
	}
	
	

	public static void main(String[] args) {

		//call method
		printMessage();  //static method uper banaya hai, islye class ka object banane ki jarurat nahi. Direct method ko call kar sakte hai.
		sum(5, 15); //sum method me humne parameter diya hai, islye uski value yaha main method me assign hoti hai.jab hum value assign karte hai parameter ki to use argument kehte hai.
;
		int result=sum2(25, 5);  //sum karke humne variable me save kr diya or porint karwa dniya.
		System.out.println("sum2 result of a & b:- " + result);
		System.out.println(minimum(4, 8));// minimum method called. minimum valye print from the parameter. Arguments given in print statement to the parameter.
		

	}

}
