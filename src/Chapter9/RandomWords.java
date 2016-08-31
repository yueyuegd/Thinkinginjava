package Chapter9;
import java.nio.*;
import java.util.*;

public class RandomWords implements Readable{
	private static Random rand = new Random();
	private static final char[] captials ="ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	private static final char[] lowers = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	private static final char[] vowels = "aeiou".toCharArray();
	private int count;
	public RandomWords(int count){
		this.count = count;
	}
	public int read(CharBuffer cb){
		if(count--==0){
			return -1;
		}
		cb.append(captials[rand.nextInt(captials.length)]);
		for(int i=0;i<4;i++){
			cb.append(vowels[rand.nextInt(vowels.length)]);
			cb.append(lowers[rand.nextInt(lowers.length)]);
		}
		cb.append(" ");
		return 10;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(new RandomWords(10));
		while(scan.hasNext()){
			System.out.println(scan.next());
		}
	}
		
	

}
