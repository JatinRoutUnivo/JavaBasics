package Session17;

public class ExceptionHandling {

	public static void main(String[] args) {

		//----------------------------Arithmatic exception---------------------------------	

		/*
		try {  //  we have used try and catch to handle the exception so that the during the run time, execution of the codes dosen't stop.
		int result=100/0; //in java division by 0 is not allowed. The JVM does not allow division by zero to prevent undefined behavior in your program

		}
		catch (ArithmeticException e) {
			System.out.println(e.toString());
		}



		System.out.println("Hello World");

		 */

		//---------------------Nullpointer exception---------------------------------		
		/*	
		try {
		String s=null;
		System.out.println(s.length());
	}
	catch(NullPointerException e) {
		System.out.println(e.toString());

	}

		System.out.println("Hello World");

		 */


		//-----------------------Number format exception---------------------------

		/*	
		try {
		String s="abc";
		int i=Integer.parseInt(s);
		System.out.println(i);
		}
		catch(NumberFormatException e) {
			System.out.println(e.toString());
		}
		System.out.println("Hello World");

		 */


		//----------------------Array Index out of bound exception-------------------------------
		try {
			int [] a=new int[5];
			a[4]=20;
			System.out.println(a[4]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
		}
		finally {
			
			System.out.println("finally block executed");
		}

		



	}

}
