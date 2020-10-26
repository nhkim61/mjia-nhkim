package nhkim.mjia;

import nhkim.mjia.Apple;
import nhkim.mjia.Color;

class AppleColorPredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple){
	return apple.getColor() == Color.GREEN;
    }
}
