package be.pxl.ja.robbery;

import be.pxl.ja.knapsack.Knapsack;
import be.pxl.ja.knapsack.KnapsackUtil;

import java.util.ArrayList;
import java.util.List;

public class Robbery {
    public static void main(String[] args) {
        Knapsack<Product> knapsack = new Knapsack<>(35);

        List<Product> shop = new ArrayList<>();
        shop.add(new Product("laptop", 20, 2000));
        shop.add(new Product("stereo", 30, 3000));
        shop.add(new Product("watch", 1, 850.5));
        shop.add(new Product("guitar", 15, 1500));

        KnapsackUtil.fill(knapsack, shop);

        System.out.println("\nList of products:");
        for (Product product : knapsack.getItems()) {
            System.out.println(product);
        }
    }
}
