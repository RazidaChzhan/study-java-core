package com.javastart.inheritance;

public class Main {
    public static void main(String[] args) {
        British british = new British(4, "Alex", "Btitish");
        Scottish scottish = new Scottish(6, "John", "Scottish");

        british.sayMeow();
        scottish.sayMeow();

        System.out.println("Cat name: " + british.getName() + " Age: " + british.getAge() + " Owner: " + british.getOwner());
        System.out.println("Cat name: " + scottish.getName() + " Age: " + scottish.getAge() + " Owner: " + scottish.getOwner());

        System.out.println(british.toString());
        System.out.println(scottish.toString());

        British martin = new British(4, "Alex", "Martin");
        British anotherMartin = new British(4, "Alex", "Martin");

        System.out.println(martin == anotherMartin );
        System.out.println(martin.equals(anotherMartin));
    }
}
