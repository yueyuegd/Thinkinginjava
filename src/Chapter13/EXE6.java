package Chapter13;
class test{
	int i=1;
	long l=2L;
	float f=3.0f;
	double d=4.0;
	public String toString(){
		StringBuilder result = new StringBuilder("test:\n");
		result.append(String.format("%d\n",i));
		result.append(String.format("%d\n",l));
		result.append(String.format("%f\n",f));
		result.append(String.format("%e\n", d));
		return result.toString();
	}
	
}

public class EXE6 {
	public static void main(String[] args) {
		test t = new test();
		System.out.println(t);
	}

}
