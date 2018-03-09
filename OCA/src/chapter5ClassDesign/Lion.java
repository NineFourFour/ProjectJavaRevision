package chapter5ClassDesign;

public class Lion extends BigCat {

	public Lion(int age){
		super(age);
	}
	public String getName(){
		//String.valueOf(this.getAge());
		return "Lion";
	}
	public void roar(){
		System.out.println("I'm a Lion, you better RUN.");
	}
	public void eat(){
		System.out.println("Lion is eating");
	}
	
	public static void main(String[] args) {
		Lion l = new Lion(12);
		System.out.println("Lion's age: "+l.getAge());
		Animal a = new Lion(4);
		a.eat();
		((Lion)a).roar();
	}
}
