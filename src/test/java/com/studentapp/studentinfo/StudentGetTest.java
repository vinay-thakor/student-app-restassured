package com.studentapp.studentinfo;

import com.studentapp.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/**
 * Created by Jay
 */
public class StudentGetTest extends TestBase {


    @Test
    public void getAllStudentsInfo() {
        Response response = given()
                .when()
                .get("/list");
        response.then().statusCode(200);
        System.out.println(response.prettyPrint());
    }

    @Test
    public void searchStudentWithParameter() {
        Response response =given()
                .param("programme", "Computer Science")
                .param("limit", 2)
                .when()
                .get("/list");
        response.then().statusCode(200);
    }

    //Home Work

}
