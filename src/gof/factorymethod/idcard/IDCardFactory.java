package gof.factorymethod.idcard;

import java.util.ArrayList;
import java.util.List;

import gof.factorymethod.framework.Factory;
import gof.factorymethod.framework.Product;

public class IDCardFactory extends Factory {
	private List<String> owners = new ArrayList<>();

	@Override
	protected Product createProduct(String owner) {
		return new IDCard(owner);
	}

	@Override
	protected void registerProduct(Product product) {
		this.owners.add(((IDCard) product).getOwner());
	}

	public List<String> getOwners() {
		return this.owners;
	}

}
