package com.iksgmbh.codingclub.functional.basics.loesungen.part1.route;

import com.iksgmbh.codingclub.functional.basics.loesungen.part1.fahrzeug.Steuerung;

@FunctionalInterface
public interface Route {
    void fahren(Steuerung route);
}
