package Chapter4;

public class EXERCISE4_3 {

	public static void main(String[] args) {
		int max = 100;
		
		for(int i=2;i<=max;i++){
			boolean flag = true;
			for(int j=2;j<=i/2;j++){
				if(i%j==0){
					flag = false;
					break;
				}
			}
			if(flag){
				System.out.println(i+"是质数");
			}else{
				System.out.println(i+"不是质数");
			 
			}
		}

	}

}
