package sts;


import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/**
 * Created by daire3 on 6/7/17.
 */
public class SenatorApplication extends Application<SenatorConfiguration> {
    public static void main(String[] args) throws Exception {
        new SenatorApplication().run(args);
    }

    @Override
    public String getName() {
        return "hello-world";
    }

    @Override
    public void initialize(Bootstrap<SenatorConfiguration> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(SenatorConfiguration configuration, Environment environment) {
        final SenatorResource resource = new SenatorResource(
                configuration.getTemplate(),
                configuration.getDefaultName()
        );
        environment.jersey().register(resource);
    }
}
