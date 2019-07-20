package io.github.fatihbozik.ch1.enums.example1;

enum Season {
    WINTER, SPRING, SUMMER, FALL
}

class SeasonTest {
    public static void main(String[] args) {
	Season s = Season.SUMMER;
	System.out.println(s);                  // SUMMER
	System.out.println(s == Season.SUMMER); // true

	for (Season season : Season.values()) {
	    System.out.println(season.name() + " " + season.ordinal());
	}
    }
}

