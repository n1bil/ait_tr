package main.lesson_56.classworkHomework.model;

import java.time.LocalDate;
import java.util.Objects;

public class Product {
    private long barCode;
    private String name;
    private String category;
    private String brand;
    private double price;
    private LocalDate localDate;

    public Product(long barCode, String name, String category, String brand, double price, LocalDate localDate) {
        this.barCode = barCode;
        this.name = name;
        this.category = category;
        this.brand = brand;
        this.price = price;
        this.localDate = localDate;
    }

    public long getBarCode() {
        return barCode;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "barCode=" + barCode +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", localDate=" + localDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return barCode == product.barCode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(barCode);
    }
}
