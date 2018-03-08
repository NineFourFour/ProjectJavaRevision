package exceptionsEg;
abstract class Calculate{
	abstract void calculate();
	
	public static void main(String[] args){
		System.out.println("calculating");
		Calculate x = null;
		x.calculate();
	} 
}

