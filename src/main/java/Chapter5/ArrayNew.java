package Chapter5;
import java.util.*;

public class ArrayNew {

	public static void main(String[] args) {
		int[] a;
		Random rand = new Random();
		a = new int[rand.nextInt(20)];
		System.out.println("length of a = "+a.length);
		System.out.println(Arrays.toString(a));//转化为字符串直接输出
		//就不用使用for循环输出了

	}

}
