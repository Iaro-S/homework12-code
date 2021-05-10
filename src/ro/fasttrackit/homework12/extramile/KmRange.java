package ro.fasttrackit.homework12.extramile;

import java.util.Objects;

public class KmRange {
    private final int startKm;
    private final int endKm;

    public KmRange(int startKm, int endKm) {
        this.startKm = startKm;
        this.endKm = endKm;
    }

    public int getStartKm() {
        return startKm;
    }

    public int getEndKm() {
        return endKm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof KmRange)) return false;
        KmRange range = (KmRange) o;
        return getStartKm() == range.getStartKm() && getEndKm() == range.getEndKm();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStartKm(), getEndKm());
    }

    @Override
    public String toString() {
        return "Range{" +
                "startKm=" + startKm +
                ", endKm=" + endKm +
                '}';
    }
}
