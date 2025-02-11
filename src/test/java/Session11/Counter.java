 package Session11;

public class Counter {
	
	//int count=0; //non-static variable, will get memory every time when object of the class is created. so, har bar jab isme plus hoga to starting 0 se hogi kyu ki non-static variable me memory har bar new assign hoti hai.
	static int count=0;//memory will be allocated only once. jab bhi object create hoga to uski value plus hogi 0 me or save ho jayegi. phir jab next object create hoga to last value jo 0 me plus hua tha, usme plus ho jayegi.
	//static variable old value ko retain karta hai.
	
	public Counter() { //constructor without parameter
		
		count++; //increment by 1.retaiN its value.
		System.out.println(count);// count = 1,2,3
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stubs
		
		Counter obj1=new Counter();
		Counter obj2=new Counter();
		Counter obj3=new Counter();
		Counter obj4=new Counter();
		Counter obj5=new Counter();
		

	}

}
