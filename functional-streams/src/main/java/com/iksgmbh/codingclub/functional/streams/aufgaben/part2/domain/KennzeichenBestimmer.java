package com.iksgmbh.codingclub.functional.streams.aufgaben.part2.domain;

import java.util.Optional;

public class KennzeichenBestimmer {
    public static Optional<String> bestimmeOrt(String kennzeichen) {
        if (kennzeichen.startsWith("K-")) return Optional.of("Köln");
        if (kennzeichen.startsWith("D-")) return Optional.of("Düsseldorf");
        else return Optional.empty();
    }
}
