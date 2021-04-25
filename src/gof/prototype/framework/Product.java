package gof.prototype.framework;

public interface Product extends Cloneable {
	public void use(String s);

	public Product productClone() throws CloneNotSupportedException;

	public default Product createClone() {
		Product p = null;
		try {
			p = productClone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return p;
	}
}
