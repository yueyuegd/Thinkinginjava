package Strings;

public class SimpleFormat {
	public static void main(String[] args) {
		int x = 5;
		double y =5.332542;
		System.out.println("Row1:["+x+" "+y+"]");
		System.out.format("Row1:[%d %f]\n",x,y);
		System.out.printf("Row1:[%d %f]\n",x,y);
	}

}
