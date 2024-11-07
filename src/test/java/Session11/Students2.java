
package Session11;


public class Students2 {

	int roll; //non static variable
	String studentName; //non static variable
	static	String collegeName="Bharti College";//static variable
	
	public Students2(int rollno, String name) {  //constructor
		roll=rollno;
		studentName=name;
		
	}
	
	void Print() {  //Print method created to print the above data
		System.out.println(studentName + "," + roll + ", " + collegeName);
	}
	
	static void ChangeValue() {  //static mnethod created so that value of static variable can be changed.
		collegeName="Swami vivekanand Subharti College";
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Students2 obj1=new Students2(12, "Jatin");
		Students2 obj2=new Students2(13, "Deepu");
		obj1.Print();
		obj2.Print();
		
		
		System.out.println("--------------After college name change--------------------");
		ChangeValue();
		obj1.Print();
		obj2.Print();
		


	}

}
