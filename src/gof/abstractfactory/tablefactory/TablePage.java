package gof.abstractfactory.tablefactory;

import gof.abstractfactory.factory.Page;

public class TablePage extends Page {

	public TablePage(String title, String author) {
		super(title, author);
	}

	@Override
	public String makeHTML() {
		var builder = new StringBuilder();
		builder.append(String.format("<html><head><title>%s</title></head>\n", this.title));
		builder.append("<body>\n");
		builder.append(String.format("<h1>%s</h1>\n", this.title));
		builder.append("<table width=\"80%\" border=\"3\">\n");
		this.content.forEach(item -> builder.append(String.format("<tr>%s</tr>", item.makeHTML())));
		builder.append("</table>\n");
		builder.append(String.format("<hr><address>%s</address>", this.author));
		builder.append("</body></html>\n");
		return builder.toString();
	}

}
