package JavaBasics;

public class Session05_SinlgedimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Arrays are used to store multiple values in a single variable. Java array is an object which contains elements of a similar data type.
		 * for ex:- if we want to store salary of 5 employees.
		 * advantages:- 1st:- code optimization:-we can retrive  or sort the data efficiently.
		 * 
		 * Array declaration & instantiation
		 * Declaration:- datatype [] arrayrefvariable;
		 * 
		 * instantiation
		 * arrayrefvariable=new datatype [size];
		 * 
		 * combining declaration & instantiation
		 * 1st way:-datatype[] arrayRefvariable=new datatype[size];
		 * for example:- int[] a=new int[5];
		 * 
		 * 2nd way:- datatype[] arrayRefvariable={10,20,30,40,50};  // yaha humne direct value assign kar diya hai array ko declare karne k baad.
		 */
			
				//1st way
				
//			int [] roll=new int[5];	
//			roll[0]=12; //1st element
//			roll[1]=22; //2nd element
//			roll[2]=32; //3rd element
//			roll[3]=45; //4th element
//			roll[4]=25; //5th element
			
			
			//2nd way
			
			int [] roll= {12,22,32,45,25};
			
			
			//to know the size of an array we use length property
			int size = roll.length;
			System.out.println("size of an array:- " + size);
			
			
			
			//to read the value of an array
			System.out.println("Value of an 4th element array:- " + roll[3]);
			
			
			
			//to print all the values of the array. we will use for loop as we know the limit of the loop.
			for(int i=0; i<size; i++) {
				
				System.out.println("All values of an array:-" + roll[i]);

				
			}
		//-----------------------------------------for each loop------------------------------------------------------	
			//for each loop-= enhanced loop
			//syntax:- for(datatype variable name i.e i : variable of array i.e roll)
			
			//roll first element 12 ki value ko store karega and assign kr dega i ko. uske baad 22 ko store karega and assign kr dega i ko.
			//is tara last element tak jaega and sab print kar dega.
			
			for(int i:roll) {
				System.out.println(i);
			}
			

	}

}
