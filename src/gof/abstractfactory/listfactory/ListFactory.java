package gof.abstractfactory.listfactory;

import gof.abstractfactory.factory.Factory;
import gof.abstractfactory.factory.Link;
import gof.abstractfactory.factory.Page;
import gof.abstractfactory.factory.Tray;

public class ListFactory extends Factory {

	@Override
	public Link createLink(String caption, String link) {
		return new ListLink(caption, link);
	}

	@Override
	public Tray createTray(String caption) {
		return new ListTray(caption);
	}

	@Override
	public Page createPage(String title, String author) {
		return new ListPage(title, author);
	}

}
