package com.iksgmbh.codingclub.functional.subscriber.loesung;


import java.util.Set;
import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;


public class Aufgabe1 {


    public static void main(String[] args) throws InterruptedException {
        var publisher = new SubmissionPublisher<String>();
        var subscribers = Set.of(
                new TextSubscriber("1"),
                new TextSubscriber("2"),
                new TextSubscriber("3"));


        subscribers.forEach(publisher::subscribe);
        publisher.submit("Hallo");
        publisher.close();
        System.out.println("Lege mich schlafen");
        Thread.sleep(1000);
        System.out.println("Und Tschüss");
    }

    public static class TextSubscriber implements Flow.Subscriber<String> {

        private String id;
        private Flow.Subscription subscription;

        public TextSubscriber(String id) {
            this.id = id;
        }

        @Override
        public void onSubscribe(Flow.Subscription subscription) {
            this.subscription = subscription;
            System.out.println(id + " subscribed");
            subscription.request(1);
        }

        @Override
        public void onNext(String item) {
            System.out.println(id + " received: " + item);
            subscription.request(1);
        }

        @Override
        public void onError(Throwable throwable) {
            System.out.println(id + "received an Error: " + throwable.getMessage());
        }

        @Override
        public void onComplete() {
            System.out.println(id + " completed");
        }
    }

}
