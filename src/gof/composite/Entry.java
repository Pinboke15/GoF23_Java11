package gof.composite;

public abstract class Entry {
	public abstract String getName();

	public abstract int getSize();

	protected abstract void printList(String prefix);

	public Entry add(Entry entry) throws FileTreatmentException {
		throw new FileTreatmentException();
	}

	public void printList() {
		printList("");
	}

	public String toString() {
		return String.format("%s (%s)\n", getName(), getSize());
	}

}
