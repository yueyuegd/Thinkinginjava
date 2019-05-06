package Chapter9;
interface Instrument{
	void adjust();
}
interface Playable{
	void play(Note n);
}
class Wind implements Instrument,Playable{
	public void adjust(){
		System.out.println(this+".adjust()");
	}
	public void play(Note n){
		System.out.println(this+".play()"+n);
	}
	public String toString(){
		return "Wind";
	}
}
class Percussion implements Instrument,Playable{
	public void adjust(){
		System.out.println(this+".adjust()");
	}
	public void play(Note n){
		System.out.println(this+".play()"+n);
	}
	public String toString(){
		return "Percussion";
	}
}
class Stringed implements Instrument,Playable{
	public void adjust(){
		System.out.println(this+".adjust()");
	}
	public void play(Note n){
		System.out.println(this+".play()"+n);
	}
	public String toString(){
		return "Stringed";
	}
}
class Brass extends Wind{
	public String toString(){
		return "Brass";
	}
}
class WoodWind extends Wind{
	public String toString(){
		return "WoodWind";
	}
}

public class EXE10 {
	public static void tune(Playable y){
		y.play(Note.MIDDLE_C);
	}
	public static void tuneAll(Playable[] p){
		for(Playable i:p){
			tune(i);
		}
	}
	public static void main(String[] args) {
		Playable[] orchstra = {
				new Wind(),
				new Percussion(),
				new Stringed(),
				new Brass(),
				new WoodWind()
		};
		tuneAll(orchstra);
	}

}
