package Chapter7;

class SelfCounter{
	private static int count;
	private int id = count++;
	public String toString(){
		return "SelfCounter"+id;
	}
	
}
class WithFinalFields{
	final SelfCounter scf = new SelfCounter();
	static final SelfCounter sscf = new SelfCounter();
	public String toString(){
		return "scf="+scf+"\nsscf="+sscf;
	}
}

public class E18_2 {

	public static void main(String[] args) {
		System.out.println("First Object");
		System.out.println(new WithFinalFields());
		System.out.println("Second Object");
		System.out.println(new WithFinalFields());

	}

}
