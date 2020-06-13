package io.github.fatihbozik.advancedclassdesign;

interface House {
    public default String getAddress() {
        return "101 Main Str";
    }
}

interface Office {
    public static String getAddress() {
        return "101 Smart Str";
    }
}

interface WFH extends House, Office {
}

class HomeOffice implements House, Office {
    public String getAddress() {
        return "R No 1, Home";
    }
}

public class Enthuware1 {
    public static void main(String[] args) {
        Office off = new HomeOffice();  //1
//        System.out.println(off.getAddress()); //2 // DOES NOT COMPILE
    }
}

