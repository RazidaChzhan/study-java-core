package com.javastart.immutables;

public class Main {
    public static void main(String[] args) {
        String a = "ABC";
        String b = a.concat("DEF");
        System.out.println(a);
        System.out.println(b);

        StringBuilder stringBuilder = new StringBuilder("ABC");
        stringBuilder.append("DEF").append("JKL");
        System.out.println(stringBuilder);
        stringBuilder.append("XYZ");
        System.out.println(stringBuilder);

        String n = stringBuilder.toString();
        String t = "ABC";
        System.out.println(t.concat("DEF").concat("JKL").concat("XYZ"));

        StringBuffer stringBuffer = new StringBuffer("ABC");
        stringBuffer.append("JKL").append("ZXO").append("QWERTY");
        System.out.println(stringBuffer);

        Owner alex = new Owner("Alex");
        final Cat lori = new Cat("Lori", 4, alex);
    }
}
