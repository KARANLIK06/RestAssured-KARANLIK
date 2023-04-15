package com.cydeo.day05;

import com.cydeo.utilities.DBUtils;
import com.cydeo.utilities.SpartanTestBase;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static io.restassured.RestAssured.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class SpartanAPIvsDB extends SpartanTestBase {
    @DisplayName("GET one spartan from api and database")
    @Test
    public void testDB1(){

        //get id,name,gender phone  from database
        //get same information from api
        //compare

        //1. get id,name,gender phone  from database
        String query ="select spartan_id, name, gender, phone from SPARTANS\n" +
                "where SPARTAN_ID = 15";

        //save data inside the map
        Map<String, Object> dbMap = DBUtils.getRowMap(query);
        System.out.println(dbMap);

        //2.get info from api
        Map<String,Object> apiMap = given().accept(ContentType.JSON)
                .pathParam("id", 15)
                .when().get("/api/spartans/{id}")
                .then().statusCode(200)
                .and().contentType("application/json")
                .extract().response().as(Map.class);

        System.out.println(apiMap);


    }
}
