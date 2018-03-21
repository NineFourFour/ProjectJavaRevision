package chapter5ClassDesign;

public class Cat implements Walk, Run{
	
	public int getSpeed(){
		return 94;
	}
	public static void main(String[] args) {
		System.out.println(new Cat().getSpeed());
	}

}
