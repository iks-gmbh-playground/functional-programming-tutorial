package com.iksgmbh.codingclub.functional.basics.loesungen.part1.route;

import com.iksgmbh.codingclub.functional.basics.loesungen.part1.fahrzeug.Steuerung;

public class RouteZumAldi implements Route {
    @Override
    public void fahren(Steuerung route) {
        System.out.println("Lade Route zum Aldi");
        route.geradeaus()
                .links()
                .rechts()
                .anhalten();
    }
}
