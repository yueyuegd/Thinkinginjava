package Chapter7;

 class Simple {
	private String s;
	public Simple(String s1){
		s = s1;
	}
	public String toString(){
		return s;
	}
	public void setString(String s2){
		s = s2;
	}

}

class Second{
	Simple simple;
	String s;
	public Second(String s1){
		s = s1;
	}
	public void check(){
		if(simple==null){
			System.out.println("not initialized");
		}else{
			System.out.println("initialized");
		}
	}
	private Simple lazy(){
		if(simple==null){
			System.out.println("Creating simple");
			simple = new Simple(s);
		}
		return simple;
	}
	public Simple getSimple(){
		return lazy();
	}
	public String toString(){
		return lazy().toString();
	}
	public void setSimple(String s){
		lazy().setString(s);
	}
}
public class Composition{
	public static void main(String[] args){
		Second second = new Second("Init String");
		second.check();
		System.out.println(second.getSimple());
		second.check();
		System.out.println(second);
		second.setSimple("New String");
		System.out.println(second);
		
	}
	
}
