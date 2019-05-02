package hu.crs.designpatterns.structural.decorator.interfaces;

public abstract class DressDecorator implements Kid {

    /**
     * The object which is decorated
     */
    protected Kid kid;

    /**
     * Color of the dress
     */
    private Color color;

    /**
     * Enforce constructor creation in child classes
     *
     * Abstract constructors will frequently be used to enforce class constraints or invariants such as the minimum fields required to setup the class.
     * http://stackoverflow.com/questions/260666/can-an-abstract-class-have-a-constructor
     *
     * @param kid The kid to decorate
     * @param color The color of the dress
     */
    public DressDecorator(final Kid kid, final Color color) {
        this.kid = kid;
        this.color = color;
    }

    /**
     * Display the chain of hu.crs.designpatterns.structural.decorator.decorators' display which wraps kid (by implementing the method here child classes don't have to implement it)
     * @return String representation of hu.crs.designpatterns.structural.decorator.decorators around kid
     */
    @Override
    public String display() {
        return kid.display() + " "+ color.name() + " " + this.getClass().getSimpleName();
    }
}
