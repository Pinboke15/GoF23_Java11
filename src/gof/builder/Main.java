package gof.builder;

public class Main {

	public static void main(String[] args) {
		if (args.length != 1) {
			usage();
			System.exit(0);
		}

		Builder builder = null;
		if (args[0].equals("plain")) {
			builder = new TextBuilder();
		} else if (args[0].equals("html")) {
			builder = new HTMLBuilder();
		} else {
			usage();
			System.exit(0);
		}
		Director director = new Director(builder);
		director.construct();
		System.out.println(builder.getResult());
	}

	public static void usage() {
		System.out.println("java gor.builder.Main plain");
		System.out.println("java gor.builder.Main html");
	}

}
