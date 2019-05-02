package hu.crs.designpatterns.creational.abstractfactory.product;

public abstract class Accessory {
    private String id;

    public abstract String use();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
