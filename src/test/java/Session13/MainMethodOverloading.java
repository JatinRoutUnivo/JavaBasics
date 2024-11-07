package Session13;


public class MainMethodOverloading {
	
	void main(int x) {  //1st method
		System.out.println("1st main method variable x:-" + x);
	}
	
	void main(double x) {  //2nd method
		System.out.println("2nd main method variable x:-" + x);
	}
	
	void main(double x, double y) {  //3rd method
		System.out.println("3rd main method variable x:-" + x);
		System.out.println("3rd main method variable y:-" + y);
	}
	
	
//Entry point of the application
	public static void main(String[] args) {

		MainMethodOverloading obj=new MainMethodOverloading();
		obj.main(4.5);
		obj.main(12);
		obj.main(3.5, 6.3);
		
		

	}

}
