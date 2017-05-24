package example.health;

import dagger.Component;

@Component(modules = HealthCheckModule.class)
public interface ExampleApp {
    HealthCheck healthCheck();
}
