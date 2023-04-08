package com.cydeo.utilities;

import io.restassured.RestAssured;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import static io.restassured.RestAssured.baseURI;

public class HRTestBase {
    @BeforeAll
    public static void init(){

        // save baseURL inside this variable so that we don't need to type each http method.
        baseURI="http://54.145.80.239:1000/ords/hr";

        //get ip address from configurations
    }
}