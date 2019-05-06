package Chapter7;

class withFinals{
	private final void f(){
		System.out.println("withFinals.f()");
	}
	private void g(){
		System.out.println("withFinals.g()");
	}
}
class OverridingPrivate extends withFinals{
	private final void f(){
		System.out.println("OverridingPrivate.f()");
	}
	private void g(){
		System.out.println("OverridingPrivate.g()");
	}
}
class OverridingPrivate2 extends OverridingPrivate{
	public final void f(){
		System.out.println("OverridingPrivate2.f()");
	}
	public void g(){
		System.out.println("OverridingPrivate2.g()");
	}
}

public class FinalOverridingIllusion {

	public static void main(String[] args) {
		OverridingPrivate2 op = new OverridingPrivate2();
		op.f();
		op.g();

	}

}
