package com.ing.zoo;

import java.util.Random;

// Nieuw dier ik hoefde alleen deze class te maken en hem in Zoo toe te voegen.

public class Giraffe extends Animal implements Herbivore, TrickPerformer {

    private final Random random = new Random();

    public Giraffe(String name) {
        super(name, "hmm hmm");
    }

    @Override
    public void eatLeaves() {
        System.out.println(getName() + ": munch munch from the treetops");
    }

    @Override
    public void performTrick() {
        String trick = random.nextBoolean() ? "stretches neck" : "licks own nose";
        System.out.println(getName() + ": " + trick);
    }
}