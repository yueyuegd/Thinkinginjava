package Chapter10;


import innerclasses.Sequence;

class StringHolder{
	private String data;
	public String toString(){
		return data;
	}
	public StringHolder(String data){
		this.data = data;
	}
}

public class EXE2 {
	public static void main(String[] args) {
		Sequence sequence = new Sequence(10);
		for(int i=0;i<10;i++){
			sequence.add(new StringHolder(Integer.toString(i)));
		}
		//Selector selector = sequence.selector();
		
	}

}
