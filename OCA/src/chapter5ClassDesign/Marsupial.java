package chapter5ClassDesign;

public class Marsupial {
		protected int tailLength = 4;
		
		public static boolean isBiped(){
			return false;
		}
		
		public void getMarsupialDescription(){
			System.out.println("Marsupial Walks on two legs: "+isBiped()+" TailLength : "+tailLength);
		}
		
		public void numberOfLegs(){
			System.out.println(422222);
		}
		protected void outBack() throws Exception{
			
		}
		public final void finalMethod(){
			System.out.println("\nFinal method can't be hidden or overridden, get a compiler error");
		}
}
