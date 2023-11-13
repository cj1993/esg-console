package org.example;

import org.example.http.PostClient;
import org.example.model.Customer;
import org.example.parser.CSVParser;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class App  {
    public static void main( String[] args ) {
        Properties prop = new Properties();
        try {
            prop.load(App.class.getClassLoader().getResourceAsStream("app.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        List<Customer> customerData = new CSVParser().init(prop.getProperty("customer.csv.location"));
        new PostClient().post(customerData);
    }
}
