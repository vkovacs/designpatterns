import interfaces.Kid;

public class Girl implements Kid {
    @Override
    public double dressCost() {
        return 0;
    }

    @Override
    public String display() {
        return "Girl in";
    }
}
