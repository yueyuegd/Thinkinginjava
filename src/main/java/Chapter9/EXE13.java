package Chapter9;
interface BaseInterface{
	void f();
}
interface SonInterface1 extends BaseInterface{
	void f();
	
}
interface SonInterface2 extends BaseInterface{
	void f();
}
interface CombinedInterface extends SonInterface1,SonInterface2{
	void f();
}
class CombinedImpl implements CombinedInterface{
	public void f(){
		System.out.println("CombinedImpl");
	}
}


public class EXE13 {
	public static void main(String[] args) {
		new CombinedImpl().f();
	}

}
