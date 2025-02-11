package JavaBasics;

public class Session04_While_for_Dowhileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 ...........................................Loops/iterative statement---------------------------------------------
		 
		 syntax:- While(condition){
		   code to be executed when the conditions is true;
		   increment/decrement expression
		 }
		 		
		 /*
		  * for loop:- Hum tab use karte hai jab hume loop ki limit pata hai ki kitni bar iterate karna hai.
		  * jab hume loop ki limit nahi pata hoti tab hum while and do while loop ka use karte hai.
		  */
		  		
		 
		 		
		 		
		 		
		 
				//print integer value from 1-10 using while loop.
			/*	
				int i=1; //initialisation
				
				while (i<=10) {  //conditions
					
					System.out.println("Value of i:" + i);
					i++;   // we have used i++ to add value to i in incremental order// increment or dcrement expression
					//agar hum i++ nahi mention karenge to conition always true rahegi bcoz i less than 10 hai and print hota rahega infinite times.
					
				}
				
				System.out.println("While loop exits. Valie of i is:" + i);
			}

			*/
		//-------------------------------------Do while loop-------------------------------------------------------------
			
			/*
			 * do {
			 * code to be executed
			 * increment/decrement expression
			 * }
			 * While (condition);	
			 * 
			 * do while loop minimum 1 time to execute hota he hai bcoz isme hum condition ko baad me check kr rahe hai jabki while loop me hum condition 
			 * ko pehle check kar rahe hai so code jaruri nahi ki ek bar execute ho agar condition match nahi kar rahe hai to.
			 * 
			 */
			
				/*
			int i=1;
			
			do {
				
				System.out.println("Value of i:" + i);
				i++;
			} 
			
			while(i<=10);
			
			
			
			
			} 
			*/
			
			
			
			//We have used 3 statements while using while and do while loop
			 //1. initialization
			//2. conditions check
			//3. incremental / decremental of expression
			
		//------------------------------------For Loop---------------------------------------------
			/*
			 * for (initialization; condition; increment/decrement of expression){
			 * code to be executed
			 * }
			 * 
			*/
			
			for(int i=1; i<=10; i++) {
				
				
				if(i==5)   // iska use islye hua hai ki agar condition true ho jaati hai to rest execute nahi honge.
					break; //loop ko stop karne k liye condition lagakar ue kiya hai.
				//continue;  // is se loop continue rehta haicondition true milne k baad bhi
				
				
				System.out.println("Value of i:-" + i);
				
			}
			
			//break command we use if we want to exit from the loop if the condition is true.
			
			

	}

}
