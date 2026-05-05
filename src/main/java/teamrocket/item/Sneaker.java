package teamrocket.item;

import java.util.ArrayList;
import java.util.List;

public class Sneaker implements Item {
    private final String style;
    private final String name;
    private List<Offer> offers = new ArrayList<>();
    private int sale;
    private int ask;
    private int bid;

    public Sneaker(String style, String name) {
        this.style = style;
        this.name = name;
        this.sale = 0;
        this.ask = 0;
        this.bid = 0;
    }

    public String getStyle() {
        return this.style;
    }
    public String getName() {
        return this.name;
    }

    @Override
    public void setSale(int sale) {
        this.sale = sale;
    }

    @Override
    public int getSale() {
        return this.sale;
    }

    @Override
    public void setBid(int bid) {
        this.bid = bid;
    }

    @Override
    public int getBid() {
        return this.bid;
    }

    @Override
    public void setAsk(int ask) {
        this.ask = ask;
    }

    @Override
    public int getAsk() {
        return this.ask;
    }

    @Override
    public void add(Offer offer) {
        offers().add(offer);
    }

    @Override
    public List<Offer> offers() {
        return this.offers;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append(getName());
        string.append("\n");
        string.append("\t\t");
        string.append(getStyle());
        return string.toString();
    }
}
