package io.github.fatihbozik.ch1.enums.example3;

/**
 * @author Fatih Bozik
 */
enum Season {
    WINTER("Low"),
    SPRING("Medium"),
    SUMMER("High"),
    FALL("Medium"); // This semicolon required if
                                   // there is anything in the enum
    			           // besides the values.

    private String expectedVisitors;

    private Season(String expectedVisitors) {
	this.expectedVisitors = expectedVisitors;
    }

    public void printExpectedVisitors() {
	System.out.println(expectedVisitors);
    }

    public static void main(String[] args) {
	Season.SUMMER.printExpectedVisitors();
    }
}