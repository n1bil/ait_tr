package main.lesson_17.homework;

public class Product {

    private double price;
    private String name;
    private long barCode;

    public Product(double price, String name, long barCode) {
        this.price = price;
        this.name = name;
        this.barCode = barCode;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", barCode=" + barCode +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Product)) {
            return false;
        }
        Product product = (Product) o;
        return price == product.price && barCode == product.barCode && name.equals(product.name);
    }


}
