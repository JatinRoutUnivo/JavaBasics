package Session14;

//Both child classes extending Parents classes is called Hierarchical Inheritance

class Parent{
	int a;  //class variable

	void display() {  //method

		System.out.println("class Parent:-" + a);

	}

}


class child1 extends Parent{

	int b;

	void displaychild1() {

		System.out.println("class child1:-" + b);
	}
}

class child2 extends Parent{

	int c;

	void displaychild2() {

		System.out.println("class child2:-" + c);
	}
}



public class HierarchicalInheritance {

	public static void main(String[] args) {

		child1 obj1=new child1();
		obj1.a=12;//parent class variable
		obj1.b=13; //child class variable
		
		obj1.display();//parent class method
		obj1.displaychild1();//child1 class method
		
//-------------------------------------------------------------
		child2 obj2=new child2();
		obj2.a=14;//parent class variable
		obj2.c=15;//child class variable
		
		obj2.display();//parent class method
		obj2.displaychild2();//child class methods
		


	}

}
