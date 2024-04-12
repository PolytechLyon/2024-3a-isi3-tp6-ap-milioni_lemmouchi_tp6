package fr.polytech.sim;

import java.util.Random;

/**
 * A clock used to synchronize simulations.
 */
public class Clock {
    private static Clock instance;
    private final int time;


    private Clock() {
        this.time = new Random().nextInt(25); // Random integer between 0 and 24 inclusive.
    }

    public static synchronized Clock getInstance() {
        if (instance == null) {
            instance = new Clock();
        }
        return instance;
    }

    public int getTime() {
        return this.time;
    }
}
