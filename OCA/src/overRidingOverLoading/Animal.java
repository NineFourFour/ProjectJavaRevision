package overRidingOverLoading;

public class Animal {
	
	public void eat(){
		System.out.println("Animal eating");
	}
	public void sleep(){
		System.out.println("Animal is sleeping");
	}
	public static void walk(){
		System.out.println("Animal is walking");
	}
	private void run(){
		System.out.println("Animal is running");
	}
}
