package Chapter5;
class Rock{
		Rock(){//构造器
			System.out.println("Rock");
		}
	}
public class SimpleConstructor {
	

	public static void main(String[] args) {
		for(int i=0;i<10;i++){
			new Rock();//创建对象并初始化，通过编译器自动调用构造器来初始化
		}

	}

}
