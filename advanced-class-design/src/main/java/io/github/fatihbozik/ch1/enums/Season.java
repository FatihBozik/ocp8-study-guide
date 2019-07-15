package io.github.fatihbozik.ch1.enums;

//enum Season {
//    WINTER, SPRING, SUMMER, FALL;
//}

final class Season extends Enum<Season> {
    public static final Season WINTER;
    public static final Season SPRING;
    public static final Season SUMMER;
    public static final Season FALL;
    private static final Season[] $VALUES;

    private Season(String name, int ordinal) {
	super(name, ordinal);
    }

    static {
	WINTER = new Season("WINTER", 0);
	SPRING = new Season("SPRING", 1);
	SUMMER = new Season("SUMMER", 2);
	FALL = new Season("FALL", 3);
	$VALUES = new Season[]{
		WINTER, SPRING, SUMMER, FALL
	};
    }

    public static Season[] values() {
	return $VALUES.clone();
    }

    public static Season valueOf(String name) {
	return Enum.valueOf(Season.class, name);
    }
}

class SeasonTest {
    public static void main(String[] args) {
	Season s = Season.SUMMER;
	System.out.println(s);                  // SUMMER
	System.out.println(s == Season.SUMMER); // true
    }
}

