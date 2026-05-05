package teamrocket.criteria;

import teamrocket.item.Ask;
import teamrocket.item.Item;
import teamrocket.item.Offer;

import java.util.ArrayList;
import java.util.List;

public class Asks implements Criteria{

    public Asks() {}

    @Override
    public List<Offer> checkCriteria(Item item) {
        List<Offer> asksList = new ArrayList<>();

        for (Offer offer : item.offers()) {
            if (offer instanceof Ask) {
                asksList.add(offer);
            }
        }

        return asksList;
    }
}
