package chapter5ClassDesign;

public class Bunny implements Hop, Leap{
	int speed = 100;
	public void printDetails(){
		System.out.println("Hop heigth : "+Hop.getJumpHeight());
		System.out.println("Leap heigth : "+Leap.getJumpHeight());
	}
	
	public void move(int mv){
		 speed+= mv;
		System.out.println("Speed : "+speed);
	}
	public static void main(String[] args) {
		new Bunny().printDetails();
		Hop h = new Bunny();
		h.move(34);
		System.out.println("h.speed : "+h.speed);
		
	}
}
