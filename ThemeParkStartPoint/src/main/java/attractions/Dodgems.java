package attractions;

import behaviours.IReviewed;
import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    public Dodgems(String name, int rating) {
        super(name, rating);
    }

    @Override
    public double defaultPrice() {
        return 4.50;
    }

    @Override
    public double priceForVisitor(Visitor visitor) {
        double result = defaultPrice();
        if (visitor.getAge() < 12) {
            result /= 2;
        }
        return result;
    }
}
