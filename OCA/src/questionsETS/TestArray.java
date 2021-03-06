package questionsETS;

import java.util.ArrayList;

public class TestArray {
	/*static int[] x = new int[0];
	static{
		x[0] = 10;
	}*/
	public static void main(String[] args) {
		String[][][] arr={{ { "a", "b" , "c"}, { "d", "e", null } },{ {"x"}, null },{{"y"}},{{ "z","p"},{}}};
		//throw new RuntimeException();
		
		Object[] obj = new Object[]{ "aaa", new Object(), new ArrayList<>(), new String[]{""} };
		//Object obj1 = new Object[]{ "aaa", new Object(), new ArrayList(), {}--not vaild way of creating an object };
		//System.out.println(arr[3][0][1]);
		
		/* {} is not a valid way to create an Object here. 
		 * However, it is valid while creating an array.
		 *  
		 * For example, the following are valid: String[] sa = { }; 
		 * assigns a valid String[] object of length 0 to sa Object
		 *  
		 * arr[][] = new Object[][] {new String[5], {} }; 
		 * assigns a valid Object[] object of length 0 to arr[1].
		 * 
		 * 
		 * Implicit Array
		 * 
		 * With such an array, the type is not specified explicitly in the code. 
		 * Instead, the compiler decides upon the type to use based upon the array's initial values.
		 * 
		 * Question1 
		 * 
		 *  public class Test {
				public static void main(String[] args) {
					method(null);
				}
				public static void method(Object o) {
					System.out.println("Object impl");
				}
				public static void method(String s) {
					System.out.println("String impl");
				}
			}
		 * 
		 * Ans:
		 * 
		 * According to java specs, in case of overloading, compiler picks the most specific function. 
		 * Obviously String class is more specific that Object class, hence it will print �String impl�.
		 * 
		 * 
		 * 
		 */
		
		
		
		
		
		
		
		
		/*	JAVA IS PASS BY VALUE
		 *  
		 * 	Pass by Value: The method parameter values are copied to another variable and then the copied object is passed, 
		 * 				   that�s why it�s called pass by value.
		 * 
		 *	Pass by Reference: An alias or reference to the actual parameter is passed to the method, 
		 *					   that�s why it�s called pass by reference.
		 *	
		 *	Java passes the object reference �by value�. When an object is passed as argument to a method, actually the reference to that object is passed
		 *	
		 *	Java passes all primitive data types by value. This means that a copy is made, so that it cannot be modified. When passing Java objects, 
		 *	you're passing an object reference, which makes it possible to modify the object's member variables. If you want to pass a primitive data type by reference, 
		 *	you need to wrap it in an object.
		 *
		 *	The easiest of all is to pass it as an array (or even a Vector). Your array only needs to contain a single element, but wrapping it in an array means it can 
		 *	be changed by a function.
		 *
		 *	In Java, arguments are always passed by value. The copy would be either a reference or a variable depending on the original variable type. 
		 *	From now on, you can use the following tips in order to understand how modifying arguments inside methods affects the original variable:
		 *	
		 *	1. Modifying the value of a primitive argument would never affect the original variable.
		 *	2. Changing the reference to an object argument inside the method would never affect the original reference. 
		 *	   However, it creates a completely new object in the heap space.
		 *	3. Modifying the attributes of an object argument inside a method is reflected outside of it. 
		 *	4. Modifying collections and maps inside the method is reflected outside of them.
		 *
		 */
		
		int i = 1;
		int[] iArr = {1};
		
		//System.out.println(iArr.getClass());
		
		int[][] d2Array = new int[1][];
		
		
		/****************************Examples of Pass By Value********************************************
		 * 
		 */
		//System.out.println(d2Array.getClass());
		System.out.println("Before Method incr i : "+i);
		incr(i) ;
		System.out.println("After Method incr i : "+i+"\n");
		//incr(iArr) ;
		//System.out.println( "i = " + i + "  iArr[0] = " + iArr [ 0 ] ) ;
		
		//pass by reference
		String str = "String";
		System.out.println("Before method: "+str);
		incrString(str);
		System.out.println("After method: "+str+"\n");
		
		StringBuilder strBuf = new StringBuilder("StringBuilder");
		incrStringBuilder(strBuf);
		System.out.println("After the method: "+strBuf+"\n");
		
		
		Animal a1 = new Animal("Lion");
		Animal a2 = new Animal("Crocodile");

		System.out.println("Before Swap:- a1:" + a1 + "; a2:" + a2);
		swap(a1, a2);
		System.out.println("After Swap:- a1:" + a1 + "; a2:" + a2+"\n");
		
		System.out.println("Before Modify:- a1:" + a1);
		modify(a1);
		System.out.println("After Modify:- a1:" + a1+"\n");
		
		String str1 = "MotorCycle";
		String str2 = new String("MotorCycle");
		String str3 = "Motor";
		String str4 = "Cycle";
		String str5 = new String("Motor");
		String str6 = new String("Cycle");
		final String str7 = "Motor";
		final String str8 = "Cycle";
		
		System.out.println("Str1 : "+str1+", Str2 new String : "+str2);
		System.out.println("str1 == str2: "+(str1==str2));
		System.out.println("str1.equals(str2): "+str1.equals(str2));
		System.out.println("str1 == str2.intern() : "+(str1==str2.intern()));
		System.out.println("Str1 : "+str1+", Str3 : "+str3+", Str4 : "+str4);
		System.out.println("str1 == str3+str4: "+(str1==(str3+str4)));
		System.out.println("str1 == (str3+str4).intern(): "+(str1==(str3+str4).intern())+"\n");
		
		System.out.println("Str1 : "+str1+", Str5 new String : "+str5+", Str6 new String : "+str6);
		System.out.println("str1 == str5+str6: "+(str1==(str5+str6)));
		System.out.println("str1 == (str5+str6).intern(): "+(str1==(str5+str6).intern())+"\n");
		
		System.out.println("Str1 : "+str1+", final Str7 : "+str7+", final Str8 : "+str8);
		System.out.println("str1 == str7+str8: "+(str1==(str7+str8)));
		System.out.println("str1 == (str7+str8).intern(): "+(str1==(str7+str8).intern())+"\n");
	}
	
	public static void incrStringBuilder(StringBuilder s) {
    	s.append(" append String");
    	s.deleteCharAt(2);
    	System.out.println("StringBuilder inside Method: "+s);
    	
    }
	
	public static void incrString(String s) {
    	s = "The String has changed" ;
    	
    	s=s.concat("Inside Method");
    	System.out.println("String s: "+s);
    	
    }
	
    public static void incr(int n) {
    	n++ ;
    	System.out.println("Increment the passed variable: "+n);
    	
    }
    public static void incr(int[ ] n ) { 
    	n [ 0 ]++ ; 
    	System.out.println("Array n: "+n[0]);
    }
    

    public static void swap(Animal animal1, Animal animal2){
		Animal temp = new Animal("");
		temp = animal1;
		animal1 = animal2;
		animal2 = temp;
		System.out.println("Inside swap: a1 = "+animal1+", a2 : "+animal2);
	}
    public static void modify(Animal a) {
    	a = new Animal("");
    	a.setAnimal("Reference");
    	a.name = "Big Bad Dog";
    	System.out.println("Inside modify a.name : "+a);
    }
  
 
}
class Animal {
	String name;

	public Animal(String name) {
		this.name = name;
	}
	public void setAnimal(String s) {
		this.name = s;
	}
	public String toString() {
		return name;
	}
}