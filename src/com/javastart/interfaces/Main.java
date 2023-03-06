package com.javastart.interfaces;

public class Main {
    public static void main(String[] args) {

        Cat lori = new Cat();
        Dog bublik = new Dog();

        lori.say();
        bublik.say();

        findOwner(lori);
        findOwner(bublik);

        System.out.println("Lori: " + lori.getOwner() + " Bublik: " + bublik.getOwner());
    }
    private static void findOwner(Animal animal) {
        if(animal.getClass() == Cat.class) {
           animal.setOwner("Cat_owner");
            }
        if(animal.getClass() == Dog.class) {
            animal.setOwner("Dog_owner");
        }
        }
    }

