package Chap3;

public class ShortCircuit {//比较某个值与1的大小
	static boolean test1(int val){
		System.out.println("test1("+val+")");
		System.out.println("result:"+(val<1));
		return val<1;
	}
	static boolean test2(int val){//比较某个值与2的大小
		System.out.println("test2("+val+")");
		System.out.println("result:"+(val<2));
		return val<2;
	}
	static boolean test3(int val){//比较某个值与3的大小
		System.out.println("test3("+val+")");
		System.out.println("result:"+(val<3));
		return val<3;
	}

	public static void main(String[] args) {
		boolean b = test1(0) && test2(2) && test3(2);//发生短路，由于
		//test2(2)的结果为false，则test3(2)不执行
		System.out.println("Expressing:"+b);

	}

}
