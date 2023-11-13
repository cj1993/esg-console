package org.example.model;

import com.opencsv.bean.CsvBindByName;

public class Customer {
    @CsvBindByName(column = "Customer Ref")
    private String customerRef;

    @CsvBindByName(column = "Customer Name")
    private String customerName;

    @CsvBindByName(column = "Address Line 1")
    private String addressLine1;

    @CsvBindByName(column = "Address Line 2")
    private String addressLine2;

    @CsvBindByName(column = "Town")
    private String town;

    @CsvBindByName(column = "County")
    private String county;

    @CsvBindByName(column = "Country")
    private String country;

    @CsvBindByName(column = "Postcode")
    private String postcode;

}
