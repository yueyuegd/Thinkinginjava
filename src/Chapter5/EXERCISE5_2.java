package Chapter5;
class Dog{
	void bark(){
		System.out.println("Default bark");
	}
	void bark(int i){
		System.out.println("int bark = howl");
	}
	void bark(double d){
		System.out.println("double bark = roar ");
	}
}

public class EXERCISE5_2 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.bark();
		dog.bark(1);
		dog.bark(0.1);
		

	}

}
