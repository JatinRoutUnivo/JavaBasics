package Session19;

public abstract class BikeClass {
	
	//create constructor
	BikeClass(){
		System.out.println("Bike class created under constructor.....");
	}
	
	//create abstract method
	
	abstract void run();//abstract method dosen't have body
	
	//create non-abstract method
	 void start() {
		System.out.println("Bike Started.....");
	}
	
	void stop() {
		System.out.println("Bike Stopped.....");
	}
	

}
