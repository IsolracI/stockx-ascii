package teamrocket.criteria;

import teamrocket.item.Bid;
import teamrocket.item.Item;
import teamrocket.item.Offer;

import java.util.ArrayList;
import java.util.List;

public class Bids implements Criteria {

    public Bids() {}

    @Override
    public List<Offer> checkCriteria(Item item) {
        List<Offer> bidsList = new ArrayList<>();

        for (Offer offer : item.offers()) {
            if (offer instanceof Bid) {
                bidsList.add(offer);
            }
        }

        return bidsList;
    }
}
