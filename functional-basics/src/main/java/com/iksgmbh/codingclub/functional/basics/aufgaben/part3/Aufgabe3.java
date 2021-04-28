package com.iksgmbh.codingclub.functional.basics.aufgaben.part3;

import com.iksgmbh.codingclub.functional.basics.aufgaben.part3.fahrzeug.Auto;

/**
 * Das sieht doch schon ganz geilo aus! Ein Problemchen nur noch. Ich möchte eigentlich aus convenience-Gründen
 * die Java Boardmittel dafür verwenden... Also nicht mehr mein eigenes Interface. Route kann also weg. ;)
 */
public class Aufgabe3 {

    public static void main(String[] args) {
        var auto = new Auto();
        auto.fahren(steuerung -> steuerung.geradeaus()
                .links()
                .rechts()
                .anhalten());
    }
}
