package gof.abstractfactory.listfactory;

import gof.abstractfactory.factory.Page;

public class ListPage extends Page {

	public ListPage(String title, String author) {
		super(title, author);
	}

	@Override
	public String makeHTML() {
		StringBuilder builder = new StringBuilder();
		builder.append(String.format("<html><head><title>%s</title></head>\n", this.title));
		builder.append("<body>\n");
		builder.append(String.format("<h1>%s</h1>", this.title));
		builder.append("<ul>\n");
		content.forEach(item -> builder.append(item.makeHTML()));
		builder.append("</ul>\n");
		builder.append(String.format("<hr><address>%s</address>", this.author));
		builder.append("</body></html>\n");
		return builder.toString();
	}

}
