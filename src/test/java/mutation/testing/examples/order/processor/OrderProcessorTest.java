package mutation.testing.examples.order.processor;

import mutation.testing.examples.order.processor.article.OrderArticle;
import mutation.testing.examples.order.processor.billing.BillingSystem;
import mutation.testing.examples.order.processor.ordernumber.OrderNumberCreator;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class OrderProcessorTest {
    private static final String ORDER_NUMBER = "O-123";
    public static final String ARTICLE_NAME = "ARTICLE";
    private final OrderArticle article = new OrderArticle(ARTICLE_NAME);

    @Test
    public void processesOrder() throws Exception {
        OrderProcessor orderProcessor = new OrderProcessor(new BillingSystemDummy(), new OrderNumberCreatorStub());

        String returnedOrderNumber = orderProcessor.processOrder(article, 1);
        assertThat(returnedOrderNumber, is(ORDER_NUMBER));
    }

    @Test
    public void tellsBillingSystemAboutArticle() throws Exception {
        BillingSystemMock billingSystem = new BillingSystemMock();
        OrderProcessor orderProcessor = new OrderProcessor(billingSystem, new OrderNumberCreatorStub());

        orderProcessor.processOrder(article, 1);
        assertThat(billingSystem.getNameUserInCall(), is(ARTICLE_NAME));
    }

    private static class OrderNumberCreatorStub implements OrderNumberCreator {
        @Override
        public String createOrderNumber() {
            return ORDER_NUMBER;
        }
    }

    private class BillingSystemMock implements BillingSystem {
        private String nameUserInCall;

        @Override
        public void bill(String name, double price, int quantity) {
            nameUserInCall = name;
        }

        public String getNameUserInCall() {
            return nameUserInCall;
        }
    }
}
