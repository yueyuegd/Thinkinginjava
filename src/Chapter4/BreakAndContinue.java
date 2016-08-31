package Chapter4;

import java.util.Random;

public class BreakAndContinue {

	public static void main(String[] args) {
		for(int i= 0;i<100;i++){
			if(i==74){
				break;
			}
			if(i % 9!=0){
				continue;
			}
			System.out.print(i+" ");
		}
		System.out.println();
		Random rand = new Random();
		int[] range = new int[10];
		for(int i=0;i<range.length;i++){
			range[i]=rand.nextInt(100);
		}
		for(int i:range){
			if(i==74){
				break;
			}
			if(i%9!=0){
				continue;
			}
			System.out.print(i+" ");
		}
		System.out.println();
		int i=0;
		while(true){
			i++;
			int j = i * 27;
			if(j ==1269){
				break;
			}
			if(i %10!=0){
				continue;
			}
			System.out.print(i+" ");
		}

	}

}
