package Chapter9;
import java.nio.*;
import java.util.*;

class CharSquence{
	private static Random rand = new Random(47);
	private static final char[] capitals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	private static final char[] lowers = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	private static final char[] vowels = "aeiou".toCharArray();
	char[] generator(){
		char[] buffer = new char[10];
		int index = 0;
		buffer[index++] = capitals[ rand.nextInt(capitals.length)];
		for(int i =0;i<4;i++){
			buffer[index++] = vowels[ rand.nextInt(vowels.length)];
			buffer[index++] = lowers[ rand.nextInt(lowers.length)];
		}
		buffer[index] = ' ';
		return buffer;
	}
}
public class EXE16 extends CharSquence implements Readable{
	private int count;
	public EXE16(int count){
		this.count = count;
	}
	public int read(CharBuffer cb){
		if(count--==0){
			return -1;
		}
		char[] buffer = generator();
		cb.put(buffer);
		return buffer.length;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(new EXE16(9));
		while(scan.hasNext()){
			System.out.println(scan.next());
		}
	}

}
