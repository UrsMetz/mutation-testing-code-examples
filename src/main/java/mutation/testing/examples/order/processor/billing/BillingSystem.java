package mutation.testing.examples.order.processor.billing;

public interface BillingSystem {
    void bill(String name, double price, int quantity);
}
