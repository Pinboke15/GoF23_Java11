package gof.builder;

import java.util.List;

public abstract class Builder {

	public abstract void makeTitle(String title);

	public abstract void makeString(String str);

	public abstract void makeItems(List<String> items);

	public abstract void close();

	public abstract String getResult();
}
