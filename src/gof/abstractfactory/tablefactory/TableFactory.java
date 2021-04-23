package gof.abstractfactory.tablefactory;

import gof.abstractfactory.factory.Factory;
import gof.abstractfactory.factory.Link;
import gof.abstractfactory.factory.Page;
import gof.abstractfactory.factory.Tray;

public class TableFactory extends Factory {

	@Override
	public Link createLink(String caption, String url) {
		return new TableLink(caption, url);
	}

	@Override
	public Tray createTray(String caption) {
		return new TableTray(caption);
	}

	@Override
	public Page createPage(String title, String author) {
		return new TablePage(title, author);
	}

}
