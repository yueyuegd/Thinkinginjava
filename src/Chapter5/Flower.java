package Chapter5;

public class Flower {
	int petalCount = 0;
	String s = "initial value";
	Flower(int petals){
		petalCount = petals;
		System.out.println("Constructor w/ int arg only,petalCount="+petalCount);//1
		
	}
	Flower(String ss){
		System.out.println("Constructor w/ String arg only,s="+ss);
		s = ss;
	}
	Flower(String s,int petals){
		this(petals);//必须是第一句
		//this(s);
		this.s = s;
		System.out.println("String & int args");//2
	}
	Flower(){
		this("hi",921);
		System.out.println("default constructor(no args)");//3
	}
	void printPetalCount(){
		//this(11);只能在构造器中调用
		System.out.println("petalCount="+petalCount+" s="+s);//4
	}

	public static void main(String[] args) {
		Flower f = new Flower();
		f.printPetalCount();

	}

}
