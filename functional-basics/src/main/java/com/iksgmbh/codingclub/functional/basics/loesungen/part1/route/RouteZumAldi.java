package com.iksgmbh.codingclub.functional.basics.loesungen.part1.route;

import com.iksgmbh.codingclub.functional.basics.loesungen.part1.fahrzeug.Steuerung;

public class RouteZumAldi implements Route {
    @Override
    public void fahren(Steuerung steuerung) {
        System.out.println("Lade Route zum Aldi");
        steuerung.geradeaus()
                .links()
                .rechts()
                .anhalten();
    }
}
