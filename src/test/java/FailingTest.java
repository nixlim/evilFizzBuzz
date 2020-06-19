import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FailingTest {

    @Test
    @Ignore
    public void failingTestToStopGreenBuild() {
        assertEquals(1,0);
    }

}
