package com.iksgmbh.codingclub.functional.part2;

import com.iksgmbh.codingclub.functional.part2.fahrzeug.Auto;
import com.iksgmbh.codingclub.functional.part2.route.RouteZumAldi;

public class Fahrt {
    public static void main(String[] args) {
        var auto = new Auto();
        auto.fahren(new RouteZumAldi());
    }
}
