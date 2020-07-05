import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

@DisplayName("Example test")
class HelloWorldTest {
    @Test
    void messageTest() {
        String msg = new HelloWorld().message();
        assertThat(msg, is("Hello World!"));
    }
}