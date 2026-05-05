package teamrocket.item;

public class Sale implements Offer {
    private final String size;
    private final Integer price;

    public Sale(String size, Integer price) {
        this.size = size;
        this.price = price;
    }

    @Override
    public String size() {
        return this.size;
    }

    @Override
    public int value() {
        return this.price;
    }

    @Override
    public int compareTo(Offer offer) {
        return this.price.compareTo(offer.value());
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("\t\t");
        string.append(size());
        string.append("\t\t");
        string.append(value());
        string.append("\n");
        return string.toString();
    }
}
