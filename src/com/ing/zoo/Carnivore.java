package com.ing.zoo;

// Zelfde idee als Herbivore, maar dan voor vleeseters.
// Een Zebra implementeert dit niet, dus eatMeat() bestaat niet op een Zebra.
// Dat is de oplossing voor het probleem uit de opdracht.
public interface Carnivore {
    void eatMeat();
}
