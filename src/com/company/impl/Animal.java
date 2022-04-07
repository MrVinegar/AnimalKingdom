package com.company.impl;

import com.company.interfaces.Breath;
import com.company.interfaces.Healthy;
import com.company.interfaces.MakeSound;
import com.company.interfaces.Move;

public abstract class Animal implements Move, MakeSound, Breath, Healthy {
    public abstract void move();
    public abstract void makeSound();
    public abstract void breathing();
    public abstract boolean isHealthy();
}
