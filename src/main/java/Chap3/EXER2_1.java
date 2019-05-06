package Chap3;
class Ingeral{
	float f;
}

public class EXER2_1 {

	public static void main(String[] args) {
		Ingeral i1 = new Ingeral();
		Ingeral i2 = new Ingeral();
		i1.f = 0.1F;
		i2.f = 0.2F;
		System.out.println("1.i1.f ="+i1.f+" i2.f ="+i2.f);
		i1 = i2;
		System.out.println("2.i1.f ="+i1.f+" i2.f ="+i2.f);
		i1.f = 0.9F;
		System.out.println("3.i1.f ="+i1.f+" i2.f ="+i2.f);

	}

}
