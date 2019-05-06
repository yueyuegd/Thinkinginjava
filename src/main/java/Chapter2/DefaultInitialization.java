package Chapter2;

public class DefaultInitialization {
	int i;
	char c;
	public DefaultInitialization(){
		System.out.println("i="+i);
		System.out.println("c=["+c+"]");
		}
	public static void main(String[] args) {
		new DefaultInitialization();
		}
	}

