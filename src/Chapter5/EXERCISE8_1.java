package Chapter5;

public class EXERCISE8_1 {
	void study(){
		play();
		this.play();
		System.out.println("I want to study!");
	}
	void play(){
		System.out.println("I also go to play!");
	}

	public static void main(String[] args) {
		EXERCISE8_1 e = new EXERCISE8_1();
		e.study();

	}

}
