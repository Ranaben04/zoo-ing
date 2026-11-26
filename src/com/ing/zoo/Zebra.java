package com.ing.zoo;

import java.util.Random;

public class Zebra extends Animal implements Herbivore{

    public Zebra(String name) {
        super(name, "zebra zebra");
    }

    @Override
    public void eatLeaves() {
        System.out.println(getName() + ": munch munch zank yee bra");
    }

}
