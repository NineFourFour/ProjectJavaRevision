package chapter5ClassDesign;

public abstract class BigCat extends Animal {

	public BigCat(int age){
		super(age);
	}
	public abstract void roar();
	
	public String getName(){
		return "BigCat";
	}
	
	public void displayInformation(){
		System.out.println("The name of the BigCat is: "+getName());
	}

}
