package Chapter5;

public class EXERCISE22_2 {
	private RMB r;
	public EXERCISE22_2(RMB r){
		this.r = r;
	}
	public void descibe(){
		System.out.print("您抽到的面值是:");
		switch(r){
		case ONE:
			System.out.println("纸币一角");
			break;
		case TWO:
			System.out.println("纸币两角");
			break;	
		case FIVE:
			System.out.println("纸币五角");
			break;
		case TEN:
			System.out.println("纸币十元");
			break;
		case TWENTY:
			System.out.println("纸币二十元");
			break;
		case FIFTY:
			System.out.println("纸币五十元");
			break;
			default:
				System.out.println("很遗憾，您没有抽中任何纸币");
		}
	}

	public static void main(String[] args) {
		EXERCISE22_2 one = new EXERCISE22_2(RMB.ONE),
				                  two = new EXERCISE22_2(RMB.TWO),
				                  five = new EXERCISE22_2(RMB.FIVE),
				                  ten = new EXERCISE22_2(RMB.TEN),
				                  twenty = new EXERCISE22_2(RMB.TWENTY),
				                  fifty = new EXERCISE22_2(RMB.FIFTY);
		one.descibe();
		two.descibe();
		five.descibe();
		ten.descibe();
		twenty.descibe();
		fifty.descibe();

	}

}
