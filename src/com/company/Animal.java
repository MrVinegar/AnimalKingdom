package com.company;

abstract class Animal implements Move,MakeSound,Breath,Healthy {
    public abstract void move();
    public abstract void makeSound();
    public abstract void breathing();
    public abstract boolean isHealthy();
}
