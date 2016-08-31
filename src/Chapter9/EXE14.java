package Chapter9;
interface interface1{
	void f1();
	void g1();
}
interface interface2{
	void f2();
	void g2();
}
interface interface3{
	void f3();
	void g3();
}
interface Multiple extends interface1,interface2,interface3{
	void h();
}
class Concrete{
	String s;
	public Concrete(String s){
		this.s = s;
	}
}
class All extends Concrete implements Multiple{
	public All(){
		super("All");
	}
	public void h(){
		System.out.println("All.h()");
	}
	public void f1(){
		System.out.println("All.f1()");
	}
	public void f2(){
		System.out.println("All.f2()");
	}
	public void f3(){
		System.out.println("All.f3()");
	}
	public void g1(){
		System.out.println("All.g1()");
	}
	public void g2(){
		System.out.println("All.g2()");
	}
	public void g3(){
		System.out.println("All.g3()");
	}
}

public class EXE14 {
	static void takes1(interface1 i){
		i.f1();
		i.g1();
	}
	static void takes2(interface2 i){
		i.f2();
		i.g2();
	}
	static void takes3(interface3 i){
		i.f3();
		i.g3();
	}
	static void takes4(Multiple i){
		i.f1();
		i.f2();
		i.f3();
		i.g1();
		i.g2();
		i.g3();
		i.h();
	}
	public static void main(String[] args) {
		All all = new All();
		takes1(all);
		takes2(all);
		takes3(all);
		takes4(all);
	}

}
