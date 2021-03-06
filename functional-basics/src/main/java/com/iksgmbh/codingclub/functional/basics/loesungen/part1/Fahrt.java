package com.iksgmbh.codingclub.functional.basics.loesungen.part1;

import com.iksgmbh.codingclub.functional.basics.loesungen.part1.fahrzeug.Auto;
import com.iksgmbh.codingclub.functional.basics.loesungen.part1.route.RouteZumAldi;

public class Fahrt {
    public static void main(String[] args) {
        // Jetzt kann mein Auto dynamisch eine vorgefertigte Route fahren,
        // aber ich möchte die doch lieber erst an dieser Stelle
        // hier definieren...
        var auto = new Auto();
        auto.fahren(new RouteZumAldi());
    }
}
