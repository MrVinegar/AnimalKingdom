package com.company;

public abstract class Bird extends Animal implements Fly,WarmBlooded,EggLaying {
    private int leg;
    private float wingSpan;
    private float bodyTemp;

    public Bird(float wingSize) {
        this.leg = 2;
        this.wingSpan = wingSize;
        this.bodyTemp = 106F;
    }

    @Override
    public float currentWarmBodyTemperature() {
        System.out.println("I am a Warm blooded animal.");
        return this.bodyTemp;
    }
    public abstract void eggLaying();
    public abstract void flying();
    public abstract void move();
    public abstract void makeSound();
    public abstract void breathing();

    @Override
    public boolean isHealthy() {
        return 106F >= this.getBodyTemp() & this.getBodyTemp() < 109F;
    }

    public int getLeg() {
        return leg;
    }

    public float getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(float wingSpan) {
        this.wingSpan = wingSpan;
    }

    public float getBodyTemp() {
        return bodyTemp;
    }

    public void setBodyTemp(float bodyTemp) {
        this.bodyTemp = bodyTemp;
    }
}
