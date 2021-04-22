package com.iksgmbh.codingclub.functional.streams.loesungen.part2.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

@Data
@AllArgsConstructor
public class Parkplatz {
    private String standort;
    private Set<Fahrzeug> fahrzeuge;
}
