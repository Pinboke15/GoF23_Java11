package gof.builder;

import java.util.ArrayList;
import java.util.Arrays;

public class Director {
	private Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}

	public void construct() {
		builder.makeTitle("Greeting");
		builder.makeString("朝から昼にかけて");
		builder.makeItems(new ArrayList<String>(Arrays.asList("おはようございます。", "こんにちは。")));
		builder.makeString("夜に");
		builder.makeItems(new ArrayList<String>(Arrays.asList("こんばんは。", "おやすみなさい", "さようなら。")));
		builder.close();
	}

}
