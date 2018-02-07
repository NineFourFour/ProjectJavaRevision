package chaptetOne;

class Island {
	Island i;
	int count;
	public String toString() {
		
		return "\nIsland, i = " + i+" count: "+(count +=1);
	}
}

public class IslandOfIsolation {

	public static void main(String [] args) {
		Island i2 = new Island();
		Island i3 = new Island();
		Island i4 = new Island();
		System.out.println(i2);
		i2.i = i3; // i2 refers to i3	
		System.out.println(i2);
		i3.i = i4; // i3 refers to i4
		i3=null;
		Island i5 = null;
		System.out.println(i2);
		//i4.i = i2; // i4 refers to i2

		// If I print i2, it will call the toString() and to to i3's
		// toString() which will go to i4's toString() and back to 
		// i2's toString() and go forever, causing a StackOverFlowError
		//System.out.println(i2);
		
		//i2 = null;
		//i3 = null;
		//i4 = null;
	}
}
