package com.iksgmbh.codingclub.functional.part2.route;

import com.iksgmbh.codingclub.functional.part2.fahrzeug.Steuerung;

@FunctionalInterface
public interface Route {
    void fahren(Steuerung route);
}
