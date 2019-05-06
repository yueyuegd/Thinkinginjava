package Chapter5;
class Book{
	boolean checkedOut = false;
	Book(boolean checkOut){
		checkedOut = checkOut;
	}
	void checkIn(){
		checkedOut = false;
	}
	protected void finalize(){
		if(checkedOut){
			System.out.println("Error: check out");
			//super.finalize();
		}
	}
}

public class TerminationCondition {

	public static void main(String[] args) {
		Book novel = new Book(true);
		//proper cleanup
		novel.checkIn();
		new Book(true);
		System.gc();

	}

}
