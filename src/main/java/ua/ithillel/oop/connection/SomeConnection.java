package ua.ithillel.oop.connection;

public class SomeConnection {
    // eager init
//    private static SomeConnection INSTANCE = new SomeConnection();
    private static SomeConnection INSTANCE;

    // fields
    private SomeConnection() {}

    public static SomeConnection getInstance() {
        // lazy init
        if (INSTANCE == null) {
            INSTANCE = new SomeConnection();
        }

        return INSTANCE;
    }

}
