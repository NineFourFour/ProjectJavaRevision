package casting;

public class Z extends X {
	
	public static void main(String[] args) {
		
		X x = new X();
		Y y = new Y();
		Z z = new Z();

		//Parent = Child
		X xy = new Y();
		X xz = new Z();
		
		//Child = Parent
		//Y yx = new X();
		//Z zx = new X();can't convert from X to Z

		//Type mismatch: cannot convert from Z to Y, siblings.
		//Y yz = new Z();
		
		//Parent reference to child object
		X x1 = y;
		X x2 = z;
		
		/*  compile but gives a class cast exception at runtime
		 *	the reference doesn't match the object, 
		 * 	casting a reference with the same type of object 
		 * 	to a reference of a different type of object
		 */
		//Y y1 = (Y)x;
		//Z z1 = (Z)x;
	
		/*	
		 * 	x1 reference points to a Y reference in turn points to a Y object. 
		 * 	x2 reference points to a Z reference in turn points to a Z object. 
		 *  compiles and no exception at runtime
		 */
		Y y2 = (Y)x1;
		Z z2 = (Z)x2;
		
		/*
		 * 		Z z = new Z();
		 * 		Y cast to a Z object, compiles but class cast exception
		 * 		
		 */
		Object o = z;
		//Object o1 = (Y) o; // compiles ok but produces runtime error
		
		Object o2 = (Z) o; /*
		 					*	compiles with no runtime error ok
		 					*/
		Object o3 = new Object();
		//X x3 = o3; will not compile child == parent 
		//X x3 = (X)o3; compiles ok but you get a class cast exception
		//java.lang.Object cannot be cast to casting.X
		
		
		
		
		
		
		
		
		
	}
}
