package interfaces;

public abstract class DressDecorator implements Kid {
    protected Kid kid;


    /*
    Abstract constructors will frequently be used to enforce class constraints or invariants such as the minimum fields required to setup the class.
    http://stackoverflow.com/questions/260666/can-an-abstract-class-have-a-constructor
    */
    public DressDecorator(Kid kid) {
        this.kid = kid;
    }

    @Override
    public String display() {
        return kid.display() + " " + this.getClass().getSimpleName();
    }
}
