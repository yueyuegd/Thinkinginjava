package Chapter10;


public class Outer {
	class Inner{
		private int i = 921;
		public Inner(int i){
			this.i = i;
		}
		public Inner(){
			
		}
	}
	public Inner getInner(){
		return new Inner();
	}
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner i = outer.getInner();
	}

}
