package com.iksgmbh.codingclub.functional.part2.route;

import com.iksgmbh.codingclub.functional.part2.fahrzeug.Steuerung;

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
