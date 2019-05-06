package Chap3;

import java.util.Random;

public class EXERCISE7_3 {

	public static void main(String[] args) {
		Random rand = new Random(47);
		boolean flip = rand.nextBoolean();
		System.out.println("Outcome is:");
		System.out.println(flip?"Head":"Tail");
		

	}

}
