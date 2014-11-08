package mutation.testing.examples.order.processor;

import mutation.testing.examples.order.processor.billing.BillingSystem;

class BillingSystemDummy implements BillingSystem {
    @Override
    public void bill(String name, double price, int quantity) {
    }
}
