package com.iksgmbh.codingclub.functional.streams.loesungen.part2;

import com.iksgmbh.codingclub.functional.streams.loesungen.part2.domain.KennzeichenBestimmer;

import java.util.Optional;

public class Aufgabe8 {

    public static Optional<String> getKoelnerKennzeichen() {
        return Optional.of("K-HC 1234");
    }

    public static Optional<String> getDuesseldorferKennzeichen() {
        return Optional.of("D-SS 1233");
    }

    public static Optional<String> getAbgemeldet() {
        return Optional.empty();
    }

    public static Optional<String> getUnknown() {
        return Optional.of("H-RR 2200");
    }


    public static void main(String[] args) {
        System.out.println(getKoelnerKennzeichen().flatMap(KennzeichenBestimmer::bestimmeOrt)
                .orElse("Kein Ort gefunden"));
        System.out.println(getDuesseldorferKennzeichen().flatMap(KennzeichenBestimmer::bestimmeOrt)
                .orElse("Kein Ort gefunden"));
        System.out.println(getUnknown().flatMap(KennzeichenBestimmer::bestimmeOrt)
                .orElse("Kein Ort gefunden"));
        System.out.println(getAbgemeldet().flatMap(KennzeichenBestimmer::bestimmeOrt)
                .orElse("Kein Ort gefunden"));

    }
}
