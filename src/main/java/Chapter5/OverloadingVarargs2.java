package Chapter5;

public class OverloadingVarargs2 {
	static void f(float f,Character... args){
		System.out.println("first");
	}
	static void f(Character... args){
		System.out.println("second");
	}

	public static void main(String[] args) {
		//f(1,'a');
		//f('a','b');

	}

}
