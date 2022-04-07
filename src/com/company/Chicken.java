package com.company;

import com.company.impl.Bird;
import com.company.interfaces.Fly;
import com.company.interfaces.Herbivore;

public class Chicken extends Bird implements Fly, Herbivore {
    private String name;
    private int size;


    // all args constructor
    public Chicken(String name, int size, float wingSize) {
        super(wingSize);
        this.size = size;
        this.name = name;
    }

    // Implementing methods

    @Override
    public void flying() {
        System.out.println("I am able to fly.");
    }

    @Override
    public void eggLaying() {
        System.out.println("I am able to lay eggs.");
    }

    @Override
    public void move() {
        System.out.println("I am able to walk with my " + this.getLeg() + " legs.");
    }

    @Override
    public void makeSound() {
        System.out.println("I make cluck sound.");
    }

    @Override
    public void breathing() {
        System.out.println("I breath with my nostrils.");
    }

    public void eatGrass() {
        System.out.println("I eat grass only.");
    }


    // Getters and Setters
    public float getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Chicken{" +
                "name='" + name + '\'' +
                ", size=" + size + "lbs"  +
                ", leg=" + getLeg() +
                ", wing span=" + getWingSpan() + "cm" +
                ", current temperature=" + currentWarmBodyTemperature() + "F" +
                ", current healthiness=" + isHealthy() +
                '}';
    }
}
