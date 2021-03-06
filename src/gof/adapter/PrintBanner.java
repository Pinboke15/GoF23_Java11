package gof.adapter;

public class PrintBanner extends Print {
	private Banner banner;

	public PrintBanner(String str) {
		banner = new Banner(str);
	}

	@Override
	public void printWeak() {
		banner.showWithParen();
	}

	@Override
	public void printStrong() {
		banner.showWithAster();
	}

}
