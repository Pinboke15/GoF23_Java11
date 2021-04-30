package gof.bridge;

public class DecorateCharDisplayImpl extends DisplayImpl {
	private char ch;
	private char prefix;
	private char suffix;

	public DecorateCharDisplayImpl(char ch, char prefix, char suffix) {
		this.ch = ch;
		this.prefix = prefix;
		this.suffix = suffix;
	}

	@Override
	public void rawOpen() {
		System.out.print(this.prefix);
	}

	@Override
	public void rawPrint() {
		System.out.print(this.ch);
	}

	@Override
	public void rawClose() {
		System.out.println(this.suffix);
	}

}
