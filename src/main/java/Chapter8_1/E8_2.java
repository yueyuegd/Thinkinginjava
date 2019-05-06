package Chapter8_1;

import java.util.Random;

class Instrument{
	void play(Note n){
		System.out.println("Instrument.play()"+n);
	}
	public String toString(){
		return "Instrument";
	}
	void adjust(){}
}
class Wind extends Instrument{
	void play(Note n){
		System.out.println("Wind.play()"+n);
	}
	public String toString(){
		return "Wind";
	}
}
class Percussion extends Instrument{
	void play(Note n){
		System.out.println("Percussion.play()"+n);
	}
	public String toString(){
		return "Percussion";
	}
}
class Stringed extends Instrument{
	void play(Note n){
		System.out.println("Stringed.play()"+n);
	}
	public String toString(){
		return "Stringed";
	}
}
class Brass extends Wind{
	void play(Note n){
		System.out.println("Brass.play()");
	}
	void adjust(){
		System.out.println("Brass.adjust()");
	}
}
class WoodWind extends Wind{
	void play(Note n){
		System.out.println("WoodWind.play()"+n);
	}
	public String toString(){
		return "WoodWind";
	}
}
class Electronic extends Instrument{
	void play(Note n){
		System.out.println("Electronic.play()"+n);
	}
	public String toString(){
		return "Electronic";
	}
}
class InstrumentGenerator{
	Random gen = new Random();
	public Instrument next(){
		switch(gen.nextInt(6)){
		default:
		case 0:
			return new Wind();
		case 1:
			return new Percussion();
		case 2:
			return new Stringed();
		case 3:
			return new Brass();
		case 4:
			return new WoodWind();
		case 5:
			return new Electronic();
		}
	}

}

public class E8_2 {

	public static void main(String[] args) {
		InstrumentGenerator gen = new InstrumentGenerator();
		 for(int i = 0; i < 20; i++)
		 System.out.println(gen.next());
	}

}
