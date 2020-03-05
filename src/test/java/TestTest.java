import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TestTest {

    @Test
    public void testAdd() {
        com.mh.test.Test d = new com.mh.test.Test();
        assertEquals(7, d.add(3, 4));
    }

    @Test
    public void testSub() {

    }
}