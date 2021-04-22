package com.iksgmbh.codingclub.functional.streams.aufgaben.part1;

import com.iksgmbh.codingclub.functional.streams.aufgaben.part1.domain.Fahrzeug;
import com.iksgmbh.codingclub.functional.streams.aufgaben.part1.domain.Parkplatz;

import java.util.Set;

import static com.iksgmbh.codingclub.functional.streams.aufgaben.part1.domain.Fahrzeugklasse.*;

public class Aufgabe2 {
    public static void main(String[] args) {
        var parkplatz = new Parkplatz("Wiesenstraße", Set.of(
                new Fahrzeug(LKW, "MAN", "D-FS 1234"),
                new Fahrzeug(PKW, "VW", "K-HC 1234"),
                new Fahrzeug(MOTORRAD, "BMW", "I-KS 2021")
        ));

        // Ich hätte gerne eine Liste der Kennzeichen aller, auf dem Parkplatz parkenden, Autos
    }
}
