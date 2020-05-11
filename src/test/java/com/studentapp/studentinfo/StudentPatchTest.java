package com.studentapp.studentinfo;

import com.studentapp.model.StudentPojo;
import com.studentapp.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

/**
 * Created by Jay
 */
public class StudentPatchTest extends TestBase {


    @Test
    public void updateStudentEmailUseingId(){
        StudentPojo studentPojo = new StudentPojo();
        studentPojo.setEmail("primetestinmg@gmail.com");

        Response response = given()
                .header("Content-Type","application/json")
                .log()
                .body()
                .when()
                .body(studentPojo)
                .patch("/1");
                response.then().statusCode(200);
        System.out.println(response.prettyPrint());
    }
}
