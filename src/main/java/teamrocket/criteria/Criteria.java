package teamrocket.criteria;

import teamrocket.item.Item;
import teamrocket.item.Offer;
import java.util.List;

public interface Criteria {
    List<Offer> checkCriteria(Item item);
}
