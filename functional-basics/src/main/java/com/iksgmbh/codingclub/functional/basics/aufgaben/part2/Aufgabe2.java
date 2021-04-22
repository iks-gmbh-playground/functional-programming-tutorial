package com.iksgmbh.codingclub.functional.basics.aufgaben.part2;

import com.iksgmbh.codingclub.functional.basics.aufgaben.part2.fahrzeug.Auto;
import com.iksgmbh.codingclub.functional.basics.aufgaben.part2.route.RouteZumAldi;

/**
 * Jetzt kann mein Auto dynamisch eine vorgefertigte Route fahren,
 * aber ich möchte die doch lieber erst an dieser Stelle
 * hier definieren...
 */
public class Aufgabe2 {

    public static void main(String[] args) {
        var auto = new Auto();
        auto.fahren(new RouteZumAldi());
    }
}
