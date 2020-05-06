import attractions.Attraction;
import behaviours.IReviewed;
import people.Visitor;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<IReviewed> reviewed;

    public ThemePark(ArrayList<IReviewed> reviewed) {
        this.reviewed = reviewed;
    }

    public ArrayList<IReviewed> getAllReviewed() {
        return this.reviewed;
    }

    public void visit(Visitor visitor, Attraction attraction) {
        int newVisitCount = attraction.getVisitCount() + 1;
        attraction.setVisitCount(newVisitCount);
        reviewed.add(attraction);
    }

}
