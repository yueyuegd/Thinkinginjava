package Chapter4;
import java.util.*;

public class ForEachFloat {

	public static void main(String[] args) {
		Random r = new Random();
		float[] f = new float[10];
		for(int i=0;i<10;i++){
			f[i] = r.nextFloat();
		}
		for(float x:f){
			System.out.print(x+"\t");
		}

	}

}
