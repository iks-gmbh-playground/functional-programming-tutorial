package com.iksgmbh.codingclub.functional.part3;

import com.iksgmbh.codingclub.functional.part3.fahrzeug.Auto;
import com.iksgmbh.codingclub.functional.part3.fahrzeug.Steuerung;

import java.util.function.Consumer;

public class Fahrt2 {
    public static void main(String[] args) {
        var auto = new Auto();
        auto.fahren(new Consumer<Steuerung>() {
            @Override
            public void accept(Steuerung steuerung) {
                steuerung.geradeaus().anhalten();
            }
        });
    }
}
