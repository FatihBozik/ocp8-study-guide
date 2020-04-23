package io.github.fatihbozik.ch5.assertion;

enum Seasons {
    SPRING, SUMMER, FALL
}

class TestSeasons {
    public static void test(Seasons s) {
        switch (s) {
            case SPRING:
            case FALL:
                System.out.println("Shorter hours");
                break;
            case SUMMER:
                System.out.println("Longer hours");
                break;
            default:
                assert false : "Invalid season";
        }
    }
}
