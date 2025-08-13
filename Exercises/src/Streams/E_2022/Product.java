package Streams.E_2022;

public class Product {
    private final Category category;
    private final int price;

    public Product(Category category, int price){
        this.category = category;
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "category=" + category +
                ", price=" + price +
                '}';
    }
}
