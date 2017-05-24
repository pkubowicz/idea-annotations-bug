package example.web;

import example.health.DaggerExampleApp;
import example.health.HealthCheck;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class FakeContextListener implements ServletContextListener {
    private final HealthCheck healthCheck;

    public FakeContextListener() {
        this.healthCheck = DaggerExampleApp.builder().build().healthCheck();
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        healthCheck.markStatus("Initialized");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        healthCheck.markStatus("Destroyed");
    }
}
