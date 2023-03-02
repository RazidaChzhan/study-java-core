package com.javastart.constructor;

public class Main {
    public static void main(String[] args) {
        Cat lori = new Cat("Lori");
        SayCatService sayCatService = new SayCatService();
        sayCatService.say(lori, "I want to eat");

        Cat bax = new Cat("Bax");
        sayCatService.say(bax, "I want to sleep");

        Cat martin = new Cat("Martin");
        sayCatService.say(martin, "I want to play");

        sayCatService.sayMeow();
        System.out.println(sayCatService.hello);
    }
}
