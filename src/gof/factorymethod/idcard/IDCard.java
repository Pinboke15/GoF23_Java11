package gof.factorymethod.idcard;

import gof.factorymethod.framework.Product;

public class IDCard extends Product {
	private String owner;

	public IDCard(String owner) {
		System.out.println(String.format("%sのカードを作ります", owner));
		this.owner = owner;
	}

	@Override
	public void use() {
		System.out.println(String.format("%sのカードを使います", this.owner));
	}

	public String getOwner() {
		return this.owner;
	}

}
