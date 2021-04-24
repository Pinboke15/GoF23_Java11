package gof.builder;

import java.util.List;

public class TextBuilder extends Builder {
	private StringBuilder sbuilder = new StringBuilder();

	@Override
	public void makeTitle(String title) {
		sbuilder.append("===========================================\n");
		sbuilder.append(String.format("『%s』\n", title));
		sbuilder.append("\n");
	}

	@Override
	public void makeString(String str) {
		sbuilder.append(String.format("■%s\n", str));
		sbuilder.append("\n");
	}

	@Override
	public void makeItems(List<String> items) {
		items.forEach(item -> sbuilder.append(String.format("  ・%s\n", item)));
		sbuilder.append("\n");
	}

	@Override
	public void close() {
		sbuilder.append("===========================================\n");
	}

	@Override
	public String getResult() {
		return sbuilder.toString();
	}

}
