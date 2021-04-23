package com.iksgmbh.codingclub.functional.subscriber.loesung;

import reactor.core.publisher.Flux;

import java.util.Set;
import java.util.function.Consumer;

public class Aufgabe2 {
    public static void main(String[] args) throws InterruptedException {
        Set<Consumer<String>> consumers = Set.of(
                item -> System.out.println("1 received: " + item),
                item -> System.out.println("2 received: " + item),
                item -> System.out.println("3 received: " + item)
        );

        Flux<Integer> flux = Flux.create(emitter -> {
            emitter.next(1);
            emitter.next(2);
            emitter.next(3);
        });

        consumers.forEach(consumer -> flux.map(String::valueOf).subscribe(consumer));
        System.out.println("Lege mich schlafen");
        Thread.sleep(1000);
        System.out.println("Und Tschüss");
    }
}
