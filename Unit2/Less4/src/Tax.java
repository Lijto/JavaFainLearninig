
public class Tax {
	double grossIncome; //class member variables
	String state;
	int dependents;
	static int costumerCounter;
	
	
	//constructor
	Tax (double gi, String st, int depen){
		grossIncome = gi; //member variable initialization
		state = st;
		dependents = depen;
		costumerCounter++;
		System.out.println("Prepairing the tax for costumer# " + costumerCounter);
	}
	
	double calcTax(){
		return (grossIncome*0.33 - dependents*100);
	}
	
	public static void convertToEuros(double taxInDollars) {
		System.out.println("Tax in euros: " + taxInDollars/1.25);
	}
	
}
