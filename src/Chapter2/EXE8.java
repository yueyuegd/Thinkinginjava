package Chapter2;

public class EXE8 {
	static int i = 0;

	public static void main(String[] args) {
		EXE8 exe1 = new EXE8();
		EXE8 exe2 = new EXE8();
		System.out.println("exe1.i="+exe1.i+",exe2.i="+exe2.i);
		exe1.i++;
		System.out.println("exe1.i自增之后:");
		System.out.println("exe1.i="+exe1.i+",exe2.i="+exe2.i);
		

	}

}
