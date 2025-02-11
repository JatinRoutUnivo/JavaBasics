package Methods09;

public class Second_withMainmethod{


	public static void main(String[] args) {

		first_withoutMainMethod first=new first_withoutMainMethod();
	first.printWelcomeMsg("Jatin");
	String schname = first.schookname;
	System.out.println(schname);
	Methods_static_nonStatic.printMessage();//static method call kiya yaha pe class k name se
	int sumdetails = Methods_static_nonStatic.sum2(5, 3);
	System.out.println("Sum Details for testing:- " + sumdetails);
	
	
	
	}

	
		
	}
	



