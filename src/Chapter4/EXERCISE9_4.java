package Chapter4;

import java.util.Scanner;

public class EXERCISE9_4 {
	public static int Fibonacci(int num){
		if(num<=2){
			return 1;
		}else{
			return Fibonacci(num-1)+Fibonacci(num-2);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入数列的个数:");
		int n= scan.nextInt();
		for(int i=1;i<=n;i++){
			System.out.print(Fibonacci(i)+",");
		}

	}

}
