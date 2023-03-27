package com.javastart.collection;

import java.util.HashMap;
import java.util.Map;

public class MainMap {
    public static void main(String[] args) {

        Map<String, Cat> map = new HashMap<>();

        Cat lori = new Cat("Lori", 3);
        Cat baxter = new Cat("Baxter", 4);
        Cat bublik = new Cat("Bublik", 5);
        Cat martin = new Cat("Martin", 6);

        String loriKey = "Lori";
        String baxterKey = "Baxter";
        String bublikKey = "Bublik";
        String martinKey = "Martin";

        map.put(loriKey, lori);
        map.put(baxterKey, baxter);
        map.put(bublikKey, bublik);
        map.put(martinKey, martin);

        System.out.println(map.get(loriKey));
        System.out.println(map.get(baxterKey));
        System.out.println(map.get(bublikKey));
        System.out.println(map.get(martinKey));

        WeekDays friday = WeekDays.FRIDAY;
        if(friday == WeekDays.FRIDAY) {
            System.out.println("***Friday");
        }

        System.out.println(friday.getDayNumberOfWeek());

    }
}
