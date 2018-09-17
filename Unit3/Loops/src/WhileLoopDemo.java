
public class WhileLoopDemo {

	public static void main(String[] args) {
		
		// Create massive
		String[] friends = new String[20];
		
		// Write data into the massive
		friends[0] = "Masha";
		friends[1] = "Matilda";
		friends[2] = "Rosa";
		friends[18] = "Hillary";
		friends[19] = "Natasha";
		
		int totalElements = friends.length;
		int i = 0;
						
		//print added elements from massive without null
		while(i<totalElements) {
			
			//if(friends[i]=="Matilda") {
			//	break;
			//}
			
			//cheking for NULL data
			if(friends[i]==null) {
				i++;
				continue;
			}
			
			System.out.println("I love " + friends[i]);
			i++;
		}
		
		System.out.println("The iteration is over");

	}

}
