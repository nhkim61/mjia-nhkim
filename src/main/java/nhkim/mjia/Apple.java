package nhkim.mjia;

public class Apple {

    private int weight = 0;
    private String color = "";

    public Apple (int weight, String color) {
	this.weight = weight;
	this.color = color;
    }

    public int getWeight() {
	return this.weight;
    }

    public String getColor() {
	return this.color;
    }

    @Override
    public String toString() {
	return String.format("Apple{color='%s', weight='%d'}", this.color, this.weight);
    }
}
