package stalls;

import people.Visitor;

public class TobaccoStall extends Stall {

    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot, int rating) {
        super(name, rating, ownerName, parkingSpot);
    }

    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() >= 18;
    }
}
