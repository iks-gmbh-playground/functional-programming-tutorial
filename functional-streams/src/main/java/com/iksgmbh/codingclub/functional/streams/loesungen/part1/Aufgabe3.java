package com.iksgmbh.codingclub.functional.streams.loesungen.part1;

import com.iksgmbh.codingclub.functional.streams.loesungen.part1.domain.Fahrzeug;
import com.iksgmbh.codingclub.functional.streams.loesungen.part1.domain.Parkplatz;

import java.util.Set;
import java.util.stream.Collectors;

import static com.iksgmbh.codingclub.functional.streams.loesungen.part1.domain.Fahrzeugklasse.*;

public class Aufgabe3 {
    public static void main(String[] args) {
        var parkplatz = new Parkplatz("Wiesenstraße", Set.of(
                new Fahrzeug(LKW, "MAN", "D-FS 1234"),
                new Fahrzeug(LKW, "Iveco", "K-AC 2332"),
                new Fahrzeug(LKW, "Mercedes", "B-BB 889"),
                new Fahrzeug(LKW, "Mercedes", "K-WW 3442"),
                new Fahrzeug(LKW, "Iveco", "KS-MC 3235"),
                new Fahrzeug(PKW, "VW", "K-HC 1234"),
                new Fahrzeug(PKW, "Audi", "D-MM 3784"),
                new Fahrzeug(PKW, "Nissan", "NE-SR 2155"),
                new Fahrzeug(PKW, "VW", "NE-CT 4122"),
                new Fahrzeug(PKW, "MERCEDES", "DU-AA 123"),
                new Fahrzeug(MOTORRAD, "BMW", "I-KS 2021"),
                new Fahrzeug(MOTORRAD, "Suzuki", "K-KS 221"),
                new Fahrzeug(MOTORRAD, "BMW", "D-JS 2311")
        ));
        var koelnerTrucker = parkplatz.getFahrzeuge()
                .stream()
                .filter(f -> f.getFahrzeugklasse() == LKW)
                .filter(f -> f.getKennzeichen().startsWith("K-"))
                .collect(Collectors.toList());
        koelnerTrucker.forEach(System.out::println);
    }
}
