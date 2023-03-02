package com.javastart.inheritance;

public class Scottish extends Cat{
    private String name;
    public Scottish(int age, String owner, String name) {
        super(age, owner);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cat: " + name + " Age: " + getAge() + " Owner: " + getOwner();
    }
}
