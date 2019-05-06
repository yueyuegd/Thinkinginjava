package exception;

class MyException1 extends Exception{
	private String str;
	public MyException1(String s){
		this.str = s;
	}
	public MyException1(){
		
	}
	public void printMsg(){
		System.out.println("msg="+str);
	}
}

public class E4 {
	public static void main(String[] args) {
		try{
			throw new MyException1("MyException");
		}catch(MyException1 e){
			e.printMsg();
		}
	}

}
