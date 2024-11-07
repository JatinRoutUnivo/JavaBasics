package javaBasics_.JavaBasics;


public class Students08 {
	
//-------------------------------------------------by method---------------------------------------------
	
	String name;
	int rollno;
	
	void insertRecord(String Studentname, int studentRollno) {
		
		name=Studentname;
		rollno=studentRollno;
		
		System.out.println("Name:-" + name);	
		System.out.println("Roll no.:-" + rollno);
		
	}
	
	
	

	public static void main(String[] args) {
		
		//created object of class
		
		Students08 student1=new Students08();
		Students08 student2=new Students08();
		
		student1.insertRecord("Jatin", 12);
		student2.insertRecord("KK", 13);

		
		

	}

}
