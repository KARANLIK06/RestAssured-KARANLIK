package com.cydeo.day05;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
public class HamcrestMatchersApiTest {

      /*
       given accept type is Json
       And path param id is 15
       When user sends a get request to spartans/{id}
       Then status code is 200
       And content type is Json
       And json data has following
           "id": 15,
           "name": "Meta",
           "gender": "Female",
           "phone": 1938695106
        */

    @DisplayName("OneSpartan with Hamcrest and chaining")
    @Test
    public void test1(){

        given().accept(ContentType.JSON)
                .and().pathParam("id",15)
                .when().get("http://54.145.80.239:8000/api/spartans/{id}")
                .then()
                .statusCode(200)
                .and().assertThat().contentType("application/json")
                .and()
                .body("id",equalTo(15),
                        "name",is("Meta"),
                        "gender",is("Female"),
                        "phone",is(1938695106));

    }
    @DisplayName("CBTraining Teacher request with chaining and matchers")
    @Test
    public void test2(){
        given().accept(ContentType.JSON)
                .and().pathParam("id",10)
                .when()
                .get("https://api.training.cydeo.com/teacher/{id}")
                .then()
                .statusCode(200)
                .and()
                .contentType("application/json;charset=UTF-8")
                .and()
                .header("server",is("envoy"))
                .and()
                .header("date",notNullValue())
                .and().assertThat()
                .body("teachers[0].firstName", is("Porter"))
                .body("teachers[0].lastName", is("Merbeery"))
                .body("teachers[0].department", equalTo("Computer"));

    }
    @DisplayName("GET request to teacher/all and chaining")
    @Test
    public void teachersTest(){

        //verify Tory,Mario,Valter inside the all teachers
        given()
                .accept(ContentType.JSON)

        .when()
                .get("https://api.training.cydeo.com/teacher/all")
        .then()
                .statusCode(200)
                .and()
                .body("teachers.firstName", hasItems("Tory","Mario","Valter"));

    }


}
