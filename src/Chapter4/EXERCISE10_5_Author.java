package Chapter4;

public class EXERCISE10_5_Author {

	public static void main(String[] args) {
		int[] startDigit = new int[4];
		int[] productDigit = new int [4];//用于存放四位数乘积的各个位的数
		for(int num1=10;num1<=99;num1++){
			for(int num2 =num1;num2<=99;num2++){
				if((num1*num2)%9!=(num1+num2)%9){//不满足吸血鬼数字的特征
					continue;
				}
				int product = num1 * num2;
				startDigit[0] = num1 % 10;
				startDigit[1] = num1 / 10;
				startDigit[2] = num2 % 10;
				startDigit[3] = num2 / 10;
				productDigit[0] = product / 1000;
				productDigit[1] = product % 1000 / 100;
				productDigit[2] = product % 1000 % 100 / 10;
				productDigit[3] = product % 1000 % 100 % 10;
				int count = 0;
				for(int i=0;i<4;i++){
					for(int j=0;j<4;j++){
						if(productDigit[i]==startDigit[j]){
							count++;
							productDigit[i]=-1;
							startDigit[j]=-2;
							if(count==4){
								System.out.println(num1+"*"+num2+":"+product);
							}
						}
					}
				}
				
			}
		}

	}

}
