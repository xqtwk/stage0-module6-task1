package com.epam.mjc.stage0;

public class Dog extends Animal{

    public Dog(String color, int numberOfPaws, boolean hasFur) {
        super(color, numberOfPaws, hasFur);
    }

    public Dog() {
        super("brown", 4, true);
    }
}
