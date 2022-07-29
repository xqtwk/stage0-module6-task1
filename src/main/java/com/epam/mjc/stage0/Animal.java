package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private  boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription(){
        return "This animal is mostly " + color +
                ". It has " + numberOfPaws +
                (numberOfPaws>1?" paws ":" paw ") + "and " +
                (hasFur?"a ":"no ") + "fur.";
    }
}
