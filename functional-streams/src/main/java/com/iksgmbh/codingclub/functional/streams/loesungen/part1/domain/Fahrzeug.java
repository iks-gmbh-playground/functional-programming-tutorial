package com.iksgmbh.codingclub.functional.streams.loesungen.part1.domain;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Fahrzeug {
    private Fahrzeugklasse fahrzeugklasse;
    private String hersteller;
    private String kennzeichen;
}
