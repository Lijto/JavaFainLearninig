import java.util.Scanner;

public class FriendsAndFamily {

	public static void main(String[] args) {
	
		
	Scanner input = new Scanner(System.in);
	do {
		
		System.out.println(" \n Enter list prise: ");
		double listPrise = input.nextDouble();
		
		System.out.println("Enter discount %: ");
		int discount = input.nextInt();
		
		System.out.printf("You'll pay only $%2.2f", listPrise - listPrise*discount/100);
	} while (true);
	}

}
