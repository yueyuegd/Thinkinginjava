package Chapter2;

public class DateOnly {
	int i;
	double d;
	boolean b;
	/*public DateOnly(){
		i=47;
		d=1.1;
		b=false;
	}*/
	public static void main(String[] args) {
		DateOnly d = new DateOnly();
		d.i = 47;
		d.d = 1.1;
		d.b = false;
		System.out.println("i="+d.i+",d="+d.d+",b="+d.b);

	}

}
