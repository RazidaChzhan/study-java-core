package com.javastart.wrappers;

public class MainString {
    public static void main(String[] args) {
        String firstString = "ABC";
        String secondStrimg = "ABC";

        String thirdString = new String("ABC");
        String fourthString = new String("ABC").intern();

        System.out.println(fourthString == thirdString);
        System.out.println(firstString.equals(thirdString));
        System.out.println(firstString == secondStrimg);
        System.out.println(firstString == fourthString);
    }
}
