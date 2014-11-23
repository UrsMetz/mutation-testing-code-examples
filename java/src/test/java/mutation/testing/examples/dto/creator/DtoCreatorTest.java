package mutation.testing.examples.dto.creator;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class DtoCreatorTest {
    @Test
    public void createsDto() throws Exception {
        Dto dto = DtoCreator.createDto("John", "Doe");
        assertThat(dto.getFirstName(), is("John"));
    }
}
