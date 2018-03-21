package chapter5ClassDesign;

public interface Hop {
	int speed = 0;
	static int getJumpHeight(){
		return 8;
	}
	void move(int mv);
	
}
