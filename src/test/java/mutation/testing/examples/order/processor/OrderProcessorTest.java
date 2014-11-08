package mutation.testing.examples.order.processor;

import mutation.testing.examples.order.processor.article.OrderArticle;
import mutation.testing.examples.order.processor.ordernumber.OrderNumberCreator;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class OrderProcessorTest {
    private static final String ORDER_NUMBER = "O-123";

    @Test
    public void processesOrder() throws Exception {
        OrderProcessor orderProcessor = new OrderProcessor(new BillingSystemDummy(), new OrderNumberCreatorStub());

        String returnedOrderNumber = orderProcessor.processOrder(new OrderArticle("ARTICLE"), 1);
        assertThat(returnedOrderNumber, is(ORDER_NUMBER));
    }

    private static class OrderNumberCreatorStub implements OrderNumberCreator {
        @Override
        public String createOrderNumber() {
            return ORDER_NUMBER;
        }
    }

}
