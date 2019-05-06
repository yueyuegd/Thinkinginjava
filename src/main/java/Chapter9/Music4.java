package Chapter9;
abstract class  Instrument1{
	private int i;
	public abstract void play(Note n);
	public String what(){
		return "Instrutment1";
	}
	public abstract void adjust();
}
class Wind1 extends Instrument1{
	public void play(Note n){
		System.out.println("Wind1.play()"+n);
	}
	public String what(){
		return "Wind1";
	}
	public void adjust(){
		
	}
}
class Percussion1 extends Instrument1{
	public void play(Note n){
		System.out.println("Percussion.play()"+n);
	}
	public String what(){
		return "Percussion1";
	}
	public void adjust(){
		
	}
}
class Stringed1 extends Instrument1{
	public void play(Note n){
		System.out.println("Stringed1.play()"+n);
	}
	public String what(){
		return "Stringed1";
	}
	public void adjust(){
		
	}
}
class Brass1 extends Wind1{
	public void play(Note n){
		System.out.println("Brass1.play()"+n);
	}
	public void adjust(){
		System.out.println("Brass1.adjust()");
	}
}
class WoodWind1 extends Wind1{
	public void play(Note n){
		System.out.println("WoodWind1.play()"+n);
	}
	public String what(){
		return "WoodWind1.adjust()";
	}
}

public  class Music4 {
	public static void Tune(Instrument1 i){
		i.play(Note.MIDDLE_C);
	}
	public static void tuneAll(Instrument1[] e){
		for(Instrument1 i:e){
			Tune(i);
		}
	}
	public static void main(String[] args) {
		Instrument1[] orchestra = {
				new Wind1(),
				new Percussion1(),
				new Stringed1(),
				new Brass1(),
				new WoodWind1()
		};
		tuneAll(orchestra);
	}

}
