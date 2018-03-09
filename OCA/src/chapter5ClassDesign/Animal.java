package chapter5ClassDesign;

/*	if the parent class has more than one constructor, 
 *	the child class may use any valid parent constructor
 */
public abstract class Animal {
	private int age;
	private String name;
	
	public Animal(int age, String name){
		super(); //don't need this line
		this.age = age;
		this.name = name;
	}
	public Animal(int age){
		super(); //don't need this line
		this.age = age;
		this.name = null;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	protected abstract String getName();
	
	public void setName(String name) {
		this.name = name;
	}
	public void eat(){
		System.out.println("Animal is eating");
	}
	
}
