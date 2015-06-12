package mutation.testing.examples.order.processor;

import mutation.testing.examples.order.processor.article.OrderArticle;
import mutation.testing.examples.order.processor.ordernumber.OrderNumberCreator;
import mutation.testing.examples.order.processor.testdouble.BillingSystemDummy;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class OrderProcessorWeakTest {
    private static final String ORDER_NUMBER = "O-123";
    public static final String ARTICLE_NAME = "ARTICLE";
    private static final double ARTICLE_PRICE = 33.56;
    public static final int QUANTITY = 1;
    private final OrderArticle article = new OrderArticle(
            ARTICLE_NAME, ARTICLE_PRICE);

    @Test
    public void processesOrder() throws Exception {
        OrderProcessor orderProcessor = new OrderProcessor(new BillingSystemDummy(),
                new OrderNumberCreatorStub());

        String returnedOrderNumber = orderProcessor.processOrder(article, QUANTITY);
        assertThat(returnedOrderNumber, is(ORDER_NUMBER));
    }

    private static class OrderNumberCreatorStub implements OrderNumberCreator {
        @Override
        public String createOrderNumber() {
            return ORDER_NUMBER;
        }
    }

}
