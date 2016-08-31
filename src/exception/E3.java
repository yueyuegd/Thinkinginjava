package exception;

public class E3 {
	public static void main(String[] args) {
		char[] arr = new char[10];
		try{
			arr[10] = 'x';
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("e="+e);
		}
	}

}
