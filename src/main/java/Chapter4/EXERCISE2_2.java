package Chapter4;

import java.util.Random;

public class EXERCISE2_2 {
	static Random r = new Random();
	public static void Compare(){
		int a = r.nextInt(100);
		int b = r.nextInt(100);
		System.out.println("a="+a+",b="+b);
		if(a>b){
			System.out.println("a>b");
		}else if(a<b){
			System.out.println("a<b");
		}else{
			System.out.println("a=b");
		}
	}

	public static void main(String[] args) {
		
		for(int i=0;i<25;i++){
			Compare();
			
		}

	}

}
