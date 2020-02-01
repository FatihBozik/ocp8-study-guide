package io.github.fatihbozik.ch3.workingwithgenerics.example11;

import java.util.ArrayList;
import java.util.List;

public class DiamondOperator {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Fatih");
        list.add(5);
        String firstElement = (String) list.get(0);
        Integer secondElement = (Integer) list.get(1);
        System.out.println("List list = new ArrayList();\n" + firstElement + " " + secondElement);


        List<String> list2 = new ArrayList();
        list2.add("Fatih");
        // list2.add(5); // DOES NOT COMPILE
        firstElement = list2.get(0);
        System.out.println("List<String> list2 = new ArrayList();\n" + firstElement);


        List<String> list3 = new ArrayList<>();
        list3.add("Fatih");
        // list3.add(5); // DOES NOT COMPILE
        firstElement = list3.get(0);
        System.out.println("List<String> list3 = new ArrayList<>();\n" + firstElement);


        List<String> list4 = new ArrayList<String>();
        list4.add("Fatih");
        // list4.add(5); // DOES NOT COMPILE
        firstElement = list4.get(0);
        System.out.println("List<String> list4 = new ArrayList<String>();\n" + firstElement);

        List list5 = new ArrayList<>();
        list5.add("Fatih");
        list5.add(5);
        firstElement = (String) list5.get(0);
        secondElement = (Integer) list5.get(1);
        System.out.println("List<String> list5 = new ArrayList<>();\n" + firstElement + " " + secondElement);

        List list6 = new ArrayList<String>();
        list6.add("Fatih");
        list6.add(5);
        firstElement = (String) list6.get(0);
        secondElement = (Integer) list6.get(1);
        System.out.println("List list6 = new ArrayList<String>();\n" + firstElement + " " + secondElement);
    }
}
