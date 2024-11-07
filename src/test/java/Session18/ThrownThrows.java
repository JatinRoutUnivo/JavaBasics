package Session18;

import java.io.IOException;

public class ThrownThrows {

//thrown keyword indicates what exception type may be thrown by a method.It gives information to the programmer that there may be occur exception in this method.So, its better
	//to do exception handling in the code so that normal flow can be maintained.	

	static void CheckAge(int age) throws ArithmeticException, IOException    {  
		if(age<18) {
			
			throw new ArithmeticException("Access Denied:- Age is below 18"); //custom exception message deta hai jo hum dena chahte hai agar requirement met na ho to.
		}
		
		else {
			
			System.out.println("Access Granted");
		}
	}
	
	public static void main(String[] args) {
	try {	
		CheckAge(17);
		
	}
	catch (Exception e) {
		System.out.println(e.getMessage());
	}

	System.out.println("Rest of the codes...");
	
	}

}
