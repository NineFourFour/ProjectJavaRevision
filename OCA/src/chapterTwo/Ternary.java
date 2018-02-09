package chapterTwo;

public class Ternary {

	public static void main(String[] args) {
		
		int x = 91;
		
		double profit = (x >= 80 && x <= 90)? 0.2: x > 90? 0.5: 0;
		
		System.out.println(profit);
		
		/* Q7 from the book */
		x = 5;
		System.out.println(x > 2 ? (((x < 4 ? 10 : 8))) : 7); // 8

		int sizeOfYard = 10;
		int numOfPets = 5;

 
		//               condition     ? "true part"    : "false part";
		String status = (numOfPets < 4)? "Pet count OK" : 
			(sizeOfYard > 8)? "Pet limit on the edge":"too many pets";
		System.out.println("Pet status is " + status);

	}

}
