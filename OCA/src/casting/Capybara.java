package casting;

/*	1.	Casting an object from a subclass to a superclass doesn�t require an explicit cast.
		Animal a1 = l1; where animal is an interface and l1 is an lion object
	
	2.	Casting an object from a superclass to a subclass requires an explicit cast (Downcasting).
		Lion l1 = (Lion)a; where a is an interface Animal Reference.
		
	3.	The compiler will not allow casts to unrelated types. Classes not in the same hierarchy or 
		classes that are siblings. At the same level.
		Example, both Cat and Dog classes inherit from Animal. Dog isA Animal, Cat isA Animal but a 
		Cat is not a Dog or a Dog is not a Cat but both are an Animal.
*/
public class Capybara extends Rodent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rodent rodent = new Rodent();
		//Capybara c = (Capybara)rodent;//get a class cast exception
		Object obj = new Object();
		Capybara c1 = new Capybara();
		//c1 = (Capybara)rodent;
		c1 = (Capybara)obj;
		rodent = c1;
		
	}

}
