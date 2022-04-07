package com.company;

import com.company.impl.Mammal;
import com.company.interfaces.Carnivore;
import com.company.interfaces.Jump;

public class Lion extends Mammal implements Jump, Carnivore {
    private String name;
    private int size;

    public Lion(String name, int size, String furColor) {
        super(furColor);
        this.name = name;
        this.size = size;
    }

    // Implementations
    @Override
    public void eatMeat() {
        System.out.println("I like eating meat.");
    }

    @Override
    public void jumping() {
        System.out.println("I am able to jump.");
    }

    @Override
    public void move() {
        System.out.println("I am able to walk with my " + getLeg() + " legs.");
    }

    @Override
    public void makeSound() {
        System.out.println("I make roar sound.");
    }

    @Override
    public void breathing() {
        System.out.println("I breath through my mouth and nose.");
    }

    @Override
    public void giveBirth() {
        System.out.println("I am able to reproduce by giving birth to lives.");
    }


    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    // To-String method

    @Override
    public String toString() {
        return "Lion{" +
                "name='" + name + '\'' +
                ", size=" + size + "lbs" +
                ", leg=" + getLeg() +
                ", fur color=" + getFurColor() +
                ", current temperature=" + currentWarmBodyTemperature() + "F" +
                ", healthiness=" + isHealthy() +
                '}';
    }
}
