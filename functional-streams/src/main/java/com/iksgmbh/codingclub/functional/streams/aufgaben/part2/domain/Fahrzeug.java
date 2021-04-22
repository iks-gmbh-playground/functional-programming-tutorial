package com.iksgmbh.codingclub.functional.streams.aufgaben.part2.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Optional;


@Data
@AllArgsConstructor
public class Fahrzeug {
    private Fahrzeugklasse fahrzeugklasse;
    private String hersteller;
    private String kennzeichen;

    public Optional<String> getKennzeichen() {
        return Optional.ofNullable(kennzeichen);
    }
}
