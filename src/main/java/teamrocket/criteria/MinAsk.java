package teamrocket.criteria;

import teamrocket.item.Item;
import teamrocket.item.Offer;

import java.util.Comparator;
import java.util.List;

public class MinAsk implements Criteria {

    public MinAsk() {}


    @Override
    public List<Offer> checkCriteria(Item item) {
        Criteria asks = new Asks();
        List<Offer> itemAsks = asks.checkCriteria(item);

        itemAsks.sort(Comparator.comparingInt(Offer::value));

        return itemAsks;
    }
}
