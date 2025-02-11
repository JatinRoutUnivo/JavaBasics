package javaBasics_.JavaBasics;

public class ArrayHighestValue {

	public static void main(String[] args) {

int [] numbers= {10,20,30,40,50,60};

		int size = numbers.length;
		System.out.println(size);
		
		 // Assume the first element is the largest
	int max = numbers[0];
	
	// Loop through the array to find the largest value. The loop starts from the second element (i = 1) and compares each element with the current max.
	for (int i=0; i<size; i++) {
		if(numbers[i]>max) { 
			max=numbers[i];
			
	
		}
		
	}
	System.out.println("The highest value in the array is:- " + max);
		
	}

}
