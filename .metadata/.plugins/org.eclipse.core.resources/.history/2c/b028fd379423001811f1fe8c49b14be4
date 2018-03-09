package chapter5ClassDesign;

public class Gorilla extends Animal {
	
	/* 	
	 * 	since Animal has no non-args constructor
	 * 	Gorilla needs a constructor or it will not complie
	 * 
	 */
	public Gorilla(int age){
		super(age, "Gorilla");
	}
	public Gorilla(){
		super(5);
	}
	public String getName(){
		//String.valueOf(this.getAge());
		return "Gorilla";
	}
	public static void main(String[] args) {
		Gorilla g = new Gorilla(10);
		
		System.out.println(g.getName());
		Animal a = new Gorilla();
		//Animal a = new Animal(); Cannot instantiate the type Animal, it's abstract
	}
}
