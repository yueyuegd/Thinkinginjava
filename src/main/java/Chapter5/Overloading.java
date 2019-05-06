package Chapter5;
//构造器和普通方法的重载
class tree{
	int height;
	tree(){
		System.out.println("Planting a tree");
	}
	tree(int initialHeight){
		height = initialHeight;
		System.out.println("Creating new tree that is "+height+"feet tall");
	}
	void info(){
		System.out.println("tree is "+height+"feet tall");
	}
	void info(String s){
		System.out.println(s+":tree is "+height+"feet tall");
	}
}
public class Overloading {

	public static void main(String[] args) {
		for(int i=0;i<5;i++){
			tree t = new tree(i);
			t.info();
			t.info("overloaded method");
		}
		new tree();

	}

}
