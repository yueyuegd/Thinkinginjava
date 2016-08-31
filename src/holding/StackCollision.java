package holding;


public class StackCollision {
	public static void main(String[] args) {
		holding.Stack<String> stack = new holding.Stack<String>();
		for(String s:"My dog has fleas".split(" ")){
			stack.push(s);
		}
		while(!stack.empty()){
			System.out.print(stack.pop()+" ");
		}
		System.out.println();
	}
	/*java.util.Stack<String> stack2 = new java.util.Stack<String>();
	for(String s:"My dog has fleas".split(" ")){
		stack2.push(s);
	}
	while(!stack.empty()){
		System.out.print(stack2.pop()+" ");
	}*/


}
