package holding;

import java.util.ArrayList;



public class AppleAndOrangeWithGenetics {
	public static void main(String[] args) {
		ArrayList<Apple> apples = new ArrayList<Apple>();
		for(int i=0;i<3;i++){
			apples.add(new Apple());
		}
		//apples.add(new Orange());产生编译器错误而不是运行期错误
		for(int i=0;i<apples.size();i++){
			System.out.println(apples.get(i).id());
		}
		
		for(Apple a:apples){
			System.out.println(a.id());
		}
	}

}
