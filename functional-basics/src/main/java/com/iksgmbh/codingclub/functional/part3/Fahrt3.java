package com.iksgmbh.codingclub.functional.part3;

import com.iksgmbh.codingclub.functional.part3.fahrzeug.Auto;

public class Fahrt3 {
    public static void main(String[] args) {
        var auto = new Auto();
        auto.fahren(steuerung -> steuerung.geradeaus()
                .links()
                .rechts()
                .anhalten());
    }
}
