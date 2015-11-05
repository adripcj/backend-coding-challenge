package com.alchemytec.application;

import org.skife.jdbi.v2.DBI;

import com.alchemytec.config.ApplicationConfig;
import com.alchemytec.controllers.ExpenseController;
import com.alchemytec.jdbi.ExpenseDAO;
import com.alchemytec.resources.ExpensesResource;

import io.dropwizard.Application;
import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.jdbi.DBIFactory;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class ExpensesApplication extends Application<ApplicationConfig> {

    public static void main(String[] args) throws Exception {
        new ExpensesApplication().run(args);
    }

    @Override
    public void initialize(Bootstrap<ApplicationConfig> bootstrap) {
        bootstrap.addBundle(new AssetsBundle("/assets", "/", "default.html", "static"));
    }

    @Override
    public void run(ApplicationConfig configuration, Environment environment) {
        final DBIFactory factory = new DBIFactory();
        final DBI jdbi = factory.build(environment, configuration.getDataSourceFactory(), "mysql");
        final ExpenseDAO expenseDao = jdbi.onDemand(ExpenseDAO.class);

        ExpenseController expensesController = new ExpenseController(expenseDao);
        environment.jersey().register(new ExpensesResource(expensesController));
    }

}