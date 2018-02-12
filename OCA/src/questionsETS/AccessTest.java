package questionsETS;

//Which statements can be inserted at line 1 in the following code to make the program write x on the standard output when run?
public class AccessTest{
	   String a = "x";
	   static char b = 'x';
	   String  c = "x";
	   Integer d = new Integer(9);
	   class Inner{
	      String  a = "y";
	      String  get(){
	         String c = "temp";
	         /*Line 1 Three Ans use c = AccessTest.this.a;
	         or c= AccessTest.this.c;*/
	         c = ""+AccessTest.b;
	         return c;
	      }
	   }

	   AccessTest() { 
	     System.out.println(  new Inner().get()  ); 
	   }

	   public static void main(String args[]) {  
		   new AccessTest();  
	   
	
	   
	   
	   
	   
	   }
}