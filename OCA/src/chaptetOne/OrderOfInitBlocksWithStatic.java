package chaptetOne;


public class OrderOfInitBlocksWithStatic {

	public static void main(String[] args) {
		
		System.out.println(Stats.NUM);  // 999			// 3
		/*
		 * Static init block
		 * 999
		 */		
		new Stats();
		/*
		 * Member variable setting up
		 * Init block
		 * Stat's constructor
		 */
		System.out.println();
		new Stats();
		/*
		 * Member variable setting up
		 * Init block
		 * Stat's constructor
		 */
	}
}

class Stats {
	
	Mem m = new Mem();								// 4	// 7
	
	static int NUM = 10;							// 1
	
	Stats() {
		System.out.println("Stat's constructor");	// 6	// 9
	}
	
	static {										// 2
		System.out.println("Static init block");	// 2
		NUM = 999;									// 2
	}
	
	{
		System.out.println("Init block");			// 5	// 8
	}
}

class Mem {
	Mem() { System.out.println("Member variable setting up"); }
}
