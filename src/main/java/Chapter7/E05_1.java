package Chapter7;
class A{
	A(int i){
		System.out.println(i+" A constructor");
	}
}
class B{
	B(int i){
		System.out.println(i+" B constructor");
	}
	
}
class C extends A{
	private B b;
	C(){
		super(921);
		System.out.println("C constructor");
	}
	
}

public class E05_1 {
	public static void main(String[] args){
	C c = new C();
	}

}
