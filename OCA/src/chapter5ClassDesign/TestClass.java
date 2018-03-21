package chapter5ClassDesign;

	public class TestClass implements I1, I2{
		static int si = 10;
		public TestClass(){
			System.out.println(this);
		}
		public String toString(){
			return "TestClass.si = "+this.si;
		} 
		public void m1(){
			System.out.println("Hello");
		}
		
	   public static void main(String args[] ){ 
		   A b = new B("good bye");
		   new TestClass(); 
		   System.out.println(new MNOP().x+", "+new MNOP().y);
		   
		   TestClass tc = new TestClass();
		   ((I1)tc).m1();
		   System.out.println(((I1)tc).VALUE);
		   System.out.println(((I2)tc).VALUE);
		   A2 o1 = new C2( );
		      B2 o2 = (B2) o1;
		      System.out.println(o1.m1( ) );
		      System.out.println(o2.i ); 

	   }
	}
	class A{
	   A() { this("hello", " world");  }
	   A(String s) { System.out.println(s); }
	   A(String s1, String s2){ this(s1 + s2); }
	}
	class B extends A{
	   B(){ super("good bye"); };
	   B(String s){ super(s, " world"); }
	   B(String s1, String s2){ this(s1 + s2 + " ! "); }
	}
	
	class Base{
		   public byte getValue(){ return 1; } //1
	}
	class Base2 extends Base{
		   public byte getValue(){ return 2; } //2
	}
	
	class ABCD{
	   int x = 10;
	   static int y = 20;
	   
	}
	class MNOP extends ABCD{
	   int x = 30;
	   static int y = 40;
	   
	}
	
	interface I1{
	   int VALUE = 1;
	   void m1();
	}
	interface I2{
	   int VALUE = 2;
	   void m1();
	}
		
		
	interface Flyer{ 
		String getName();
	}
	class Bird implements Flyer{
		public String name;
		public Bird(String name){
			this.name = name;
		}

		public String getName(){ 
			return name; 
		} 
	}  
	class Eagle extends Bird {
		public Eagle(String name){
			super(name);
		} 
	}
	
	class A2 { int i = 10;  int m1( ) { return i; } }
	class B2 extends A2 { int i = 20;  int m1() { return i; } }
	class C2 extends B2 { int i = 30;  int m1() { return i; } } 

		
		
		
		