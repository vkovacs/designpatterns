package interfaces;

//Kid could be also implemented as an abstract class. Display could be implemented here by showing a property of the class, which property could be overwritten in child classes
public interface Kid {
    /**
     * Calculates the cost of the dresses worn by the kid
     * @return Sum cost of dresses worn by the kid
     */
    double dressCost();

    /**
     * Display the dresses on the kid
     * @return Dresses on the kid in string form
     */
    String display();
}
