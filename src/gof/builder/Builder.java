package gof.builder;

import java.util.List;

public abstract class Builder {
	private boolean initialized = false;

	public void makeTitle(String title) {
		if (!initialized) {
			buildTitle(title);
			initialized = true;
		}
	}

	public void makeString(String str) {
		if (initialized) {
			buildString(str);
		}
	}

	public void makeItems(List<String> items) {
		if (initialized) {
			buildItems(items);
		}
	}

	public void close() {
		if (initialized) {
			buildDone();
		}
	}

	protected abstract void buildTitle(String title);

	protected abstract void buildString(String str);

	protected abstract void buildItems(List<String> items);

	protected abstract void buildDone();

	protected abstract String getResult();
}
