package exception;



public class E1 {
	public static void main(String[] args) {
		try{
			throw new Exception("An exception in main");
			
		}catch(Exception e){
			System.out.println("e.getmessage():"+e.getMessage());
		}finally{
			System.out.println("In finally case");
		}
	}

}
