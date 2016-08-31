package Strings;
import java.util.*;

public class UsingStringBuilder {
	Random rand = new Random(47);
	public String toString(){
		StringBuilder builder = new StringBuilder("[");
		for(int i=0;i<25;i++){
			builder.append(rand.nextInt(100));
			builder.append(", ");
		}
		builder.delete(builder.length()-2,builder.length());//删除最后一个空格和逗号
		//builder.delete(0,4);
		builder.append("]");
		return builder.toString();
	}
	public static void main(String[] args) {
		UsingStringBuilder usb = new UsingStringBuilder();
		System.out.println(usb);
	}

}
