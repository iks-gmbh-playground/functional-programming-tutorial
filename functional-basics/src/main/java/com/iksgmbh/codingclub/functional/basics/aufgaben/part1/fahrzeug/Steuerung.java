package com.iksgmbh.codingclub.functional.basics.aufgaben.part1.fahrzeug;

public class Steuerung {

    public Steuerung links() {
        System.out.println("Fahre links");
        return this;
    }

    public Steuerung rechts() {
        System.out.println("Fahre rechts");
        return this;
    }

    public Steuerung geradeaus() {
        System.out.println("Fahre geradeaus");
        return this;
    }

    public Steuerung anhalten() {
        System.out.println("Anhalten");
        return this;
    }
}
