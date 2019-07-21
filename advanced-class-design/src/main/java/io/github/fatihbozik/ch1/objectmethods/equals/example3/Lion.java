package io.github.fatihbozik.ch1.objectmethods.equals.example3;

import org.apache.commons.lang3.builder.EqualsBuilder;

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
	// return EqualsBuilder.reflectionEquals(this, obj);

	if (!(obj instanceof Lion)) {
	    return false;
	}
	Lion other = (Lion) obj;
	return new EqualsBuilder()
		.appendSuper(super.equals(obj))
		.append(id, other.id)
		.append(name, other.name)
		.isEquals();
    }
}
