package Chapter5;
class Dog1{
	void bark(int i,double d){
		System.out.println("int first, duble next");
	}
	void bark(double d,int i){
		System.out.println("double first,int next");
	}
}

public class EXERCISE6_1 {

	public static void main(String[] args) {
		Dog1 dog = new Dog1();
		dog.bark(1, 0.1);
		dog.bark(0.1, 1);

	}

}
