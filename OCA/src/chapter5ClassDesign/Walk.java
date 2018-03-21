package chapter5ClassDesign;

public interface Walk {
	
	public default int getSpeed(){
		return 5;
	}
}
