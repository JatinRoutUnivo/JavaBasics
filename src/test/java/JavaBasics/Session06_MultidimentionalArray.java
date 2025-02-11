package JavaBasics;

import org.apache.commons.math3.geometry.Space;

public class Session06_MultidimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * In multidimentional array, data is stored in row and column based index (also known as matrix form).
		 * Declaration & instantiation
		 * 
		 *  datatype [][] arrayname=new datatype[row size][col size];   1st way
		 *  datatype [][] arrayname={{1,2,3},{2,3,4},{8,5,4}};   2nd way  //means 3 rows & 3 columns  
		 */
		
		//--------------------------------------1st way-----------------------------------------------------------
	/*	int [][] a=new int[3][2]; //3 rows and 2 columns
	    a[0][0]=12;//row=0, col=0
	    a[0][1]=13;//row=0, col=1
	    a[1][0]=14;//row=1, col=0
	    a[1][1]=15;//row=1, col=1
	    a[2][0]=16; //row=2, col=0
	    a[2][1]=17; //row=2, col=1
	    */
	   
		
	//--------------------------------------2nd way-----------------------------------------------------------
	    int [][]a= {{12,13},{14,15},{16,17}};
	    
	    //To know the rows of the array
	int rows = a.length;
	System.out.println("Number of rows in array:-" + rows);
	  
	//To know the length of column
int	column=a[0].length;
System.out.println("Number of column in array:- " + column);

////read and print all values of array
for (int i=0; i<rows; i++) {
	for (int j=0; j<column; j++) {
		int allrowscolumdetails = a[i][j];
		System.out.print(allrowscolumdetails + " ");
		
	}
	System.out.println();
}


}	

	   
		
		

	}


