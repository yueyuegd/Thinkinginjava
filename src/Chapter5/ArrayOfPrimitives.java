package Chapter5;

public class ArrayOfPrimitives {

	public static void main(String[] args) {
		int[] a1 = {1,2,3,4,5};
		int[] a2;
		a2 = a1;//赋值操作，只赋值引用
		for(int i=0;i<a2.length;i++){
			a2[i]=a2[i]+1;//改变a1数组中的值
			
		}
		for(int i=0;i<a1.length;i++){
			System.out.print(a1[i]+" ");//a1数组中的数值也会改变
		}

	}

}
