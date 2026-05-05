package teamrocket.criteria;

import teamrocket.item.Item;
import teamrocket.item.Offer;

import java.util.ArrayList;
import java.util.List;

public class Size implements Criteria {
    private final String size;

    public Size(String size) {
        this.size = size;
    }

    private String getSize(){
        return this.size;
    }


    @Override
    public List<Offer> checkCriteria(Item item) {
        List<Offer> offers = item.offers();
        List<Offer> sizeList = new ArrayList<>();

        for (Offer offer : offers) {
            if (offer.size().equalsIgnoreCase(getSize())) {
                sizeList.add(offer);
            }
        }

        return sizeList;
    }
}
