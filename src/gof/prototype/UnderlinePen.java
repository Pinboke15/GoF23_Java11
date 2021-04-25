package gof.prototype;

import gof.prototype.framework.Product;

public class UnderlinePen implements Product {
	private char ulchar;

	public UnderlinePen(char ulchar) {
		this.ulchar = ulchar;
	}

	@Override
	public void use(String s) {
		int len = s.codePointCount(0, s.length());
		System.out.println(String.format("\"%s\"", s));
		System.out.print(" ");
		for (int i = 0; i < len; i++) {
			System.out.print(this.ulchar);
		}
		System.out.println("");
	}

	@Override
	public Product productClone() throws CloneNotSupportedException {
		return (Product) clone();
	}
}
