package attractions;

import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster extends Attraction implements ITicketed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getHeight() > 145 && visitor.getAge() > 12;
    }

    public double defaultPrice() {
        return 8.40;
    }

    public double priceForVisitor(Visitor visitor) {
        double result = defaultPrice();
        if (visitor.getHeight() > 200) {
            result *= 2;
        }
        return result;
    }
}
