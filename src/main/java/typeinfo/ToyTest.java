package typeinfo;

interface HasBatteries{}
interface Wateproof{}
interface Shoots{}

class Toy{
	Toy(){}
	Toy(int i){}
}

class FancyToy extends Toy implements HasBatteries,Wateproof,Shoots{
	FancyToy(){
		super(1);
	}
	
}

public class ToyTest {
	static void printInfo(Class cc){
		System.out.println("class name:"+cc.getName()+"is Interface? ["+cc.isInterface()+"]");
		System.out.println("Simple name:"+cc.getSimpleName());
		System.out.println("Canonical name"+cc.getCanonicalName());
	}

	public static void main(String[] args) {
		Class c = null;
		try{
			c = Class.forName("typeinfo.FancyToy");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			System.out.println("Can't find FancyToy");
			System.exit(1);
		}
		printInfo(c);
		for(Class face:c.getInterfaces()){
			printInfo(face);
		}
		Class up = c.getSuperclass();
		Object obj = null;
		try{
			obj = up.newInstance();

		}catch(InstantiationException e){
			System.out.println("Cannot instantiate");
			System.exit(1);
		}catch(IllegalAccessException e){
			System.out.println("Cannot access");
			System.exit(1);
		}
		printInfo(obj.getClass());
	}

}
