package Chapter4;

public class EXERCISE6_2 {
	public static void test(int testval,int begin,int end){
		if(testval>=begin && testval <=end){
			System.out.println(testval+"在"+begin+"和"+end+"之间");
		}else{
			System.out.println(testval+"不在"+begin+"和"+end+"之间");
		}
	}

	public static void main(String[] args) {
		test(5,0,10);
		test(9,0,10);
		test(21,0,10);

	}

}
