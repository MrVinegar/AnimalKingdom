package com.company.impl;

import com.company.interfaces.ColdBlooded;
import com.company.interfaces.EggLaying;
import com.company.interfaces.Swim;

public abstract class Fish extends Animal implements Swim, EggLaying, ColdBlooded {
    private int fin;
    private float bodyTemp;

    public Fish(int fin) {
        this.fin = fin;
        this.bodyTemp = 40;
    }

    // Implementations
    public abstract void move();
    public abstract void makeSound();
    public abstract void swimming();
    public abstract void breathing();
    public abstract void eggLaying();
    @Override
    public boolean isHealthy() {
        return this.getBodyTemp() >= 41F & this.getBodyTemp() < 95F;
    }

    @Override
    public float currentColdBodyTemperature() {
        System.out.println("I am a Cold blooded animal.");
        return this.bodyTemp;
    }

    // Getters and Setters
    public int getFin() {
        return fin;
    }
    public void setFin(int fin) {
        this.fin = fin;
    }
    public float getBodyTemp() {
        return bodyTemp;
    }
    public void setBodyTemp(float bodyTemp) {
        this.bodyTemp = bodyTemp;
    }
}
