package chapterTwo;


public class SwitchExample {
	
	static enum Lights { RED, AMBER, GREEN };
	static Lights l2; // null
		
	public static void main(String[] args) {
		
		Lights lights = Lights.AMBER;
		l2 = Lights.GREEN;
		
		System.out.println("\n****************First switch statement");
		System.out.println(l2);
		
		switch (l2) {
		case AMBER:
			System.out.println("First swith enum lights: Drive faster");
			break;
		case GREEN:
			System.out.println("Go");
			break;
		case RED:
			System.out.println("Stop");
			break;
		default:
			System.out.println("Out of order");
			break;
		}
		System.out.println("\n****************Second switch statement");
		String dayOfWeek = "Saturday";
		System.out.println("Is it a week day? "+dayOfWeek);
		switch (dayOfWeek) {
		case "Monday":
			System.out.print("1");
		default:
			System.out.println("It's not a weekday");
		case "Tuesday":
			System.out.print("no break statement after the default so we get 2");
			break;
		case "Wednesday":
			System.out.print("3");
		case "Thursday":
			System.out.print("4");
		case "Friday":
			System.out.print("5\n");
		}
		// output: other2345
		System.out.println("\n\n\n****************Third switch statement");
		int num = 8;
		final int x = 10; // must be initialised on the same line
		
		switch (num) {
		case 2:
		//case "four":  // won't compile, must be an int or something
			// that can be implicitly cast to an int. 
		case 'b':		// 'b' is stored as 98
		case 8: 
			System.out.println("In case 8");
			System.out.println("Hello");
		case x:  // This variable must be declared as a constant
			System.out.println("even number");
			break;
		default:
			System.out.println("odd number");
			break;
		}
		System.out.println("\n****************Fourth switch statement");
		Integer num2 = new Integer(10);
		Integer num3 = 12;		// 12 is boxed into a Wrapper
		int num4 = num2;		// The Integer 10 is unboxed and the 
		                        // primitive 10 is stored in num4
				
		switch (num2) { 
		case 6:
			break;
		case 8:
			break;
		default:
			break;
		}
		
		
		byte b = 5;
		final byte value = 15;

		switch (b) {  // bics, enum and String
		case 'a':	// 97
			break;
		case 10:
			break;
		case value:
			break;
		//case 128:		// too large for a byte
		//	break;			
		default:
			break;
		}
		
		System.out.println((int)'a'); // 97
		System.out.println((int)'A'); // 65	
		
		String pet = "dog";
		switch (pet) {
		case "cat":
			System.out.println("Cat");
		default:
			System.out.println("None of the others");
		case "mouse":
			System.out.println("Mouse");
		case "snake":		
			System.out.println("Snake");
		}
		// None of the others
		// Mouse
		// Snake
		//System.out.println("a" + "b" + 3+4); // ab34
	}
}
