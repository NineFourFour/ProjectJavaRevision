package questionsETS;

public class StringStringBuilder {
	static String change;
	public static void main(String[] args) {
		change = "It will remain the same";
		
		String s = "MINIMUM";
		System.out.println(s.substring(4, 7)); //1       
		System.out.println(s.substring(5)); //2       
		System.out.println(s.substring(s.indexOf('M', 0))); //3
		changeIt(change);
		System.out.println(change);
		change = changeString(change);
		System.out.println(change);
		StringBuilder b1 = new StringBuilder("snorkler");
		b1.append("str");
		b1.replace(1, 2, "12345");
		StringBuilder sb1 = new StringBuilder("New");
		sb1.append("STOP").substring(0, 5);
		System.out.println(sb1);
		String s1 = sb1.append("STOP").substring(0, 5);
		System.out.println("String s1: "+s1);
		System.out.println("minimum".replace("in","p"));
	}
	
	public static void changeIt(String localString){
		localString = "It has been Changed";
		System.out.println(localString);
	}
	
	public static String changeString(String localString){
		String newString = localString;
		System.out.println(newString);
		return newString = "New";
	}
}
