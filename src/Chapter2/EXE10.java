package Chapter2;

public class EXE10 {

	public static void main(String[] args) {
		//long a = System.currentTimeMillis();
		if(args.length<3){
			System.err.println("Need 3 Arguments");
			System.exit(1);
		}
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);

	}

}
