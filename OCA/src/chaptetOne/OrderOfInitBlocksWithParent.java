package chaptetOne;

public class OrderOfInitBlocksWithParent {

	public static void main(String[] args) {
		new Child();	
		
		new Parent();	
		
	
		new Child().childMethod();
	}
}

class Parent {
	Member m = new Member("Parent");					// 4
	
	Parent() {			// 3
		//super();
		System.out.println("In Parent Constructor");	// 6
	}
	
	{
		System.out.println("In Parent's Init");			// 5
	}
}

class Child extends Parent {
	Member m = new Member("Child");					// 7
	
	Child() {			// 1
		// super();		// 2
		System.out.println("In Child Constructor"); // 9
	}
	
	{
		System.out.println("In Child's Init");		// 8
	}
	
	void childMethod() {
		System.out.println("In child's method");
	}
}

class Member {
	Member(String name) {
		System.out.println("Member: " + name);
	}
}
