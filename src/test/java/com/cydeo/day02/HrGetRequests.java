package com.cydeo.day02;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HrGetRequests {

    //BeforeAll is a annotation equals to @BeforeClass in testNg, we use with static method name
    @BeforeAll
    public static void init(){

        RestAssured.baseURI="http://54.145.80.239:1000/ords/hr";

    }

    @DisplayName("GET request to /regions")
    @Test
    public void test1(){
        Response response = RestAssured.get("/regions");

        System.out.println("response.statusCode() = " + response.statusCode());
    }
}
