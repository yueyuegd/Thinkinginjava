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
		
	}

}
