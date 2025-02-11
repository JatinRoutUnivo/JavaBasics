package Session15;


class Bank { //Parent class

	double	getRateOfInterest(){
		return 0.0;


	}
}

class Axis extends Bank {

	double	getRateOfInterest() {//method overriddden : method definition is same as parent class
		return 5.2;//change body but method is same like the parent class
	}

}

class Icici extends Bank {

	double	getRateOfInterest() {//method overriddden : method definition is same as parent class
		return 5.9;//change body but method is same like the parent class
	}
}

class Sbi extends Bank{

	double	getRateOfInterest() {//method overriddden : method deficition is same as parent class

		return 6.1;//change body but method is same like the parent class
	}
}

public class MethodOverriding {




	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Axis objaxisAxis=new Axis(); 
		System.out.println("Axis rate of interest:- " + objaxisAxis.getRateOfInterest() );
	    



		Icici objIcici=new Icici();
		System.out.println("ICICI rate of interest:- " + objIcici.getRateOfInterest());

		Sbi objSBI=new Sbi();
		System.out.println("SBI rate of interest:- " + objSBI.getRateOfInterest());

	}

}
