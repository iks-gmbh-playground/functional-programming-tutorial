package com.iksgmbh.codingclub.functional.basics.loesungen.part3.fahrzeug;

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
        var autoAufStrasse = starten().ausparken();
        route.accept(autoAufStrasse);
        einparken().stoppen();
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
