package com.cydeo.day04;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.baseURI;

public class CBTrainingApiWithJsonPath {

    @BeforeAll
    public static void init(){

        // save baseURL inside this variable so that we dont need to type each http method.
        baseURI="http://api.training.cydeo.com";

    }

    @DisplayName("GET request to individual student")
    @Test
    public void test1(){
        //send a get request to student id 66 as a path parameter and accept header application/json
        //verify status code=200 /// content type=application/json;charset=UTF-8 /// transfer-encoding = chunked
        //verify date header exists
        //assert that
            /*
                firstName ali
                batch 2
                section ddddd
                emailAddress glc@gmail.com
                companyName string
                state kkkkk
                zipCode 15
                using JsonPath
             */




    }
}
