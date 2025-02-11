package javaBasics_.JavaBasics;


public class Students08 {
	
//-------------------------------------------------by method---------------------------------------------

	
	void insertRecord(String Studentname, int studentRollno) {
		
		
		
		System.out.println("Name:-" + Studentname);	
		System.out.println("Roll no.:-" + studentRollno);
		
	}
	
	
	

	public static void main(String[] args) {
		
		//created object of class
		
		Students08 student1=new Students08();
		Students08 student2=new Students08();
		
		student1.insertRecord("Jatin", 12);
		student2.insertRecord("Rout", 13);

		
		

	}

}
