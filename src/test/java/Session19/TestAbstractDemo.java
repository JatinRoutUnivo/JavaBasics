package Session19;

public class TestAbstractDemo {

	public static void main(String[] args) {
		
		
		BikeClass obj= new TVS();
		
		obj.start(); //non-abstract methods intiated
		obj.run(); // abstrast methods initianted
		obj.stop();  //non-abstract methods intiated

		System.out.println("--------------------------------------------------------------------------------------------------");
		
		BikeClass obj1= new Yahama();
		
		obj1.start();//non-abstract methods intiated
		obj1.run(); // abstrast methods initianted
		obj1.stop();//non-abstract methods intiated
		
		System.out.println("--------------------------------------------------------------------------------------------------");
		
		BikeClass obj2= new Honda();
		
		obj2.start();//non-abstract methods intiated
		obj2.run(); // abstrast methods initianted
		obj2.stop();//non-abstract methods intiated
		
		
		
	}
	

}
