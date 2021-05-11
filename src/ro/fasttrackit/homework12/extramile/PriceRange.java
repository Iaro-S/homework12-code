package ro.fasttrackit.homework12.extramile;

public class PriceRange {
    private int startingPrice;
    private int endingPrice;

    public PriceRange(int startingPrice, int endingPrice) {
        this.startingPrice = startingPrice;
        this.endingPrice = endingPrice;
    }

    public int getStartingPrice() {
        return startingPrice;
    }

    public int getEndingPrice() {
        return endingPrice;
    }

    @Override
    public String toString() {
        return "PriceRange{" +
                "startingPrice=" + startingPrice +
                ", endingPrice=" + endingPrice +
                '}';
    }
}
