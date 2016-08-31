package Chapter4;

public class IfElse2 {
	public static int test(int testval,int target){
		if(testval > target){
			return +1;
		}else if(testval < target){
			return -1;
		}else{
			return 0;
		}
	}

	public static void main(String[] args) {
		System.out.println(test(10,5));
		System.out.println(test(5,10));
		System.out.println(test(5,5));

	}

}
