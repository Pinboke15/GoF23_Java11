package gof.singleton;

public class Main {

	public static void main(String[] args) {

		// sample sigleton
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		if (s1 == s2) {
			System.out.println("Both objects are same object.");
		} else {
			System.out.println("Both objects are different.");
		}

		// ex5-1 TicketMaker
		TicketMaker tm = TicketMaker.getInstance();
		System.out.println("Issue ticket: " + tm.getNextTickerNumber());
		System.out.println("Issue ticket: " + tm.getNextTickerNumber());
		System.out.println("Issue ticket: " + tm.getNextTickerNumber());

		// ex5-2 Triple
		for (int i = 0; i < 3; i++) {
			var t = Triple.getInstance(i);
			System.out.println("Triple Id: " + Integer.toString(t.getId()));
		}

	}

}
