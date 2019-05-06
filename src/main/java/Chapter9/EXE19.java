package Chapter9;
interface Tossing{
	boolean event();
}
interface TossingFactory{
	Tossing getTossing();
}
class CoinTossing implements Tossing{
	private int events;
	private static final int EVENT = 2;
	public boolean event(){
		System.out.println("Coin Tossing Event:"+events);
		return ++events!=EVENT;
	}
}
class CoinFactory implements TossingFactory{
	public CoinTossing getTossing(){
		return new CoinTossing();
	}
}
class DiceTossing implements Tossing{
	private int events;
	private static final int EVENT = 6;
	public boolean event(){
		System.out.println("Dice Tossing Event:"+events);
		return ++events!=EVENT;
	}
}
class DiceFactory implements TossingFactory{
	public DiceTossing getTossing(){
		return new DiceTossing();
	}
}



public class EXE19 {
	public static void Toss(TossingFactory fact){
		Tossing t = fact.getTossing();
		while(t.event());
	}
	public static void main(String[] args) {
		Toss(new CoinFactory());
		Toss(new DiceFactory());
	}

}
