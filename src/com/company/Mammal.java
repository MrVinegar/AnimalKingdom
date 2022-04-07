package com.company;

public abstract class Mammal extends Animal implements WarmBlooded,GiveBirth {
    private int leg;
    private String furColor;
    private float bodyTemp;

    public Mammal(String furColor) {
        this.leg = 4;
        this.furColor = furColor;
        this.bodyTemp = 100F;
    }

    // Implementations
    public abstract void move();
    public abstract void makeSound();
    public abstract void breathing();
    public abstract void giveBirth();

    @Override
    public float currentWarmBodyTemperature() {
        System.out.println("I am a Warm blooded animal.");
        return this.bodyTemp;
    }

    @Override
    public boolean isHealthy() {
        return 97F >= this.getBodyTemp() & this.getBodyTemp() < 104F;
    }

    // Getters and Setters
    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public float getBodyTemp() {
        return bodyTemp;
    }

    public void setBodyTemp(float bodyTemp) {
        this.bodyTemp = bodyTemp;
    }
}
