package com.cydeo.day05;

import com.cydeo.utilities.HRTestBase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
public class ORDSHamcrestTest extends HRTestBase {


    @DisplayName("GET request to Employees IT_PROG endpoint and chaining")
    @Test
    public void employeesTest() {


        //send a get request to employees endpoint with query parameter job_id IT_PROG
        //verify each job_id is IT_PROG
        //verify first names are .... (find proper method to check list against list)
        //verify emails without checking order (provide emails in different order,just make sure it has same emails)
        //expected names


    }


}