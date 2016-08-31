package Chapter2;

public class EXE6 {
	String s = "Hello,World!";
	public int storage(String s){
		return s.length()*2;
	}
	void print(){
		System.out.println("storage(s)="+storage(s));
	}

	public static void main(String[] args) {
		/*EXE6 exe = new EXE6();
		int count = exe.storage("wang");
		System.out.println(count);*/
		EXE6 exe = new EXE6();
		exe.print();

	}

}
