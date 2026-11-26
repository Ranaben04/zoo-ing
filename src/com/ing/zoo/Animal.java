package com.ing.zoo;

// Dit is de basis voor alle dieren. Het is "abstract" omdat een los "dier" niet bestaat.
public abstract class Animal {
    private final String name;
    private final String hellotext;

    // Elk dier moet een naam en een hello tekst meegeven, dus je kunt geen dier zonder naam maken.
    // protected: alleen de dieren die van Animal erven mogen deze constructor aanroepen.
    protected Animal(String name, String hellotext) {
        this.name = name;
        this.hellotext = hellotext;
    }

    // Getter: zo kunnen andere classes (zoals Zoo) de naam lezen zonder hem te kunnen veranderen.
    public String getName() {
        return name;
    }

    // Alle dieren zeggen hallo op dezelfde manier, daarom staat dit hier en niet in elk dier apart.
    // Ik print de naam ervoor, zodat je bij "hello" kunt zien welk dier wat zegt.
    public void sayHello() {
        System.out.println(name + ": " + hellotext);
    }
}
