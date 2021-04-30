package gof.bridge;

public class Main {

	public static void main(String[] args) {
		Display d1 = new Display(new StringDisplayImpl("Hello, Japan."));
		Display d2 = new CountDisplay(new StringDisplayImpl("Hello, World."));
		CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello Universe."));

		d1.display();
		d2.display();
		d3.display();
		d3.multiDisplay(5);
		// ex9-1
		RandomCountDisplay d4 = new RandomCountDisplay(new StringDisplayImpl("Hello, Tokyo"));
		d4.randomDisplay(8);
		// ex9-2
		CountDisplay d5 = new CountDisplay(new FileDisplayImpl("files/bridge/star.txt"));
		d5.multiDisplay(4);
		// ex9-3
		IncrementalDisplay d6 = new IncrementalDisplay(new DecorateCharDisplayImpl('*', '<', '>'), 1);
		IncrementalDisplay d7 = new IncrementalDisplay(new DecorateCharDisplayImpl('#', '|', '-'), 2);
		d6.incrementalDisplay(4);
		d7.incrementalDisplay(6);
	}

}
