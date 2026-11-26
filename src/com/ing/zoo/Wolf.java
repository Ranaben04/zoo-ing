package com.ing.zoo;

import java.util.Random;

// Tweede nieuw dier, zodat ik een vleeseter met een trucje heb.
public class Wolf extends Animal implements Carnivore, TrickPerformer {
    private final Random random = new Random();

    public Wolf(String name) {
        super(name, "owoooooo");
    }

    @Override
    public void eatMeat() {
        System.out.println(getName() + ": nom nom nom grrr");
    }

    @Override
    public void performTrick() {
        String trick = random.nextBoolean() ? "howls at the moon" : "plays dead";
        System.out.println(getName() + ": " + trick);
    }
}