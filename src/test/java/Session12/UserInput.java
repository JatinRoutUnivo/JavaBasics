package Session12;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter Your Name");
		
		//create an object of the scanner class
		Scanner sc=new Scanner(System.in);
		String	Name=sc.nextLine();//use to get the String value from user
	

		System.out.println("Enter Your Age");
		int Age=sc.nextInt();//use to get the integer value

		System.out.println("Enter Your Salary");
		double salary=sc.nextDouble();//use to get the double integer value like salary




		//String Name=sc.nextLine();//use to get the String value from user
		//int Age=sc.nextInt();//use to get the integer value
		//	double salary=sc.nextDouble();//use to get the double integer value like salary

		System.out.println("User namer is"+ " " + Name);
		System.out.println("User Age is"+ " " + Age);
		System.out.println("User Salary is"+ " " + salary);




	}

}
