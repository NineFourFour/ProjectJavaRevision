package examQuestions;

class Alpha { 
	String getType() { 
		return "alpha"; 
	} 
} 

class Beta extends Alpha { 
	String getType() { 
		return "beta"; 
	} 
} 

public class Gamma extends Beta { 
	String getType() { 
		return "gamma"; 
	} 
	
	public static void main(String[] args) { 
		//Gamma g1 = new Alpha(); 
		//Gamma g2 = new Beta(); 
		Alpha a1 = new Beta();
		Alpha a2 = new Gamma();
		System.out.println(a1.getType() + " " + a2.getType()); 
	} 
}
