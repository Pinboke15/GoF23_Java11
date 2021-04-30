package gof.bridge;

public class IncrementalDisplay extends CountDisplay {
	private int step;

	public IncrementalDisplay(DisplayImpl impl, int step) {
		super(impl);
		this.step = step;
	}

	public void incrementalDisplay(int times) {
		for (int i = 0, cnt = 0; i < times; i++, cnt += this.step) {
			this.multiDisplay(cnt);
		}
	}

}
