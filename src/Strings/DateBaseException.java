package Strings;


public class DateBaseException extends Exception{
	public DateBaseException(int transactionID,int queryID,String message){
		super(String.format("(t%d,q%d)%s",transactionID,queryID,message));
	}
	public static void main(String[] args) {
		try{
			throw new DateBaseException(3,7,"Write failed");
			
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
