package com.iksgmbh.codingclub.functional.basics.aufgaben.part1.fahrzeug;

public class RouteAldi implements Route {

    @Override
    public void fahren(Steuerung steuerung) {
        steuerung.links().rechts().geradeaus().anhalten();
    }
}
