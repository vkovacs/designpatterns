package interfaces;

public abstract class DressDecorator implements Kid {
    protected Kid kid;

    /**
     * Enforce constructor creation in child classes
     *
     * Abstract constructors will frequently be used to enforce class constraints or invariants such as the minimum fields required to setup the class.
     * http://stackoverflow.com/questions/260666/can-an-abstract-class-have-a-constructor
     *
     * @param kid The kid to decorate
     */
    public DressDecorator(Kid kid) {
        this.kid = kid;
    }

    /**
     * Display the chain of decorators' display which wraps kid (by implementing the method here child classes don't have to implement it)
     * @return String representation of decorators around kid
     */
    @Override
    public String display() {
        return kid.display() + " " + this.getClass().getSimpleName();
    }
}
