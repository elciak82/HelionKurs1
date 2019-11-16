package videopoint.collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        listSample();
//        setSample();
        mapSample();
    }

    private static void mapSample() { //Mapa - sruktura typu klucz wartość
        Map mapOfNamesAndAges = new HashMap();
        mapOfNamesAndAges.put("Maksiu", 26);
        mapOfNamesAndAges.put("Darek", 50);
        for (Object key : mapOfNamesAndAges.keySet()) {
            System.out.println(key);



        }

    }

    private static void setSample() {
        Set<String> mySet = new HashSet<>(); //zakłada że bedzie to działc inaczej niz lista,
        //jeżeli obiek dodaliśmy raz, to 2 raz nie możemy tego zrobić. W secie nie wystepują powtórzenia
        mySet.add("Dariu");
        mySet.add("Justyna");
        mySet.add("Pipi");
        for (String name : mySet) {
            System.out.println("Przed: " + name);
        }

        mySet.add("Dariu");
        for (String name : mySet) {
            System.out.println("Po: " + name);
        }
    }

    private static void listSample() { //listy - moga występować powtórzenia
        List<String> firstListWithNames = new ArrayList<>(); //podobnie jak tablica, bez ograniczenia rozmiaru
        firstListWithNames.add("Ewelina");
        firstListWithNames.add("Klaudia");

        List<String> secondListWithNames = new LinkedList<>(); //przy częstrzym usuwaniu elementów z listy, jest szybsza
        secondListWithNames.add("Bartek");
        secondListWithNames.add("Krystian");
        secondListWithNames.addAll(firstListWithNames);

        for (String name : secondListWithNames) {
            System.out.println(name);
        }
    }



}
