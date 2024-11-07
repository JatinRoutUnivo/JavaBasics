package Session10_Constructor;

public class Myclass {
	
	String car;  //Attribute of class
	int year;
	
	//---------------------Constructor with parameter-----------------------------

	 Myclass(String CarName, int yr) {

		
		car=CarName; //nitialize attribute
		year=yr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create object of the  class
		
		Myclass obj= new Myclass("Wagonr", 2018);//Create object of the class. This will call constructor
		System.out.println(obj.car + " " + obj.year);
		
		Myclass obj1= new Myclass("Creata", 2025);
		System.out.println(obj1.car + " " + obj1.year);
		
		
		
		

	}

}
