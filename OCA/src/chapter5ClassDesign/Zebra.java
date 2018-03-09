package chapter5ClassDesign;

public class Zebra extends Animal{
	
	public Zebra(int age){
		super(age);//super must be the first statement in the constructor
	}
	public Zebra(){
		this(5);//this like super, must be the first statement in the constructor
	}
	public String getName(){
		//String.valueOf(this.getAge());
		return "Zebra";
	}
}
