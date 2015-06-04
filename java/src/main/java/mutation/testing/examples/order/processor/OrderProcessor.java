package mutation.testing.examples.order.processor;

import mutation.testing.examples.order.processor.article.OrderArticle;
import mutation.testing.examples.order.processor.billing.BillingSystem;
import mutation.testing.examples.order.processor.ordernumber.OrderNumberCreator;
import mutation.testing.examples.util.StringUtil;

public class OrderProcessor {

    private BillingSystem billingSystem;
    private OrderNumberCreator orderNumberCreator;

    public OrderProcessor(BillingSystem billingSystem,
                          OrderNumberCreator orderNumberCreator) {
        this.billingSystem = billingSystem;
        this.orderNumberCreator = orderNumberCreator;
    }

    public String processOrder(OrderArticle article, int quantity) {
        billingSystem.bill(StringUtil.makeUpper(article.getName()),
                article.getPrice(), quantity);
        return orderNumberCreator.createOrderNumber();
    }

}
