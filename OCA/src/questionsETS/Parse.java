package questionsETS;

public class Parse{
	   public static void main( String[] args){
		     int i = 0;
		     //i =  Integer.parseInt("one");
	       try{
	      
	           i =  Integer.parseInt("one");
	       }
	       catch(NumberFormatException e){
	          System.out.println("Problem in " + i );
	       }
	   }
	}