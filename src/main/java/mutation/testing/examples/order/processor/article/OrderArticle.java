package mutation.testing.examples.order.processor.article;

public class OrderArticle {
    private String name;
    private double price;

    public OrderArticle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
