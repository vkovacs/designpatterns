package hu.crs.designpatterns.creational.simplefactory.product;

public abstract class Weapon {

    private String id;

    public abstract String attack();

    public Weapon(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}