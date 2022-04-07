package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Bird chicken = new Chicken("chicken", 4, 45);
//        chicken.eggLaying();
//        chicken.move();
//        chicken.makeSound();
//        ((Chicken) chicken).eatGrass();
//        System.out.println(chicken);

        List<Animal> animals = new ArrayList<>();
        animals.add(new Chicken("chicken", 5, 45));
        animals.add(new Shark("shark", 1200, 5));
        animals.add(new Lion("lion", 400, "yellow-gold"));

        for (Animal animal: animals) {
            System.out.println(animal);
            animal.move();
            animal.makeSound();
            animal.breathing();

            if (animal instanceof EggLaying) {
                ((EggLaying) animal).eggLaying();
            }
            if (animal instanceof GiveBirth) {
                ((GiveBirth) animal).giveBirth();
            }


            if (animal instanceof Herbivore) {
                ((Herbivore) animal).eatGrass();
            }
            if (animal instanceof Carnivore) {
                ((Carnivore) animal).eatMeat();
            }


            if (animal instanceof Swim) {
                ((Swim) animal).swimming();
            }
            if (animal instanceof Jump) {
                ((Jump) animal).jumping();
            }
            if (animal instanceof Fly) {
                ((Fly) animal).flying();
            }

            if (animal instanceof WarmBlooded) {
                ((WarmBlooded) animal).currentWarmBodyTemperature();
            }
            if (animal instanceof ColdBlooded) {
                ((ColdBlooded) animal).currentColdBodyTemperature();
            }

            System.out.println("**********************************");
        }
//        System.out.println(bird);
    }
}
