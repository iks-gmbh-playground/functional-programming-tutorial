package com.iksgmbh.codingclub.functional.basics.aufgaben.part3;

import com.iksgmbh.codingclub.functional.basics.aufgaben.part2.fahrzeug.Auto;

public class Fahrt {
    public static void main(String[] args) {
        // Das sieht doch schon ganz geilo aus! Ein Problemchen nur noch. Ich möchte eigentlich aus convenience-Gründen
        // die Java Boardmittel dafür verwenden... Also nicht mehr mein eigenes Interface. Route kann also weg. ;)
        var auto = new Auto();
        auto.fahren(steuerung -> steuerung.geradeaus()
                .links()
                .rechts()
                .anhalten());
    }
}
