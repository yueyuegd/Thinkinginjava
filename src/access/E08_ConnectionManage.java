package access;
import access.connection.*;

public class E08_ConnectionManage {

	public static void main(String[] args) {
		Connection c = ConnectionManage.getConnection();
		while(c!=null){
			System.out.println(c);
			c.dosomething();
			c = ConnectionManage.getConnection();
		}

	}

}
