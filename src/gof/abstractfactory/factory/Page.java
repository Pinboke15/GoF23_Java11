package gof.abstractfactory.factory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public abstract class Page {
	protected String title;
	protected String author;
	protected ArrayList<Item> content = new ArrayList<>();

	public Page(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public void add(Item item) {
		content.add(item);
	}

	public void output() {
		String filename = this.title + ".html";
		try {
			Files.writeString(
					Paths.get("files/abstractfactory/" + filename),
					this.makeHTML(),
					StandardOpenOption.CREATE);
			System.out.println(filename + "is created.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public abstract String makeHTML();
}
