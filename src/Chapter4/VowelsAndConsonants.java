package Chapter4;
import java.util.*;
//随机生成字母，并判断是元音还是辅音
public class VowelsAndConsonants {

	public static void main(String[] args) {
		Random rand = new Random();
		for(int i=0;i<100;i++){
			int c = rand.nextInt(26)+'a';
			System.out.println((char)c+","+c+":");
			switch(c){
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println("vowel");
				break;
			case 'y':
			case 'w':
				System.out.println("Sometimes a vowel");
				break;
				default:
					System.out.println("Consonant");
				}
		}

	}

}
