package JavaBasics;

public class Session03_Ifelse_switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//----------------------------------Conditional/Decision statement.-----------------------------------------
		
				//if-else and switch case are used for conditional statement and decision making
				
				/*int day=8;
				
				if(day==2) {
					System.out.println("Saurday");
					
				}
				
				else if (day==3) {
					System.out.println("Sunday");
				}
				
				else if (day==4) {
					System.out.println("Monday");
				}
				else if (day==5) {
					System.out.println("Tuesday");
				}
				
				else if (day==6) {
					System.out.println("Wednesday");
				}
				
				else if (day==7) {
					System.out.println("Thursday");
				}
				
				else if (day==8) {
					System.out.println("Friday");
				}

				else {
					System.out.println("Wrong input for the day  value");
				}
			}*/

			//switch case syntax:- 
			/* switch (expression){
			 * case value1:
			 * break;
			 * 
			 * case value2:
			 * break}  */
			
			//in switch case,  case value check and match the value mentioned mentioned in expression and execute.
			//break statement switch se exit karne k liye use kiya jata hai. agar break use nahi kiya or case value1 satisfy ho gaye to phir bhi
			//wo case value 2 par jayega check karne.
			//Default: it is used if all cases are not matched with the expression.
			
			//...........................................switch case...................................................
				
				int day=7;
				
				switch (day) {  //day is the expression 
				case 1:  //1 is the expression value
					System.out.println("Sunday");
					
					break;
				
				case 2:
					System.out.println("Monday");
					break;
					
				case 3:
				System.out.println("Tuesday");
				break;
				
				case 4:
					System.out.println("Wednesday");
					break;
					
				case 5:
					System.out.println("Thursday");
					break;
					
				case 6:
					System.out.println("Friday");
					break;
					
				case 7:
					System.out.println("Saturay");
					break;
					
					
				default:
					System.out.println("Wrong inputs for days");
					break;
				}

	}

}
