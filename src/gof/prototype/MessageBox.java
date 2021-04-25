package gof.prototype;

import gof.prototype.framework.Product;

public class MessageBox implements Product {

	private char decochar;

	public MessageBox(char decochar) {
		this.decochar = decochar;
	}

	@Override
	public void use(String s) {
		int len = s.codePointCount(0, s.length());
		for (int i = 0; i < len + 4; i++) {
			System.out.print(this.decochar);
		}
		System.out.println("");
		System.out.println(String.format("%c %s %c", this.decochar, s, this.decochar));
		for (int i = 0; i < len + 4; i++) {
			System.out.print(this.decochar);
		}
		System.out.println("");
	}

	@Override
	public Product productClone() throws CloneNotSupportedException {
		return (Product) clone();
	}

}
