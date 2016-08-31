package Chapter7;

class Art{
	Art(){
		System.out.println("Art constrctor");
	}
}
class drawing extends Art{
	drawing(){
		System.out.println("drawing constructor");
	}
}

public class Cartoon extends drawing{
	public Cartoon(){
		System.out.println("Cartoon constructor");
	}

	public static void main(String[] args) {
		Cartoon x = new Cartoon();

	}

}
