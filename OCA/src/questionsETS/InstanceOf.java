package questionsETS;

public class InstanceOf {

	public static void main(String[] args){
		A a = new A();
		B b = new B();
		
		
		if (b instanceof A)
			System.out.println("A is True");
		if (b instanceof T1)
			System.out.println("T1 is True");
		if (b instanceof T2)
			System.out.println("T2 is True");
		if (!(a instanceof B))
			System.out.println("True");
		else
			System.out.println("a is not B");
		if (!( !(a instanceof A) || (a instanceof B)))
			System.out.println("a is not B");
		
	}

}
 
class A implements T1, T2{} 
class B extends A{} 
interface T1 { } 
interface T2 { }