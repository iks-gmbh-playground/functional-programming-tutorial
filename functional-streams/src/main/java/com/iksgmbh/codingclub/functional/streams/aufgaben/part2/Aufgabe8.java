package com.iksgmbh.codingclub.functional.streams.aufgaben.part2;

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
        // Hier kannst du mal noch ein wenig tiefer in die Optional Api einsteigen.
        // Hole von oben jeweils die 4 Kennzeichen, schmeiss es in den KennzeichenBestimmer und schaue nach, ob ein Ort dazu
        // gefunden wurde :)
    }
}
