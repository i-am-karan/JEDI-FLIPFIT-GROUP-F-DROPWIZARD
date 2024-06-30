package com.flipkart.app;

/**
 * Hello world!
 *
 */
import com.flipkart.business.FlipFitAdminBusiness;
import com.flipkart.business.interfaces.IFlipFitAdmin;
import com.flipkart.dao.FlipFitAdminDAOImpl;
import com.flipkart.restController.AdminController;
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
        FlipFitAdminDAOImpl flipFitAdminDAO = new FlipFitAdminDAOImpl();
        FlipFitAdminBusiness flipFitAdmin = new FlipFitAdminBusiness(flipFitAdminDAO);
        e.jersey().register(new AdminController(flipFitAdmin));
        System.out.println("HERE");
    }

    public static void main(String[] args) throws Exception {
        new FlipFitApplication().run(args);
    }
}