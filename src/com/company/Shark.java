package com.company;

public class Shark extends Fish implements Carnivore,ColdBlooded {

    private String name;
    private int size;

    public Shark(String name, int size, int fin) {
        super(fin);
        this.name = name;
        this.size = size;
    }

    // Implementations
    @Override
    public void eatMeat() {
        System.out.println("I like eating meat.");
    }

    @Override
    public void move() {
        System.out.println("I move by swimming with my " + getFin() + " fins.");
    }

    @Override
    public void makeSound() {
        System.out.println("I don't make sound.");
    }

    @Override
    public void swimming() {
        System.out.println("I can swim in water");
    }

    @Override
    public void breathing() {
        System.out.println("I breath with my gills");
    }

    @Override
    public void eggLaying() {
        System.out.println("I am able to lay eggs.");
    }

    @Override
    public float currentColdBodyTemperature() {
        return getBodyTemp();
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

    @Override
    public String toString() {
        return "Shark{" +
                "name='" + name + '\'' +
                ", size=" + size + "lbs" +
                ", fins=" + getFin() +
                ", size=" + size +
                ", current temperature=" + currentColdBodyTemperature() + "F" +
                ", healthiness=" + isHealthy() +
                '}';
    }
}
