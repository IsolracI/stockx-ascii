package teamrocket.criteria;

import teamrocket.item.Item;
import teamrocket.item.Offer;

import java.util.List;

public class LastSale implements Criteria {

    public LastSale() {}

    @Override
    public List<Offer> checkCriteria(Item item) {
        Criteria sales = new Sales();
        return sales.checkCriteria(item).reversed();
    }
}
