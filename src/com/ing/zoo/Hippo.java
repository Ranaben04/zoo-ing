package com.ing.zoo;

public class Hippo extends Animal implements Herbivore{

    public Hippo(String name) {
        super(name, "splash");
    }
    @Override
    public void eatLeaves() {
        System.out.println(getName() + ": munch munch lovely");
    }
}
