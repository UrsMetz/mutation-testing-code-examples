package mutation.testing.examples.order.processor.testdouble;

import mutation.testing.examples.order.processor.billing.BillingSystem;

public class BillingSystemDummy implements BillingSystem {
    @Override
    public void bill(String name, double price, int quantity) {
    }
}
