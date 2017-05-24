package example.health;

import dagger.Module;
import dagger.Provides;

@Module
public class HealthCheckModule {
    @Provides
    public static HealthCheck provideHealthCheck() {
        return new HealthCheck();
    }

}
