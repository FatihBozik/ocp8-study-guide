package io.github.fatihbozik.ch1.enums.example6;

/**
 * @author Fatih Bozik
 */
public enum Season {
    WINTER {
	@Override
	public void printHours() {
	    System.out.println("short hours");
	}
    },
    SUMMER {
	@Override
	public void printHours() {
	    System.out.println("long hours");
	}
    },
    SPRING, FALL;

    public void printHours() {
	System.out.println("Default hours");
    }
}
