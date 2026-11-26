package com.ing.zoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zoo {
    // Ik heb een lijst gemaakt van alle dieren, zodat ik niet voor alle dieren apart code moet schrijven.
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Lion("henk"));
        animals.add(new Hippo("elsa"));
        animals.add(new Pig("dora"));
        animals.add(new Tiger("wally"));
        animals.add(new Zebra("marty"));
        animals.add(new Giraffe("gerrit"));
        animals.add(new Wolf("wolfie"));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");
        String input = scanner.nextLine().trim();

        // equalsIgnoreCase, het maakt niet uit of de gebruiker "Hello" of "hello" typt.
        if (input.equalsIgnoreCase("hello")) {
            // Geen naam dan zeggen alle dieren hallo.
            for (Animal animal : animals) {
                animal.sayHello();
            }
        } else if (input.toLowerCase().startsWith("hello ")) {
            // Wel een naam dan zegt alleen dat dier hallo.
            // substring haalt het stuk "hello " weg, zodat alleen de naam overblijft.
            String name = input.substring("hello ".length()).trim();
            sayHelloTo(animals, name);
        } else if (input.equalsIgnoreCase("give leaves")) {
            giveLeaves(animals);
        } else if (input.equalsIgnoreCase("give meat")) {
            giveMeat(animals);
        } else if (input.equalsIgnoreCase("perform trick")) {
            performTricks(animals);
        } else {
            System.out.println("Unknown command: " + input);
        }
    }

    // Zoekt het dier met de opgegeven naam en laat alleen dat dier hallo zeggen.
    private static void sayHelloTo(List<Animal> animals, String name) {
        for (Animal animal : animals) {
            if (animal.getName().equalsIgnoreCase(name)) {
                animal.sayHello();
                return;
            }
        }
        System.out.println("Er is geen dier met de naam " + name);
    }

    // Geeft leaves aan alle Herbivoren
    private static void giveLeaves(List<Animal> animals) {
        for (Animal animal : animals) {
            if (animal instanceof Herbivore) {
                ((Herbivore) animal).eatLeaves();
            }
        }
    }

    // Geeft meat aan alle Carnivoren
    private static void giveMeat(List<Animal> animals) {
        for (Animal animal : animals) {
            if (animal instanceof Carnivore) {
                ((Carnivore) animal).eatMeat();
            }
        }
    }

    // Alle dieren die een trucje kunnen doen dan een trucje.
    private static void performTricks(List<Animal> animals) {
        for (Animal animal : animals) {
            if (animal instanceof TrickPerformer) {
                ((TrickPerformer) animal).performTrick();
            }
        }
    }
}
