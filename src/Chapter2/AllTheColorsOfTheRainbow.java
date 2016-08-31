package Chapter2;

public class AllTheColorsOfTheRainbow {
	int anIntegerRepresentingColors;
	void changeTheHueOfTheColor(int newHue){
		anIntegerRepresentingColors = newHue;
		//System.out.println(newHue+"changeTheHueOfTheColor");
	}

	public static void main(String[] args) {
		AllTheColorsOfTheRainbow acr = new AllTheColorsOfTheRainbow();
		acr.changeTheHueOfTheColor(921);

	}

}
