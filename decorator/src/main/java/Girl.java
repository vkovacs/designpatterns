import interfaces.Kid;

public class Girl implements Kid {
    public Girl() {
    }

    @Override
    public double dressCost() {
        return 0;
    }

    @Override
    public String display() {
        return "Girl in";
    }
}
