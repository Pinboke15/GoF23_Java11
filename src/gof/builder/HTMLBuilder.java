package gof.builder;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class HTMLBuilder extends Builder {
	private String filename;
	private PrintWriter writer;

	@Override
	public void makeTitle(String title) {
		filename = title + ".html";
		try {
			writer = new PrintWriter(
					Files.newBufferedWriter(Paths.get("files/builder/" + this.filename), StandardOpenOption.CREATE));
		} catch (IOException e) {
			e.printStackTrace();
		}
		writer.println(String.format("<html><head><title>%s</title></head><body>", title));
		writer.println(String.format("<h1>%s</h1>", title));
	}

	@Override
	public void makeString(String str) {
		writer.println(String.format("<p>%s</p>", str));
	}

	@Override
	public void makeItems(List<String> items) {
		writer.println("<ul>");
		items.forEach(item -> writer.println(String.format("<li>%s</li>", item)));
		writer.println("</ul>");
	}

	@Override
	public void close() {
		writer.println("</body></html>");
		writer.close();
	}

	@Override
	public String getResult() {
		return filename + " is created.";
	}

}
