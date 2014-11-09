package mutation.testing.examples.add;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class AdderTest {
    @Test
    public void adding() throws Exception {
        Adder.add(1, 2);
    }

    @Test
    public void addingZeros() throws Exception {
        int sum = Adder.add(0, 0);
        assertThat(sum, is(0));
    }
}
