package Chapter5;

public class OverloadingVarargs {
	public static void f(Character... args){
		System.out.println("one");
		for(Character c:args){
			System.out.print(c+" ");
		}
		System.out.println();
	}
	public static void f(Integer... args){
		System.out.println("two");
		for(Integer i:args){
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public static void f(Long... args){
		/*for(Long l:args){
			System.out.println(l+" ");
		}
		System.out.println();*/
		System.out.println("three");
	}

	public static void main(String[] args) {
		f('a','b','c');
		f(1);
		f(2,1);
		f(0);
		f(0L);

	}

}
