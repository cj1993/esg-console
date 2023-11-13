package org.example.parser;

import com.opencsv.bean.CsvToBeanBuilder;
import org.example.model.Customer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class CSVParser {
    public List<Customer> init(String csvFileLocation) {
        try {
            return new CsvToBeanBuilder<Customer>(new FileReader(csvFileLocation))
                    .withType(Customer.class)
                    .build()
                    .parse();
        } catch (FileNotFoundException e) {
            // Add Logging
            throw new RuntimeException(e);
        }
    }
}
