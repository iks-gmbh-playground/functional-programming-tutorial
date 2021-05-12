package com.iksgmbh.codingclub.functional.basics.aufgaben.part1.fahrzeug;

import java.util.function.Consumer;

public class Auto {

    private Steuerung steuerung = new Steuerung();

    private Auto starten() {
        System.out.println("Starte Motor");
        // motor.starten();
        // licht.anschalten();
        return this;
    }

    public Auto fahren(Consumer<Steuerung> route) {
        starten().ausparken();
        route.accept(steuerung);
        steuerung.anhalten();
        stoppen();
        return this;
    }

    private Auto einparken() {
        System.out.println("Parke ein");
        return this;
    }

    private Steuerung ausparken() {
        System.out.println("Parke aus");
        // blinker.blinken();
        // getriebe.rueckwaertsgang()
        // ...
        return steuerung;
    }

    private Auto stoppen() {
        System.out.println("Auto ausschalten");
        return this;

    }
}
