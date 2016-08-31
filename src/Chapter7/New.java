package Chapter7;

public class New extends Detergent{
	public void scrub(){
		append("New.scrub()");
		super.scrub();
	}
	public void sterilize(){
		append("New.sterilize()");
	}

	public static void main(String[] args) {
		New n = new New();
		n.dilute();
		n.apply();
		n.scrub();
		n.foam();
		n.sterilize();
		System.out.println(n);

	}

}
