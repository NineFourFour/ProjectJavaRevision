package casting;


interface HasTail{
	
	public boolean isTailStripped();
}

public class Lemur extends Primate implements HasTail {

		public boolean isTailStripped(){
			return false;
		}
		public int age = 10;
		
		public static void main(String[] args) {
			Lemur lemur = new Lemur();
			Primate p1 = new Primate();
			
			System.out.println(lemur.age);
			
			HasTail hastail = lemur;
			System.out.println(hastail.isTailStripped());
			
			Primate primate = lemur;
			System.out.println(primate.hasHair());
			Lemur l2 = (Lemur)primate; //cant convert from parent to child without a cast
			System.out.println(l2.age);
			//Lemur l3 = (Lemur)p1; the p1 object is Primate, different object so compiles but class cast exception 
			
			
			
			/*	hastail reference is a parent to a child object Lemur, 
			 * 	so only has access to the isTailStripped, to get to the
			 * 	instance variable age it needs to be downcasted.
			 * 
			 * 	The parent reference to a child object.
			 * 	((Lemur)hastail).age
			 * 	
			 */
			System.out.println("DownCast hastail(parent) to Lemur(child) to get age : "+((Lemur)hastail).age);
		}
}
