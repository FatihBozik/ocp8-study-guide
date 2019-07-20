package io.github.fatihbozik.ch1.enums.example2;

/**
 * @author Fatih Bozik
 */
enum Season {
    WINTER, SPRING, SUMMER, FALL
}

public class EnumInSwitch {
    public static void main(String[] args) {
	Season summer = Season.SUMMER;

	switch (summer) {
	    case WINTER:
		System.out.println("Winter");
		break;
	    case SUMMER:
		System.out.println("Summer");
		break;
	    // case Season.FALL: // DOES NOT COMPILE
	    //	System.out.println("Fall");
	    // 	break;
	    // case 2: // DOES NOT COMPILE
	    //   System.out.println("2");
	    //   break;
	    default:
		System.out.println("Default");
	}
    }
}
