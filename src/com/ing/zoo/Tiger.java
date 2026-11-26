package com.ing.zoo;

import java.util.Random;

public class Tiger extends Animal implements Carnivore, TrickPerformer {
    private final Random random = new Random();

    public Tiger(String name) {
        super(name, "rraaarww");
    }

    @Override
    public void eatMeat() {
        System.out.println(getName() + ": nomnomnom oink wubalubadubdub");
    }

    @Override
    public void performTrick() {
        // nextBoolean() geeft willekeurig true of false.
        // "a ? b : c" is een korte if/else: bij true pak je b, anders c.
        String trick = random.nextBoolean() ? "jumps in tree" : "scratches ears";
        System.out.println(getName() + ": " + trick);
    }


}
