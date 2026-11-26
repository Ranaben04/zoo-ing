package com.ing.zoo;

import java.util.Random;

public class Pig extends Animal implements Herbivore, Carnivore, TrickPerformer {

    private final Random random = new Random();

    public Pig(String name) {
        super(name, "splash");
    }

    @Override
    public void eatLeaves() {
        System.out.println(getName() + ": munch munch oink");
    }

    @Override
    public void eatMeat(){
        System.out.println(getName() + ": nomnomnom oink thx");
    }

    @Override
    public void performTrick() {
        String trick = random.nextBoolean() ? "rolls in the mud" : "runs in circles";
        System.out.println(getName() + ": " + trick);
    }

}
