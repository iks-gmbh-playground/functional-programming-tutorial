package com.iksgmbh.codingclub.functional.basics.aufgaben.part1.fahrzeug;

@FunctionalInterface
public interface Route {
    void fahren(Steuerung steuerung);
}
