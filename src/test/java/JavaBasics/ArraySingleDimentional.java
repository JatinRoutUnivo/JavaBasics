package JavaBasics;

import org.checkerframework.common.reflection.qual.ForName;

public class ArraySingleDimentional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
/*	Single dimention array
	Syntax:-1. datatype [] variablename= new datatype [size];
		//2. datatype [] variablename={10, 20, 30, 40 50};
		 Arrar declaration & instantiation
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
		
		
		int [] roll=new int[5];
		roll[0]=10; 
		roll[1]=20;
		roll[2]=30;
		roll[3]=40;
		roll[4]=50;
	
	int size = roll.length;
	System.out.println("Size of the array:-" + size);
	System.out.println("Value of 3rd employee:- " + roll[2]);
	
//	for(int i=0; i<size; i++) {
//		
//		System.out.println("Values of all 5 employees:- " + roll[i]);
//		
//	}
	
	//for each loop
//syntax:- for (datatype variable name i.e i :variable  of the array){}
	
		for(int i:roll) {
			System.out.println(i);
			
		}
		

	}
}

