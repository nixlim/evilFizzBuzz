import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FailingTest {

    @Test
    public void failingTestToStopGreenBuild() {
        assertEquals(1,0);
    }

}
