package Session13;

public class ConstructorOverloading {
	
	/*same like method overloading. multiple constructor can have
	 * same name
	 * different parameter number
	 * different parameter data type
	 */
	
	ConstructorOverloading(int x){  //1st constructor
		System.out.println(x);
		
	}
	

	ConstructorOverloading(double x){  //2nd constructor
		System.out.println(x);
		
	}

	ConstructorOverloading(double x, double y){  //3rd constructor
		System.out.println("x:- " + x);
		System.out.println("y:-" + y);
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorOverloading obj1=new ConstructorOverloading(5);//1st constructor will invoke as int data type given in this
		ConstructorOverloading obj2=new ConstructorOverloading(5.2); //2nd constructor will invoke as double data type given in this
		ConstructorOverloading obj3=new ConstructorOverloading(2.5, 6.8);//3rd constructor will invoke as 2 double data type given in this
		
		

	}

}
