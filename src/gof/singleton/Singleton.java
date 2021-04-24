package gof.singleton;

public class Singleton {
	private static Singleton singleton = new Singleton();

	private Singleton() {
		System.out.println("Singleton created.");
	}

	public static Singleton getInstance() {
		return Singleton.singleton;
	}
}
