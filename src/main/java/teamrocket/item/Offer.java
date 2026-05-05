package teamrocket.item;

public interface Offer {
    String size();
    int value();
    int compareTo(Offer offer);
}
