package be.pxl.ja.knapsack;

import java.util.Collections;
import java.util.List;

public class KnapsackUtil {

    public static <T extends Item & Comparable<T>> void fill(Knapsack<T> knapsack, List<T> items) {
        Collections.sort(items);
        for (T item : items) {
            try {
                knapsack.add(item);
            } catch (KnapsackFullException e) {
                e.printStackTrace();
            }
        }
    }

}
