package gof.abstractfactory.listfactory;

import gof.abstractfactory.factory.Tray;

public class ListTray extends Tray {

	public ListTray(String caption) {
		super(caption);
	}

	@Override
	public String makeHTML() {
		StringBuilder builder = new StringBuilder();
		builder.append("<li>\n");
		builder.append(this.caption + "\n");
		builder.append("<ul>\n");
		tray.forEach(item -> builder.append(item.makeHTML()));
		builder.append("</ul>\n");
		builder.append("</li>\n");

		return builder.toString();
	}

}
