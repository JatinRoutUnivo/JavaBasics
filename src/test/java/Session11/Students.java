package Session11;

public class Students {

	int rollno;  //non-static variable, unique for each student 
	String studentName; ////non-static variable, unique for each student 
	static String collegeName="Swami Vivekanana University";//static variable, memory allocated only once during the class loading


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Students student1=new Students();

		student1.rollno=12;
		student1.studentName="Jatin Rout";

		System.out.println(student1.studentName + ", " + student1.rollno + ", " + student1.collegeName);

		Students student2=new Students();

		student2.rollno=13;
		student2.studentName="Deepu";

		System.out.println(student2.studentName + ", " + student2.rollno + ", " + student2.collegeName);


		Students student3=new Students();

		student3.rollno=14;
		student3.studentName="Jeetu";

		System.out.println(student3.studentName + ", " + student3.rollno + ", " + student3.collegeName);


	}

}
