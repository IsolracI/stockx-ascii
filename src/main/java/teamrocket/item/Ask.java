package teamrocket.item;

public class Ask implements Offer {
    private final String size;
    private final Integer ask;

    public Ask(String size, Integer ask) {
        this.size = size;
        this.ask = ask;
    }

    @Override
    public String size() {
        return this.size;
    }

    @Override
    public int value() {
        return this.ask;
    }

    @Override
    public int compareTo(Offer offer) {
        return this.ask.compareTo(offer.value());
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
