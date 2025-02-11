package Session19;


interface ShowDetails{  // interface created
	
	void Show(String name, int age); //methods are abstract. By0-default methods are public
}




public class InterfaceDemo implements ShowDetails{  //class implements interface here
	
public void Show(String name, int age) {
		
	System.out.println("Name is:- " + name);
	System.out.println("Age is:- " + age);
		
	}

	public static void main(String[] args) {

		InterfaceDemo obj=new InterfaceDemo();
		obj.Show("Jatin", 29);
		
		

	}

	
	

}
