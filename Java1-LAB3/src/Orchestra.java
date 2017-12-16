import java.util.ArrayList;

public class Orchestra implements Instrument {

	private ArrayList<Instrument> instruments;

	Orchestra() {
		instruments = new ArrayList<Instrument>();
	}

	public void play() {
		for (Instrument instrument : instruments) {
			instrument.play();
		}
	}

	public void addInstrument(Instrument instrumentToAdd) {
		instruments.add(instrumentToAdd);
	}

	public static void main(String[] args) {

		Guitar guitar = new Guitar();
		Flute flute = new Flute();
		Trombone trombone = new Trombone();
		Orchestra orchestra = new Orchestra();

		orchestra.addInstrument(guitar);
		orchestra.addInstrument(flute);
		orchestra.addInstrument(trombone);

		orchestra.play();

	}
}

interface Instrument {
	void play();
}

class Guitar implements Instrument {
	public void play() {
		System.out.println("Guitar is playing");
	}
}

class Flute implements Instrument {

	public void play() {
		System.out.println("Flute is playing");
	}
}

class Trombone implements Instrument {

	public void play() {
		System.out.println("Trombone is playing");
	}

}