package com.javastart.interfaces;

public abstract class AbstractAnimal implements Animal {
    private String name;
    private int age;
    private String owner;

    public abstract void say();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }
}
