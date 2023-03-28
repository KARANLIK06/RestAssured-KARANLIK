package com.cydeo.day01;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

public class SimpleGetRequest {
    String url="http://54.145.80.239:8000/api/spartans";  // firstly, adding url from postman
    @Test
    public void test1(){

        // send a get request and save response inside the Response object
        Response response = RestAssured.get(url);

        // print response status code
        System.out.println("response.statusCode() = " + response.statusCode());

        // print response body
        response.prettyPrint();

    }

}
