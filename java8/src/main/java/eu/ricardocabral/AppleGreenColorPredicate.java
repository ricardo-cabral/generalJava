package eu.ricardocabral;

import eu.ricardocabral.FilteringApples.Apple;

public class AppleGreenColorPredicate implements ApplePredicate {

	@Override
	public boolean test(Apple apple) {
		return "green".equals(apple.getColor());
	}

}
