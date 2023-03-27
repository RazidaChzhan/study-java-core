package com.javastart.collection;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Set<Integer> hashSet = new HashSet<>();
        SortedSet<Integer> treeSet = new TreeSet<>();

        int[] mass = new int[]{2, 4, 1, 9, 5, 30, 15};

        fillCollection(arrayList, mass);
        fillCollection(linkedList, mass);
        fillCollection(hashSet, mass);
        fillCollection(treeSet, mass);

        System.out.println("ArrayList");
        printCollection(arrayList);
        System.out.println("\nLinkedList");
        printCollection(linkedList);
        System.out.println("\nHashSet");
        printCollection(hashSet);
        System.out.println("\nTreeSet");
        printCollection(treeSet);
    }

    private static void printCollection(Collection<Integer> collection) {
        for (Integer element : collection ) {
            System.out.print(element + ", ");
        }
    }
    private static void fillCollection(Collection<Integer> collection, int[] mass) {
        for (int element : mass) {
            collection.add(element);
        }
    }
}
