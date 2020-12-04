import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleAssert {

    @Test
    void simpleTest() {
        assertEquals(2 * 2, 4);
    }

}
