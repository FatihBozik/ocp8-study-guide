package io.github.fatihbozik.ch1.objectmethods.tostring.example2;

/**
 * @author Fatih Bozik
 */
public class Hippo {
    private String name;
    private double weight;

    public Hippo(String name, double weight) {
	this.name = name;
	this.weight = weight;
    }

    @Override
    public String toString() {
	return "name: " + name + ", weight: " + weight;
    }

    public static void main(String[] args) {
	Hippo hippo = new Hippo("Harry", 768);
	System.out.println(hippo); // name: Harry, weight: 768.0
    }
}
