package teamrocket.criteria;

import teamrocket.item.Item;
import teamrocket.item.Offer;

import java.util.*;

public class MaxBid implements Criteria {

    public MaxBid() {}

    @Override
    public List<Offer> checkCriteria(Item item) {
        Criteria bids = new Bids();
        List<Offer> itemBids = bids.checkCriteria(item);

        itemBids.sort(Comparator.comparingInt(Offer::value).reversed());

        return itemBids;
    }
}
