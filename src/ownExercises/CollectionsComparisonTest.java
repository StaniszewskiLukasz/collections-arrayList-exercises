package ownExercises;

import org.junit.jupiter.api.Test;

import java.util.*;

class CollectionsComparisonTest {
    //dodajemy a potem przeprowadzamy operacje na 100_000 obiektów(String)
    private static List<String> stringList = new ArrayList<>();
    private static List<String> stringListForRemove = new ArrayList<>();
    private static LinkedList<String> stringLinkedList = new LinkedList<>();
    private static LinkedList<String> stringLinkedListForRemove = new LinkedList<>();
    private static Set<String> stringHashSet = new HashSet<>();
    private static Set<String> stringHashSetForRemove = new HashSet<>();
    private static Map<Integer, String> stringHashMap = new HashMap();
    private static Map<Integer, String> stringHashMapForRemove = new HashMap();

    static {
        for (int i = 0; i < 100_000; i++) {
            //------------ArrayList-------------------------------------------//
            stringList.add("List" + i);
            stringListForRemove.add("List" + i);
            //------------LinkedList-----------------------------------------//
            stringLinkedList.add("LinkedList" + i);
            stringLinkedListForRemove.add("LinkedList" + i);
            //------------HashSet-------------------------------------------//
            stringHashSet.add("List" + i);
            stringHashSetForRemove.add("List" + i);
            //------------HashMap-------------------------------------------//
            stringHashMap.put(i, "List"+i);
            stringHashMapForRemove.put(i,"List" + i);
        }
        stringListForRemove.add("Coś");
        stringLinkedListForRemove.add("Coś");
        stringHashSetForRemove.add("Coś");
        stringHashMapForRemove.put(100001, "Coś");
    }

    @Test
    void addToList() {
        List<String> someList = new ArrayList<>();
        for (int i = 0; i < 100_000; i++) {
            someList.add("List" + i);
        }
        stringList = someList;
    }//potrzebny czas koło 60-100ms

    @Test
    void addToLinkedList() {
        LinkedList<String> someList = new LinkedList<>();
        for (int i = 0; i < 100_000; i++) {
            someList.add("LinkedList" + i);
        }
        stringLinkedList = someList;
    }//potrzebny czas koło 70-110ms

    @Test
    void addToHashSet() {
        Set<String> someSet = new HashSet<>();
        for (int i = 0; i < 100_000; i++) {
            someSet.add("List" + i);
        }
        stringHashSet = someSet;
    }//potrzebny czas 448ms

    @Test
    void addToHashMap() {
        Map<Integer,String> someMap = new HashMap();
        for (int i = 0; i < 100_000; i++) {
            someMap.put(i, "List" + i);
        }
        stringHashMap = someMap;
    }//potrzebny czas 49ms


    //-----------------------------------ArrayList-----------------------------------------------------------//
    //potrzebny czas na wszystkie metody z ArrayList z blokiem powyżej 47s82ms - 50s8ms

    @Test
    void printList() {
        System.out.println(stringList);
    }//potrzebny czas koło 45-120ms


    @Test
    void checkingIfIsEmptyList() {
        System.out.println(stringList.isEmpty());
    }//potrzebny czas 0ms

    @Test
    void checkingIfContainsOnList() {
        System.out.println(stringList.contains("Blablabla"));
    }//potrzebny czas 2ms - 7ms

    @Test
    void checkingIfOneObjectEqualsSomethingOnList() {
        System.out.println(stringList.get(1005).equals("Blablabla"));
    }//potrzebny czas 0ms - 17ms

    @Test
    void checkingIndexOfSomeObjectOnList() {
        System.out.println(stringList.indexOf("List"+1006));
    }//potrzebny czas 0ms - 2ms

    @Test
    void gettingOnePositionFromList() {
        System.out.println(stringList.get(10006));
    }//potrzebny czas 0ms

    @Test
    void iterringAndPrintingList() {
        for (String s : stringList) {
            System.out.println(s);
        }
    }//potrzebny czas 1s150ms - 1s450ms

    @Test
    void removeAllFromList() {
        stringListForRemove.removeAll(stringList);
    }//potrzebny czas 32s841ms-48s


    //------------------------------------------------LinkedList----------------------------------------------//

//potrzebny czas na wszystkie metody z LinkedList z blokiem powyżej 1m 33s 418ms

    @Test
    void printLinkedList() {
        System.out.println(stringLinkedList);
    }//potrzebny czas koło 85ms - 113ms


    @Test
    void checkingContentsOnLinkedList() {
        System.out.println(stringLinkedList.isEmpty());
    }//potrzebny czas 0ms

    @Test
    void checkingIfContainsOnLinkedList() {
        System.out.println(stringLinkedList.contains("Blablabla"));
    }//potrzebny czas 2ms - 17ms

    @Test
    void checkingIfOneObjectEqualsSomethingOnLinkedList() {
        System.out.println(stringLinkedList.get(1005).equals("Blablabla"));
    }//potrzebny czas 0ms - 17ms

    @Test
    void checkingIndexOfSomeObjectOnLinkedList() {
        System.out.println(stringLinkedList.indexOf("List" + 1006));
    }//potrzebny czas 0ms - 2ms

    @Test
    void gettingOnePositionFromLinkedList() {
        System.out.println(stringLinkedList.get(10006));
    }//potrzebny czas 12ms - 17ms

    @Test
    void iteratingAndPrintingLinkedList() {
        for (String s : stringLinkedList) {
            System.out.println(s);
        }
    }//potrzebny czas 1s 239ms - 1s535ms

    @Test
    void removeAllFromLinkedList() {
        stringLinkedListForRemove.removeAll(stringLinkedList);
    }//potrzebny czas 1m 31s 692ms

//--------------------------------------------HashSet----------------------------------------------------//

    //potrzebny czas na wszystkie metody z HashSet z blokiem powyżej

    @Test
    void printHashSet() {
        System.out.println(stringHashSet);
    }//potrzebny czas koło


    @Test
    void checkingContentsOnHashSet() {
        System.out.println(stringHashSet.isEmpty());
    }//potrzebny czas 0ms

    @Test
    void checkingIfContainsOnHashSet() {
        System.out.println(stringHashSet.contains("Blablabla"));
    }//potrzebny czas 1ms

    @Test
    void checkingIfOneObjectEqualsSomethingOnHashSet() {
        //SET NIE MA OPCJI WYBIERANIA POJEDYNCZEGO REKORDU
    }

    @Test
    void checkingIndexOfSomeObjectOnHashSet() {
        //SET NIE MA OPCJI WYBIERANIA POJEDYNCZEGO REKORDU
    }

    @Test
    void gettingOnePositionFromHashSet() {
        //SET NIE MA OPCJI WYBIERANIA POJEDYNCZEGO REKORDU
    }

    @Test
    void iteratingAndPrintingHashSet() {
        for (String s : stringHashSet) {
            System.out.println(s);
        }
    }//potrzebny czas 2s249ms

    @Test
    void removeAllFromHashSet() {
        stringHashSetForRemove.removeAll(stringHashSet);
    }//potrzebny czas 34ms

//--------------------------------------------HashSet----------------------------------------------------//
//potrzebny czas na wszystkie metody z LinkedList z blokiem powyżej 1m 33s 418ms

    @Test
    void printHashMap() {
        System.out.println(stringHashMap);
    }//potrzebny czas koło 145ms


    @Test
    void checkingContentsOnHashMap() {
        System.out.println(stringHashMap.isEmpty());
    }//potrzebny czas 1ms

    @Test
    void checkingIfContainsOnHashMap() {
        System.out.println(stringHashMap.containsValue("Blablabla"));
    }//potrzebny czas 10ms

    @Test
    void checkingIfOneObjectEqualsSomethingOnHashMap() {
        System.out.println(stringHashMap.get(1005).equals("Blablabla"));
    }//potrzebny czas 0ms

    @Test
    void checkingIndexOfSomeObjectOnHashMap() {
        System.out.println(stringHashMap.get(1006));
    }//potrzebny czas 2ms

    @Test
    void gettingOnePositionFromHashMap() {
        System.out.println(stringHashMap.get(10006));
    }//potrzebny czas 1ms

    @Test
    void iteratingAndPrintingHashMap() {
        for (int i = 0; i < stringHashMap.size(); i++) {
            System.out.println(stringHashMap.get(i));
        }
    }//potrzebny czas 1s 302ms

    @Test
    void removeAllFromHashMap() {
        for (int i = 0; i <stringHashMap.size() ; i++) {
            if(stringHashMapForRemove.get(i).equals(stringHashMap.get(i))){
                stringHashMapForRemove.remove(i);
            }
        }
        System.out.println(stringHashMapForRemove);

    }//potrzebny czas 37ms

}