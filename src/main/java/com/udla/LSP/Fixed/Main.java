package com.udla.LSP.Fixed;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Animal fish = new Fish();

        dog.makeSound();
        dog.walk();

        fish.makeSound();
    }
}
