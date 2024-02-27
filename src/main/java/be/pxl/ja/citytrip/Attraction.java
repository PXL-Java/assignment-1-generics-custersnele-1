package be.pxl.ja.citytrip;

import be.pxl.ja.knapsack.Item;

public class Attraction implements Comparable<Attraction>, Item {
    private final String name;
    private final double days;
    private final int rating;

    public Attraction(String name, double time, int rating) {
        this.name = name;
        this.days = time;
        this.rating = rating;
    }


    public double getWeight() {
        return days;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Attraction attraction) {
        return attraction.rating - rating;
    }

    @Override
    public String toString() {
        return "Attraction{" +
                "name='" + name + '\'' +
                ", days=" + days +
                ", rating=" + rating +
                '}';
    }
}
