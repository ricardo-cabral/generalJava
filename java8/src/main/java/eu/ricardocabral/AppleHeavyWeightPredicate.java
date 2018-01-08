package eu.ricardocabral;

import eu.ricardocabral.FilteringApples.Apple;

public class AppleHeavyWeightPredicate implements ApplePredicate {

	@Override
	public boolean test(Apple apple) {
		return apple.getWeight() > 150;
	}

}
