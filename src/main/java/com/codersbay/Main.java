package com.codersbay;

import java.time.Duration;
import java.time.Instant;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        callFriend();
        callMother();
        callNana();
    }

    public static void timeCalling(String person, Calling calling) throws InterruptedException {
        Instant now = Instant.now();
        calling.call();
        Instant later = Instant.now();
        long time = Duration.between(now, later).toMillis();
        System.out.println("I called " + person + " for " + time + " milli-seconds.");
    }


    public static void callFriend() throws InterruptedException {
        timeCalling("Flo", () -> {
            Thread.sleep(1000);
        });
    }

    public static void callMother() throws InterruptedException {
        timeCalling("Mom", () -> {
            Thread.sleep(500);
        });
    }

    public static void callNana() throws InterruptedException {
        timeCalling("Nana", () -> {
            Thread.sleep(700);
        });
    }

}
