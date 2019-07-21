package io.github.fatihbozik.ch1.objectmethods.equals.example2;

/**
 * @author Fatih Bozik
 */
public class Lion {
    private int id;
    private int age;
    private String name;

    public Lion(int id, int age, String name) {
	this.id = id;
	this.age = age;
	this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
	if (!(obj instanceof Lion)) {
	    return false;
	}
	Lion otherLion = (Lion) obj;
	return (this.id == otherLion.id);
    }
}
