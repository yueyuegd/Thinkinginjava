package Chapter7;

class WithBlankFinalField{
	private final Integer i;
	public WithBlankFinalField(int ii){
		i = new Integer(ii);
	}
	public Integer geti(){
		return i;
	}
}

public class E19_2 {

	public static void main(String[] args) {
		WithBlankFinalField wbff = new WithBlankFinalField(921);
		System.out.println(wbff.geti());

	}

}
