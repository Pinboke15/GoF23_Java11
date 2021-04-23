package gof.abstractfactory;

import gof.abstractfactory.factory.Factory;
import gof.abstractfactory.factory.Link;
import gof.abstractfactory.factory.Page;
import gof.abstractfactory.factory.Tray;

public class Main {

	public static void main(String[] args) {

		if (args.length != 1) {
			System.out.println("Usage: java Main clas.name.of.ConcreteFactory");
			System.out.println("Example1: java Main gof.abstractfactory.listfactory.LifeFactory");
			System.out.println("Example1: java Main gof.abstractfactory.tablefactory.TableFactory");
			System.exit(0);
		}

		Factory factory = Factory.getFactory(args[0]);

		// Shopping
		Link amazon = factory.createLink("Amazon", "https://www.amazon.co.jp/");
		Link rakuten = factory.createLink("楽天", "https://www.rakuten.co.jp/");
		// IT News
		Link nikkeix = factory.createLink("NikkeiXTech", "https://xtech.nikkei.com/top/it/index.html");
		Link codezine = factory.createLink("Code Zine", "https://codezine.jp/");
		// Search
		Link google = factory.createLink("Google", "https://www.google.co.jp/");
		// Movie
		Link youtube = factory.createLink("Youtube", "https://www.youtube.com/");
		Link niconico = factory.createLink("ニコニコ動画", "https://www.nicovideo.jp/");

		Tray trayShop = factory.createTray("買い物");
		trayShop.add(amazon);
		trayShop.add(rakuten);

		Tray trayNews = factory.createTray("ITニュース");
		trayNews.add(nikkeix);
		trayNews.add(codezine);

		Tray traySearch = factory.createTray("検索");
		traySearch.add(google);

		Tray trayMovie = factory.createTray("動画");
		trayMovie.add(youtube);
		trayMovie.add(niconico);

		Page page = factory.createPage("よく見るサイト", "Pinboke15");
		page.add(traySearch);
		page.add(trayNews);
		page.add(trayShop);
		page.add(trayMovie);

		page.output();
	}

}
