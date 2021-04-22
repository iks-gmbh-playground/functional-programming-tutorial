package com.iksgmbh.codingclub.functional.basics.aufgaben.part3.route;

import com.iksgmbh.codingclub.functional.basics.aufgaben.part3.fahrzeug.Steuerung;

@FunctionalInterface
public interface Route {
    void fahren(Steuerung route);
}
