package exceptionsEg;

public class Example1 {
	public static void main(String[] args){
		String s = "0.0";
		float f = Float.valueOf( s ).floatValue();
		
		System.out.println(f);
	}
	
	
	/*java.lang.Exception is a checked Exception. Which means, 
	 * the method that throws this exception must declare it in 
	 * the throws clause. Hence, yourMethod must declare 
	 * throws Exception in its throws clause.
	 */
	public void yourMethod() throws Exception{
	    throw new Exception();
	}
}

class MyException extends Exception {}
class TestClass{
   public static void main(String[] args)throws MyException{
      TestClass tc = new TestClass();
      try{
         tc.m1();
      }
      catch (MyException e){
         tc.m1();
         /*The catch block is throwing a checked exception (i.e. non-RuntimeException) 
          * which must be handled by either a try catch block or declared in the 
          * throws clause of the enclosing method.
          * add throws MyException to the end of mains declaration
          */
      }
      finally{
         tc.m2();
      }
   }
   public void m1() throws MyException{
      throw new MyException();
   }
   public void m2() throws RuntimeException{
      throw new NullPointerException();
   }
}
 