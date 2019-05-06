package Chapter5;
class other{
	public static void main(String[] args){
		for(String s:args){
			System.out.print(s+" ");
		}
	}
}

public class DynamicArray {

	public static void main(String[] args) {
		other.main(new String[]{"fiddle","de","dum"});

	}

}
