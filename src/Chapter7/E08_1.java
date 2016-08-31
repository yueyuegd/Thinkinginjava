package Chapter7;

class base{
	base(int i){
		System.out.println(i+" base constructor");
	}
}
class son extends base{
	son(){
		super(921);
		System.out.println("no parameter");
	}
	son(int i){
		super(921);
		System.out.println(i+" have parameter");
	}
}

public class E08_1 {

	public static void main(String[] args) {
		son s = new son();
		son s1 = new son(921);

	}

}
