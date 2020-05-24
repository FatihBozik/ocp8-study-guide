package io.github.fatihbozik.ch1.objectmethods.tostring.example3;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * @author Fatih Bozik
 */
class Hippo {
    private String name;
    private double weight;

    public Hippo(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
//	 return ToStringBuilder.reflectionToString(this);

//       return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
//                .append("name", name)
//                .append("weight", weight)
//                .toString();
    }
}

public class ApacheToString {
    public static void main(String[] args) {
        Hippo hippo = new Hippo("John", 86869);
        System.out.println(hippo); // Hippo[name=John,weight=86869.0]
    }
}
