package Chapter9;
interface Instrument2{
	int VALUE = 5;
	void play(Note n);
	void adjust();
}
class Wind2 implements Instrument2{
	public void play(Note n){
		System.out.println(this+".play()"+n);
	}
	public String toString(){
		return "Wind2";
	}
	public void adjust(){
		System.out.println(this+".adjust()");
	}
	
}
class Percussion2 implements Instrument2{
	public void play(Note n){
		System.out.println(this+".play()"+n);
	}
	public String toString(){
		return "Percussion2";
	}
	public void adjust(){
		System.out.println(this+".adjust()");
	}
}
class Stringed2 implements Instrument2{
	public void play(Note n){
		System.out.println(this+".play()"+n);
	}
	public String toString(){
		return "Stringed2";
	}
	public void adjust(){
		System.out.println(this+".adjust()");
	}
}
class Brass2 extends Wind2{
	public String toString(){
		return "Brass2";
	}
}
class WoodWind2 extends Wind2{
	public String toString(){
		return "WoodWInd2";
	}
}

public class Music5 {
	public static void tune(Instrument2 i){
		i.play(Note.MIDDLE_C);
	}
	public static void tuneAll(Instrument2[] e){
		for(Instrument2 i:e){
			tune(i);
		}
	}
	public static void main(String[] args) {
		Instrument2[] orchestra = {
				new Wind2(),
				new Percussion2(),
				new Stringed2(),
				new Brass2(),
				new WoodWind2()
		};
		tuneAll(orchestra);
	}

}
