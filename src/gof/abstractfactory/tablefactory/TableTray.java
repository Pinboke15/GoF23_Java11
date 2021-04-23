package gof.abstractfactory.tablefactory;

import gof.abstractfactory.factory.Tray;

public class TableTray extends Tray {

	public TableTray(String caption) {
		super(caption);
	}

	@Override
	public String makeHTML() {
		var builder = new StringBuilder();
		builder.append("<td>");
		builder.append("<table width=\"100%\" border=\"1\"><tr>");
		builder.append(
				String.format("<td bgcolor=\"#cccccc\" align=\"center\" colspan=\"%d\"><b>%s</b></td>",
						this.tray.size(), this.caption));
		builder.append("</tr>\n");
		builder.append("<tr>\n");
		this.tray.forEach(item -> builder.append(item.makeHTML()));
		builder.append("</tr></table>");
		builder.append("</td>");
		return builder.toString();
	}

}
