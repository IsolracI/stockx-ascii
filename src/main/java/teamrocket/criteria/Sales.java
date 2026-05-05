package teamrocket.criteria;

import teamrocket.item.Bid;
import teamrocket.item.Item;
import teamrocket.item.Offer;
import teamrocket.item.Sale;

import java.util.ArrayList;
import java.util.List;

public class Sales implements Criteria {

    public  Sales() {}

    @Override
    public List<Offer> checkCriteria(Item item) {
        List<Offer> salesList = new ArrayList<>();

        for (Offer offer : item.offers()) {
            if (offer instanceof Sale) {
                salesList.add(offer);
            }
        }

        return salesList;
    }
}
