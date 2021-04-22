package com.iksgmbh.codingclub.functional.streams.loesungen.part1;

import com.iksgmbh.codingclub.functional.streams.loesungen.part1.domain.Fahrzeug;
import com.iksgmbh.codingclub.functional.streams.loesungen.part1.domain.Parkplatz;

import java.util.Set;

import static com.iksgmbh.codingclub.functional.streams.loesungen.part1.domain.Fahrzeugklasse.*;
import static java.util.stream.Collectors.groupingBy;

public class Aufgabe4 {
    public static void main(String[] args) {
        var parkplatz = new Parkplatz("Wiesenstraße", Set.of(
                new Fahrzeug(LKW, "Iveco", "K-AC 2332"),
                new Fahrzeug(MOTORRAD, "Suzuki", "K-KS 221"),
                new Fahrzeug(LKW, "Mercedes", "K-WW 3442"),
                new Fahrzeug(LKW, "Iveco", "KS-MC 3235"),
                new Fahrzeug(PKW, "VW", "K-HC 1234"),
                new Fahrzeug(PKW, "VW", "NE-CT 4122"),
                new Fahrzeug(LKW, "Mercedes", "B-BB 889"),
                new Fahrzeug(PKW, "MERCEDES", "DU-AA 123"),
                new Fahrzeug(MOTORRAD, "BMW", "I-KS 2021"),
                new Fahrzeug(PKW, "Nissan", "NE-SR 2155"),
                new Fahrzeug(LKW, "MAN", "D-FS 1234"),
                new Fahrzeug(PKW, "Audi", "D-MM 3784"),
                new Fahrzeug(MOTORRAD, "BMW", "D-JS 2311")
        ));
        var fahrzeugeByFahrzeugklasse = parkplatz.getFahrzeuge()
                .stream()
                .collect(groupingBy(Fahrzeug::getFahrzeugklasse));
        fahrzeugeByFahrzeugklasse.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
