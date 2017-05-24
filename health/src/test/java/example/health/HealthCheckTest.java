package example.health;

import org.junit.Test;

public class HealthCheckTest {

    @Test
    public void works() throws Exception {
        new HealthCheck().markStatus("good");
    }
}
