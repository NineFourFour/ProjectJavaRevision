package chapter5ClassDesign;

class SuperClass{
	public SuperClass(int j){
		
	}
	public SuperClass(){
		
	}
}

public class SubClass extends SuperClass{
    int i, j, k;
    public SubClass( int m, int n ){  
    /*
     * compiler make a call to the no-args constructor 
     * of the superclass if their isn't one then it will 
     * no compile
     */
    	i = m ;  j = n ;  
    } //1
    public SubClass( int m )  {   super(m );   } //2
}

interface I{
	void printClass();
}
class A1 implements I{
	public void printClass(){
		System.out.println("In the A1 class");
	}
}

class B1 extends A1 {
	public void printClass(){
		System.out.println("In the A1 class");
	}
}

class C extends B{
	public static void main(String[] args) {
		A1 a = new A1();
		B1 b = new B1(); 
	
		
		/*
		 * 	upcasting
		 * 
		 * 	Parent reference to a parent object = child reference to a child object
		 * 	It is implicitly cast, or you can use a parent cast or a child cast or both
		 * 	B IsA A
		 *  A is not a B
		 */
	
		a = b;
		a = (B1)b;
		a = (A1)b;
		a = (B1)(I)b;
		a = (A1)(B1)(I)b;
		
		//downcasting
		//child reference to a child object = parent reference to a parent object
		b = (B1)a;
		B1 b1 = (B1)(I)a;
		//b = (A1)(I)a; compiler error
		
		//Animal a = new Lion(4);
		//Lion l1 = (Lion)a;
		//Parent reference = child object
		A1 a1 = new B1();
		
		//B1 b2 = (A1)a1; will not compile
		//child reference to child cast to parent reference to a child object.
		B1 b2 = (B1)a1;
		B1 b3 = (B1)(I)a1;
		//B1 b4 = (I)(B1)a1;compiler error
		//B1 b5 = (I)a1; compiler error
	}
}









