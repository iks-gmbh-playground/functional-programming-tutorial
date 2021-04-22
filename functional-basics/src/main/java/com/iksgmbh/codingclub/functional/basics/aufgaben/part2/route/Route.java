package com.iksgmbh.codingclub.functional.basics.aufgaben.part2.route;

import com.iksgmbh.codingclub.functional.basics.aufgaben.part2.fahrzeug.Steuerung;

@FunctionalInterface
public interface Route {
    void fahren(Steuerung route);
}
