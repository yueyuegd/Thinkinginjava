package Chapter7;

class Component1{
	public Component1(){
		System.out.println("Component1");
	}
	void dispose(){
		System.out.println("Component1 dispose");
	}
}
class Component2{
	public Component2(){
		System.out.println("Component2");
	}
	void dispose(){
		System.out.println("Component2 dispose");
	}
}
class Component3{
	public Component3(){
		System.out.println("Component3");
	}
	void dispose(){
		System.out.println("Component3 dispose");
	}
}
class Root{
	Component1 c1 = new Component1();
	Component2 c2 = new Component2();
	Component3 c3 = new Component3();
	public Root(){
		System.out.println("Root");
	}
	void dispose(){
		System.out.println("Root dispose");
		c3.dispose();
		c2.dispose();
		c1.dispose();
	}
}
class Stem extends Root{
	Component1 c1 = new Component1();
	Component2 c2 = new Component2();
	Component3 c3 = new Component3();
	public Stem(){
		System.out.println("Stem");
	}
	void dispose(){
		System.out.println("Stem dispose");
		c3.dispose();
		c2.dispose();
		c1.dispose();
		super.dispose();
	}
}

public class E09_2 {

	public static void main(String[] args) {
		new Stem().dispose();

	}

}
