package ua.ithillel.oop.sport;

public interface Runner {
    int DEFAULT_DISTANCE = 1000; // always static final - snake case

    void run(int distance);

    default void run() {
        System.out.println("default runner");

        run(DEFAULT_DISTANCE);
    }
}
