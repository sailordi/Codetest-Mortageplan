import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*! Tests preforming exp on a number */
public class ExponentTest {
    @Test
    void test() {
        MortageHandler m = new MortageHandler();
        double out = m.exp(2.5,5);

        assertEquals(97.65625, out);
    }

}
