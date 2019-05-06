package Chapter9;
interface Monster{
	void menace();
}
interface DangerousMonster extends Monster{
	void destroy();//还有menace方法
}
interface Lethal{
	void kill();
}
class DragonZilla implements DangerousMonster{
	public void menace(){}
	public void destroy(){}
}
interface Vampire extends DangerousMonster,Lethal{
	void drinkBlood();//还有manece,destroy,kill方法
}
class VeryBadVampire implements Vampire{
	public void menace(){}
	public void destroy(){}
	public void kill(){}
	public void drinkBlood(){}
	
	}
	


public class HorrowShow {
	static void u(Monster b){b.menace();}
	static void v(DangerousMonster d){
		d.menace();
		d.destroy();
		}
	static void w(Lethal l){
		l.kill();
	}
	public static void main(String[] args) {
		DangerousMonster bar = new DragonZilla();
		u(bar);
		v(bar);
		Vampire vlad = new VeryBadVampire();
		u(vlad);
		v(vlad);
		w(vlad);
	}

}
