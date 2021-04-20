package com.iksgmbh.codingclub.functional.part2.fahrzeug;

import com.iksgmbh.codingclub.functional.part2.route.Route;

public class Auto {

    private Steuerung steuerung = new Steuerung();

    private Auto starten() {
        System.out.println("Starte Motor");
        // motor.starten();
        // licht.anschalten();
        return this;
    }

    public Auto fahren(Route route) {
        starten().ausparken();
        route.fahren(steuerung);
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
