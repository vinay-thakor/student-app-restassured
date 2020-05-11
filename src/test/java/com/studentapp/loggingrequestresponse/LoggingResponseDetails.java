package com.studentapp.loggingrequestresponse;

import com.studentapp.testbase.TestBase;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/**
 * Created by Jay
 */
public class LoggingResponseDetails extends TestBase {


    /**
     * This test will print out all the Response Headers
     */
    @Test
    public void test001() {
        given()
                .header("Content-Type", "application/json")
                .when()
                .get("/1")
                .then().log().headers()
                .statusCode(200);

    }


    /**
     * This test will print the Response Status Line
     */
    @Test
    public void test002() {
        given()
                .header("Content-Type", "application/json")
                .when()
                .get("/1")
                .then().log().status()
                .statusCode(200);


    }


    /**
     * This test will print the Response Body
     */
    @Test
    public void test003() {
        given()
                .header("Content-Type", "application/json")
                .when()
                .get("/1")
                .then().log().body()
                .statusCode(200);


    }

    /**
     * This test will print the Response in case of an error
     */
    @Test
    public void test004() {
        given()
                .header("Content-Type", "application/json")
                .when()
                .get("/ab")
                .then().log().ifError()
                .statusCode(400);


    }

    //  This test will print out All the details

    @Test
    public void test005() {
        given()
                .header("Content-Type", "application/json")
                .when()
                .get("/1")
                .then().log().all()
                .statusCode(200);


    }

    // This test will print Request details if validation fails
    @Test
    public void test006() {
        given()
                .header("Content-Type", "application/json")
                .when()
                .get("/150")
                .then().log().ifValidationFails()
                .statusCode(402);

    }
}