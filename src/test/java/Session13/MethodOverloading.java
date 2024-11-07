package Session13;

public class MethodOverloading {

	/*
	 * In method overloading, multiple methods can have
	 * same name
	 * different parameter number
	 * different parameter data type
	 */
	void add(int a, int b) {  //1st method

		System.out.println("1st Method:-" + (a+b));
	}

	void add(double a, double b) {  //2nd method

		System.out.println("2nd Method:-" + (a+b));
	}

	void add(int a, double b) {  //3rd method

		System.out.println("3rd Method:-" + (a+b));
	}


	void add(int a, int b, int c) {  //4th method

		System.out.println("4th Method:-" + (a+b+c));
	}



	public static void main(String[] args) {
//create an object of the class to call methods
		MethodOverloading obj=new MethodOverloading(); //object of the class created to call methods
		obj.add(5, 2); //1st methods will call as data given in this are int type
		obj.add(5.4,3.8);//2nd method will call as data type given are double type means decimal type
		obj.add(6, 5.3);//3rd methods will call as data type given are int  and double
		obj.add(5, 2, 7);//4th method will call as data type and int and 3 parameters are given
		




	}

}
