package io.github.fatihbozik.ch1.enums.example5;

/**
 * @author Fatih Bozik
 */
enum Season {
    WINTER {
	@Override
	public void printHours() {
	    System.out.println("9am-3pm");
	}
    },
    SPRING {
	@Override
	public void printHours() {
	    System.out.println("9am-5pm");
	}
    },
    SUMMER {
	@Override
	public void printHours() {
	    System.out.println("9am-7pm");
	}
    },
    FALL {
	@Override
	public void printHours() {
	    System.out.println("9am-5pm");
	}
    };

    public abstract void printHours();
}
