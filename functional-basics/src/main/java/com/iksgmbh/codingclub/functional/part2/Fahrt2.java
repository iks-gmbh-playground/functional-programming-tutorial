package com.iksgmbh.codingclub.functional.part2;

import com.iksgmbh.codingclub.functional.part2.fahrzeug.Auto;
import com.iksgmbh.codingclub.functional.part2.fahrzeug.Steuerung;
import com.iksgmbh.codingclub.functional.part2.route.Route;

public class Fahrt2 {
    public static void main(String[] args) {
        var auto = new Auto();
        auto.fahren(new Route() {
            @Override
            public void fahren(Steuerung steuerung) {
                steuerung
                        .geradeaus()
                        .links()
                        .rechts()
                        .anhalten();
            }
        });
    }
}
