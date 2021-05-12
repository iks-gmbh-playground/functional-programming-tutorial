package com.iksgmbh.codingclub.functional.streams.loesungen.part2


data class Parkplatz(val name: String, val fahrzeuge: Set<Fahrzeug>)

data class Fahrzeug(val fahrzeugKlasse: Fahrzeugklasse, val hersteller: String, val kennzeichen: String? = null)

enum class Fahrzeugklasse { LKW, PKW, MOTORRAD }

fun bestimmeOrt(kennzeichen: String): String? {
    when {
        kennzeichen.startsWith("K-") -> return "Köln"
        kennzeichen.startsWith("D-") -> return "Düsseldorf"
        kennzeichen.startsWith("B-") -> return "Berlin"
        else -> return null
    }
}

fun main() {
    val wiesenstr = Parkplatz(
        "Wiesenstraße", setOf(
            Fahrzeug(Fahrzeugklasse.LKW, "MAN", "D-FS 1234"),
            Fahrzeug(Fahrzeugklasse.LKW, "Iveco", "KS-MC 3235"),
            Fahrzeug(Fahrzeugklasse.PKW, "VW", "K-HC 1234"),
            Fahrzeug(Fahrzeugklasse.PKW, "MERCEDES", "DU-AA 123"),
            Fahrzeug(Fahrzeugklasse.MOTORRAD, "BMW", "I-KS 2021"),
            Fahrzeug(Fahrzeugklasse.MOTORRAD, "BMW", "D-JS 2311")
        )
    )
    val elisenstr = Parkplatz(
        "Elisenstraße", setOf(
            Fahrzeug(Fahrzeugklasse.LKW, "Mercedes", "B-BB 889"),
            Fahrzeug(Fahrzeugklasse.LKW, "Mercedes", "K-WW 3442"),
            Fahrzeug(Fahrzeugklasse.PKW, "Nissan", "NE-SR 2155"),
            Fahrzeug(Fahrzeugklasse.PKW, "VW", null),
            Fahrzeug(Fahrzeugklasse.MOTORRAD, "Suzuki", "K-KS 221")
        )
    )
    val gruenstr = Parkplatz(
        "Grünstraße", setOf(
            Fahrzeug(Fahrzeugklasse.LKW, "Iveco", "K-AC 2332"),
            Fahrzeug(Fahrzeugklasse.PKW, "Audi", "D-MM 3784")
        )
    )
    val alleParkplaetze = setOf(wiesenstr, elisenstr, gruenstr)

    alleParkplaetze
        .flatMap { it.fahrzeuge }
        .mapNotNull { it.kennzeichen }
        .mapNotNull { bestimmeOrt(it) }
        .groupingBy { it }
        .eachCount()
        .forEach { (stadt, wert) -> println("$stadt: $wert") }
}