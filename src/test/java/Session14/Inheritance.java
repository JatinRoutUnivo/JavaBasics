package Session14;


class A { //Parent class
	int a;
	void display() {
		System.out.println("class A-value of variable a:- " + a);
	}

}


class B extends A { //Child class but parent class of C
	int b;
	void print() {
		System.out.println("class B-value of variable b:- " + b);
	}

}


class C extends B {  //child class of class B
	int c;
	void printc() {
		System.out.println("class C-value of variable c:-" + c);
	}

}

public class Inheritance {

	public static void main(String[] args) {

//		A objA=new A(); //object created of class A
//		objA.a=12;//value assign to variable "a"
//		objA.display();//Class A methods called
//
//		//---------------------------------------------------------------
//		B objB=new B();//object created of class B
//		objB.b=20;//value assign to variable "b"
//		objB.print();//Class B methods called
//		objB.a=21;//Class B can access to variable of class A. Hence class B assign value to variable of class A.
//		objB.display();//Class B call the methods of class A
		
//------------------Multi Level Inheritance------------------------------
		
		C objC=new C();//object created of class C. Class C can access the variable and method of class B and class A.
		
		objC.a=25;//class A variable called by class C object
		objC.b=26;//class B variable called by class C object
		objC.c=27;//class C variable called by class C object
		
		objC.display();//Class A method called by class C object
		objC.print();//Class B method called by class C object
		objC.printc();//Class C method called by class C object


	}

}
