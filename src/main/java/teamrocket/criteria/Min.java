package teamrocket.criteria;

import teamrocket.item.Item;
import teamrocket.item.Offer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Min implements Criteria {
    private final Criteria criteria;
    private final Criteria otherCriteria;

    public Min(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        List<Offer> CriteriaList = criteria.checkCriteria(item);
        List<Offer> otherCriteriaList = otherCriteria.checkCriteria(item);

        List<Offer> filteredList = new ArrayList<>();

        for (Offer offer : CriteriaList) {
            for (Offer otherOffer : otherCriteriaList) {
                if (offer == otherOffer) {
                    filteredList.add(offer);
                    break;
                }
            }
        }

        filteredList.sort(Comparator.comparingInt(Offer::value));

        return filteredList;
    }
}
