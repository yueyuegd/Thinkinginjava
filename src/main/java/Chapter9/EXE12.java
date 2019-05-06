package Chapter9;
interface CanClimb{
	void climb();
}
class Hero2 extends ActionCharacter implements CanFight,CanSwim,CanFly,CanClimb{
	public void swim(){}
	public void fly(){}
	public void climb(){}
}

public class EXE12 {
	public static void t(CanFight x){x.fight();}
	public static void u(CanSwim x){x.swim();}
	public static void v(CanFly x){x.fly();}
	public static void w(CanClimb x){x.climb();}
	public static void z(ActionCharacter x){x.fight();}
	public static void main(String[] args) {
		Hero2 hero = new Hero2();
		t(hero);
		u(hero);
		v(hero);
		w(hero);
		z(hero);
	}

}
