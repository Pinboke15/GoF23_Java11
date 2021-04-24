package gof.singleton;

import java.util.ArrayList;
import java.util.Arrays;

public class Triple {
	private static ArrayList<Triple> triples = new ArrayList<>(
			Arrays.asList(new Triple(0), new Triple(1), new Triple(2)));
	private int id;

	private Triple(int id) {
		this.id = id;
	}

	public static Triple getInstance(int id) {
		if (0 <= id && id < 3) {
			return triples.get(id);
		} else {
			return null;
		}
	}

	public int getId() {
		return this.id;
	}
}
