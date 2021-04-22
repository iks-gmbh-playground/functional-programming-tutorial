package com.iksgmbh.codingclub.functional.streams.loesungen.part1;

import com.iksgmbh.codingclub.functional.streams.loesungen.part1.domain.Fahrzeug;
import com.iksgmbh.codingclub.functional.streams.loesungen.part1.domain.Parkplatz;

import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import static com.iksgmbh.codingclub.functional.streams.loesungen.part1.domain.Fahrzeugklasse.*;
import static java.util.stream.Collectors.groupingBy;

public class Aufgabe7 {
    public static void main(String[] args) {
        var wiesenstr = new Parkplatz("Wiesenstraße", Set.of(
                new Fahrzeug(LKW, "MAN", "D-FS 1234"),
                new Fahrzeug(LKW, "Iveco", "KS-MC 3235"),
                new Fahrzeug(PKW, "VW", "K-HC 1234"),
                new Fahrzeug(PKW, "MERCEDES", "DU-AA 123"),
                new Fahrzeug(MOTORRAD, "BMW", "I-KS 2021"),
                new Fahrzeug(MOTORRAD, "BMW", "D-JS 2311")
        ));
        var elisenstr = new Parkplatz("Elisenstraße", Set.of(
                new Fahrzeug(LKW, "Mercedes", "B-BB 889"),
                new Fahrzeug(LKW, "Mercedes", "K-WW 3442"),
                new Fahrzeug(PKW, "Nissan", "NE-SR 2155"),
                new Fahrzeug(PKW, "VW", "NE-CT 4122"),
                new Fahrzeug(MOTORRAD, "Suzuki", "K-KS 221")
        ));
        var gruenstr = new Parkplatz("Grünstraße", Set.of(
                new Fahrzeug(LKW, "Iveco", "K-AC 2332"),
                new Fahrzeug(PKW, "Audi", "D-MM 3784")
        ));
        var alleParkplaetze = Set.of(wiesenstr, elisenstr, gruenstr);

        var fahrzeugeByFahrzeugklasse = alleParkplaetze.stream()
                .flatMap(p -> p.getFahrzeuge().stream())
                .collect(groupingBy(Fahrzeug::getFahrzeugklasse));
        fahrzeugeByFahrzeugklasse.forEach((klasse, fahrzeuge) -> System.out.println(klasse + ": " + fahrzeuge.size()));

        var fahrzeugeByFahrzeugklasseDirektGezaehlt = alleParkplaetze.stream()
                .flatMap(p -> p.getFahrzeuge().stream())
                .map(Fahrzeug::getFahrzeugklasse)
                .collect(groupingBy(Function.identity(), Collectors.counting()));
        fahrzeugeByFahrzeugklasseDirektGezaehlt.forEach((klasse, anzahl) -> System.out.println(klasse + ": " + anzahl));

    }
}
