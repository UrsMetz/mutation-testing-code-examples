package mutation.testing.examples.order.processor;

import mutation.testing.examples.order.processor.article.OrderArticle;
import mutation.testing.examples.order.processor.billing.BillingSystem;
import mutation.testing.examples.order.processor.ordernumber.OrderNumberCreator;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@Ignore
public class OrderProcessor2Test {
    private static final String ORDER_NUMBER = "O-123";
    public static final String ARTICLE_NAME = "ARTICLE";
    private static final double ARTICLE_PRICE = 33.56;
    public static final int QUANTITY = 1;
    private final OrderArticle article = new OrderArticle(ARTICLE_NAME, ARTICLE_PRICE);

    @Test
    public void processesOrder() throws Exception {
        OrderProcessor orderProcessor = new OrderProcessor(new BillingSystemDummy(), new OrderNumberCreatorStub());

        String returnedOrderNumber = orderProcessor.processOrder(article, QUANTITY);
        assertThat(returnedOrderNumber, is(ORDER_NUMBER));
    }

    @Test
    public void tellsBillingSystemAboutArticle() throws Exception {
        BillingSystemMock billingSystem = new BillingSystemMock();
        OrderProcessor orderProcessor = new OrderProcessor(billingSystem, new OrderNumberCreatorStub());

        orderProcessor.processOrder(article, QUANTITY);
        assertThat(billingSystem.getNameUserInCall(), is(ARTICLE_NAME));
        assertThat(billingSystem.getPriceUserInCall(), is(ARTICLE_PRICE));
    }

    private static class OrderNumberCreatorStub implements OrderNumberCreator {
        @Override
        public String createOrderNumber() {
            return ORDER_NUMBER;
        }
    }

    private class BillingSystemMock implements BillingSystem {
        private String nameUserInCall;
        private double priceUserInCall;

        @Override
        public void bill(String name, double price, int quantity) {
            nameUserInCall = name;
            priceUserInCall = price;
        }

        public String getNameUserInCall() {
            return nameUserInCall;
        }

        public double getPriceUserInCall() {
            return priceUserInCall;
        }
    }
}
