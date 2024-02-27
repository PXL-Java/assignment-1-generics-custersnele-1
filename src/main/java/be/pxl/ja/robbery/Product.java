package be.pxl.ja.robbery;

import be.pxl.ja.knapsack.Item;

public class Product implements Comparable<Product>, Item {
    private String name;
    private double weight;
    private double price;

    public Product(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return  name + ", weight=" + weight + ", price=" + price;
    }

    @Override
    public int compareTo(Product product) {
        return Double.compare(product.price, price);
    }

    public double getWeight() {
        return weight;
    }
}
