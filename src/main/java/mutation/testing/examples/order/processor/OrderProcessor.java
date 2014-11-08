package mutation.testing.examples.order.processor;

import mutation.testing.examples.order.processor.article.OrderArticle;
import mutation.testing.examples.order.processor.billing.BillingSystem;
import mutation.testing.examples.order.processor.ordernumber.OrderNumberCreator;

public class OrderProcessor {

    private BillingSystem billingSystem;
    private OrderNumberCreator orderNumberCreator;

    public OrderProcessor(BillingSystem billingSystem, OrderNumberCreator orderNumberCreator) {
        this.billingSystem = billingSystem;
        this.orderNumberCreator = orderNumberCreator;
    }

    public String processOrder(OrderArticle article, int quantity) {
        billingSystem.bill(makeUpper(article.getName()), article.getPrice(), quantity);
        return orderNumberCreator.createOrderNumber();
    }

    private static String makeUpper(String name) {
        return name.toUpperCase();
    }

}
