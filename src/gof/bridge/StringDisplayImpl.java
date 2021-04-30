package gof.bridge;

public class StringDisplayImpl extends DisplayImpl {
	private String str;

	public StringDisplayImpl(String str) {
		this.str = str;
	}

	@Override
	public void rawOpen() {
		this.printLine();
	}

	@Override
	public void rawPrint() {
		System.out.println(String.format("|%s|", this.str));
	}

	@Override
	public void rawClose() {
		this.printLine();
	}

	private void printLine() {
		System.out.print("+");
		int width = this.str.codePointCount(0, this.str.length());
		for (int i = 0; i < width; i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}

}
