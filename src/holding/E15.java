package holding;

public class E15 {
	private static final Stack<Character> stack = new Stack<Character>();
	public static void evaluate(String exp){
		char[] data = exp.toCharArray();
		for(int i=0;i<data.length;){
			switch(data[i++]){
			case '+':
				stack.push(data[i++]);
				break;
			case '-':
				System.out.print(stack.pop());
			}
		}
	}
	public static void main(String[] args) {
		
		String expression = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+-+r+u--+l+e+s---";
		evaluate(expression);
		System.out.println();
		System.out.println(stack);
	}

}
