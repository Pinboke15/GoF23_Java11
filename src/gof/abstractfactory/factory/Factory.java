package gof.abstractfactory.factory;

public abstract class Factory {

	public static Factory getFactory(String className) {
		Factory factory = null;
		try {
			factory = (Factory) Class.forName(className).getConstructor().newInstance();
		} catch (ClassNotFoundException e) {
			System.err.println(className + "is not found.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return factory;
	}

	public abstract Link createLink(String caption, String link);

	public abstract Tray createTray(String caption);

	public abstract Page createPage(String title, String author);
}
