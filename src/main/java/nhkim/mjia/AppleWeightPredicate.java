package nhkim.mjia;

import nhkim.mjia.Apple;

class AppleWeightPredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
	return apple.getWeight() > 150;
    }
}
