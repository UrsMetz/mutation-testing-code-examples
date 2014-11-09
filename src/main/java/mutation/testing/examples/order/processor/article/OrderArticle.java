package mutation.testing.examples.order.processor.article;

public class OrderArticle {
    private String name;
    private double price;

    public OrderArticle(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
