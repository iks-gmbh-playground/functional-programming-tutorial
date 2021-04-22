package com.iksgmbh.codingclub.functional.streams.aufgaben.part2;

import com.iksgmbh.codingclub.functional.streams.aufgaben.part2.domain.Fahrzeug;
import com.iksgmbh.codingclub.functional.streams.aufgaben.part2.domain.KennzeichenBestimmer;
import com.iksgmbh.codingclub.functional.streams.aufgaben.part2.domain.Parkplatz;

import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import static com.iksgmbh.codingclub.functional.streams.aufgaben.part2.domain.Fahrzeugklasse.*;
import static java.util.stream.Collectors.groupingBy;

public class Aufgabe9 {
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
                new Fahrzeug(PKW, "VW", null),
                new Fahrzeug(MOTORRAD, "Suzuki", "K-KS 221")
        ));
        var gruenstr = new Parkplatz("Grünstraße", Set.of(
                new Fahrzeug(LKW, "Iveco", "K-AC 2332"),
                new Fahrzeug(PKW, "Audi", "D-MM 3784")
        ));
        var alleParkplaetze = Set.of(wiesenstr, elisenstr, gruenstr);

        // MasterClass - Das Kennzeichen ist jetzt leider kein String mehr, sondern Optional. Oben versteckt sich ein
        // Fahrzeug, was bereits abgemeldet wurde, sprich, kein Kennzeichen mehr besitzt. Nullst du noch, oder
        // Optionalst du schon? :)

        // Jetzt gehts ans eingemachte!
        // Ich hätte gerne, dass du mir alle Kennzeichen holst und anhand der Kennzeichen die Städte du kennst (Kennzeichenbestimmer)
        // der dort parkenden Fahrzeuge sammelst und zusammenzählst. :) Heavy shit...
        var kennzeichen = alleParkplaetze.stream()
                .flatMap(p -> p.getFahrzeuge().stream())
                .map(Fahrzeug::getKennzeichen)
                .flatMap(Optional::stream)
                .map(KennzeichenBestimmer::bestimmeOrt)
                .flatMap(Optional::stream)
                .collect(groupingBy(Function.identity(), Collectors.counting()));
        kennzeichen.forEach((key, values) -> System.out.println(key + ": " + values));


    }
}
