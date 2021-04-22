package com.iksgmbh.codingclub.functional.streams.loesungen.part1;

import com.iksgmbh.codingclub.functional.streams.loesungen.part1.domain.Fahrzeug;
import com.iksgmbh.codingclub.functional.streams.loesungen.part1.domain.Parkplatz;

import java.util.Set;
import java.util.stream.Collectors;

import static com.iksgmbh.codingclub.functional.streams.loesungen.part1.domain.Fahrzeugklasse.*;

public class Aufgabe2 {
    public static void main(String[] args) {
        var parkplatz = new Parkplatz("Wiesenstraße", Set.of(
                new Fahrzeug(LKW, "MAN", "D-FS 1234"),
                new Fahrzeug(PKW, "VW", "K-HC 1234"),
                new Fahrzeug(MOTORRAD, "BMW", "I-KS 2021")
        ));
        var kennzeichen = parkplatz.getFahrzeuge()
                .stream()
                .map(Fahrzeug::getKennzeichen)
                .collect(Collectors.toList());
        kennzeichen.forEach(System.out::println);
    }
}
