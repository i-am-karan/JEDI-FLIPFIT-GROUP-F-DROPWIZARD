package com.flipkart.app;

/**
 * Hello world!
 *
 */
import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FlipFitApplication extends Application<Configuration> {
    private static final Logger LOGGER = LoggerFactory.getLogger(FlipFitApplication.class);

    @Override
    public void initialize(Bootstrap<Configuration> b) {
    }

    @Override
    public void run(Configuration c, Environment e) throws Exception {
        LOGGER.info("Registering REST resources");

        System.out.println("HERE");
    }

    public static void main(String[] args) throws Exception {
        new FlipFitApplication().run(args);
    }
}