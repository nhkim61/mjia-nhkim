package nhkim.mjia;

import nhkim.mjia.Color;

public class Apple {

    private int weight = 0;
    private Color color;

    public Apple (int weight, Color color) {
	this.weight = weight;
	this.color = color;
    }

    public int getWeight() {
	return this.weight;
    }

    public Color getColor() {
	return this.color;
    }

    @Override
    public String toString() {
	return String.format("Apple{color='%s', weight='%d'}", this.color, this.weight);
    }
}
