package examQuestions;

public class MyStuff { 
	String name; 
	MyStuff(String n) { 
		name = n; 
		System.out.println("Name : "+name);
	} 
	
	public static void main(String[] args) { 
		MyStuff m1 = new MyStuff("guitar"); 
		MyStuff m2 = new MyStuff("tv"); 
		System.out.println(m2.equals(m1)); 
	} 
	
	public boolean equals(Object o) { 
		System.out.println("Object o: "+((MyStuff)o).toString());
		MyStuff m = (MyStuff) o; 
		/* 
		 * 	line 22 isn't comparing anything, line 18 is downcasting the method parameter to a MyStuff object. 
		 * 	And line 23 was just returning true so long as the value of String name was not null. 
		 * 	So it doesn't fulfill the object.equals contract.
		 * 
		 */
		if (m.name != null) { 
			return true; 
		} 
		return false; 
	}

	@Override
	public String toString() {
		return "MyStuff [name=" + name + "]";
	} 
	
}
