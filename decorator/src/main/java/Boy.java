import interfaces.Kid;

public class Boy implements Kid {

    public Boy() {
    }

    @Override
    public double dressCost() {
        return 0;
    }

    @Override
    public String display() {
        return "Boy in";
    }
}
