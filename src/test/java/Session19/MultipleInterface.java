package Session19;


interface ShowAge{  //1st interface created
	
	void visibleAge(int age);
}


interface ShowName extends ShowAge{  //2nd interface created and extends the ShowAge interface.
	
	void visibleName(String name);
}

public class MultipleInterface implements ShowName {  //class implements 2 interfaces here
	

	public void visibleName(String name) {
		
		System.out.println("Name is :-" + name);
	}


	public void visibleAge(int age) {
		
		System.out.println("Age is :- " + age);
	}

	public static void main(String[] args) {
		
		MultipleInterface obj=new MultipleInterface();
		obj.visibleName("Jatin");
		obj.visibleAge(29);
	

	}

	

}
