package com.udla.LSP.Original;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal fish = new Fish();

        dog.makeSound();
        dog.walk();

        fish.makeSound();
        fish.walk(); //
    }
}
