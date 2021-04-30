package gof.bridge;

import java.util.Random;

public class RandomCountDisplay extends CountDisplay {
	Random rand = new Random();

	public RandomCountDisplay(DisplayImpl impl) {
		super(impl);
	}

	public void randomDisplay(int times) {
		multiDisplay(this.rand.nextInt(times));
	}

}
