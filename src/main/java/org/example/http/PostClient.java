package org.example.http;

import com.google.gson.Gson;
import org.apache.http.HttpEntity;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.example.model.Customer;

import java.io.IOException;
import java.util.List;

public class PostClient {
    public void post(List<Customer> customerData) {
        String customerJson = new Gson().toJson(customerData);

        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpPost request = new HttpPost("http://localhost:8080/customers");
        HttpEntity stringEntity = new StringEntity(customerJson, ContentType.APPLICATION_JSON);
        request.setEntity(stringEntity);

        try {
            httpClient.execute(request);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
