package com.javastart.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = new LinkedList<>();

        for (int i = 0; i < 1000; i++) {
            intList.add(i);
        }

        System.out.println(intList.size());

        for (Integer element : intList) {
            if(element % 15 == 0) {
                System.out.println(element);
            }
        }

        CustomLinkedList<String> customLinkedList = new CustomLinkedList<>();
        customLinkedList.add("ABC");
        customLinkedList.add("UIOP");
        customLinkedList.add("QWERTY");

        System.out.println(customLinkedList.get(1));

        System.out.println(customLinkedList.size());
        System.out.println(customLinkedList.first());
        System.out.println(customLinkedList.last());

        customLinkedList.addFirst("BBB");
        System.out.println(customLinkedList.first());
        System.out.println(customLinkedList.size());

        customLinkedList.delete(2);
        System.out.println(customLinkedList.size());

        for (String element : customLinkedList) {
            System.out.println(element);
        }

    }
}
