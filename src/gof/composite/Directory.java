package gof.composite;

import java.util.ArrayList;

public class Directory extends Entry {
	private String name;
	private ArrayList<Entry> directory = new ArrayList<>();

	public Directory(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public int getSize() {
		return (directory.isEmpty()) ? 0 : directory.stream().mapToInt(e -> e.getSize()).sum();
	}

	@Override
	protected void printList(String prefix) {
		System.out.println(prefix + this);
		directory.forEach(e -> e.printList(prefix + "/" + this.name));
	}

	@Override
	public Entry add(Entry entry) throws FileTreatmentException {
		directory.add(entry);
		return this;
	}

}
