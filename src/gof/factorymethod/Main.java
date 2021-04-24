package gof.factorymethod;

import gof.factorymethod.framework.Factory;
import gof.factorymethod.framework.Product;
import gof.factorymethod.idcard.IDCardFactory;

public class Main {

	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("Lebron James");
		Product card2 = factory.create("Paul Geroge");
		Product card3 = factory.create("Zion Williamson");
		card1.use();
		card2.use();
		card3.use();
	}

}
