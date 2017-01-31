package hu.crs.designpatterns.creational.singleton;

public class Elvis {
    private static Elvis instance;

    private Elvis() {
    }

    public static synchronized Elvis getInstance() {
        if (instance == null) {
            instance = new Elvis();
            return instance;
        } else {
            return instance;
        }
    }
}
