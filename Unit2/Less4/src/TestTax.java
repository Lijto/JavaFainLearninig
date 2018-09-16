
public class TestTax {

	public static void main(String[] args) {
		double grossIncome; // local variables
		String state;
		int dependents;
		
		grossIncome = 50000;
		dependents = 2;
		state = "NJ";
		
		Tax t = new Tax(grossIncome, state, dependents);
		double yourTax = t.calcTax(); // calculating tax
		//printing the results
		System.out.println("Your tax is: " + yourTax + " usd");
		t.convertToEuros(yourTax);
		
		Tax t2 = new Tax(6500, "TX", 4);
		double hisTax = t2.calcTax();
		//printing results
		System.out.println("His tax is: " + hisTax + " usd");
		t2.convertToEuros(hisTax);
	}

}
