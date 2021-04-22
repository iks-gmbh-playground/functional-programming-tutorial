package com.iksgmbh.codingclub.functional.basics.loesungen.part2;

import com.iksgmbh.codingclub.functional.basics.aufgaben.part2.fahrzeug.Auto;

public class Fahrt3 {
    public static void main(String[] args) {
        var auto = new Auto();
        auto.fahren(steuerung -> steuerung.geradeaus()
                .links()
                .rechts()
                .anhalten());
    }
}
