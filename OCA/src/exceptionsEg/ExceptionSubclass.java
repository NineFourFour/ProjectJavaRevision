package exceptionsEg;

class E1 extends Exception{}
class E2 extends E1{}

class A{
	public String m()throws Exception{
		throw new Exception();	
		
	}
}
class B extends A{
	public String m(){
		return "M in the B class";
	}
}
public class ExceptionSubclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			throw new E2();
		}catch(E2 e){
			System.out.println("E2");
		}catch(E1 e){
			System.out.println("E1");
		}catch(Exception e){
			System.out.println("E");
		}finally{
			System.out.println("Finally");
		}
		
		A a = new B();
		A a1 = new A();
		B b = new B();
		//B b1 = new A();Type mismatch: cannot convert from A to B, B is an A, A is not a B.
		System.out.println("b.m() "+b.m());
		
		//a1.m(); Unhandled exception type Exception
		System.out.println(((B)a).m());
		
	}

}
/*	Output
 * 	E2
 * 	Finally
 * 
 */
