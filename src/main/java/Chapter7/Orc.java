package Chapter7;

class Villain{
	private String name;
	protected void set(String nm){
		name = nm;
	}
	public Villain(String name){
		this.name = name;
	}
	public String toString(){
		return "I'm a villain and my name is"+name;
	}
}

public class Orc extends Villain{
	private int orcNumber;
	public Orc(String name,int orcName){
		super(name);
		this.orcNumber = orcName;
	}
	public void change(String name,int orcNumber){
		set(name);
		this.orcNumber = orcNumber;
	}
	public String toString(){
		return "Orc:"+orcNumber+":"+super.toString();
	}

	public static void main(String[] args) {
		Orc orc = new Orc("Íõ¿¡¿­",16);
		System.out.println(orc);
		orc.change("Karry", 25);
		System.out.println(orc);

	}

}
