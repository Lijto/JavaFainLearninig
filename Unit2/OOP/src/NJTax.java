
public class NJTax extends Tax {
	
	public double adjustForStudents (double tax) {
		return tax - 500;
	}
	
	
public double calTax() {
		
		if (grossIncome < 50000) {
			return grossIncome * 0.10;
		}else {
			return grossIncome * 0.13;
		}
	
	}

}
