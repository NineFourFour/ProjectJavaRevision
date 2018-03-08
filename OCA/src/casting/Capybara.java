package casting;

public class Capybara extends Rodent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rodent rodent = new Rodent();
		Capybara c = (Capybara)rodent;//get a class cast exception
		
		Capybara c1 = new Capybara();
		
	}

}
