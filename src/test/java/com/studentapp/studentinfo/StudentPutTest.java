package com.studentapp.studentinfo;

import com.studentapp.model.StudentPojo;
import com.studentapp.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

/**
 * Created by Jay
 */
public class StudentPutTest extends TestBase {

    @Test
    public void updateStudentRecord() {

        List<String> courses = new ArrayList<>();
        courses.add("Challenging");
        courses.add("Homework");
        courses.add("I dont know why i m doing");

        StudentPojo studentpojo = new StudentPojo();
        studentpojo.setFirstName("veron");
        studentpojo.setLastName("Harper");
        studentpojo.setEmail("postman1234@gmail.com");
        studentpojo.setProgramme("Financial Analysis");
        studentpojo.setCources(courses);

                Response response = given()
                        .header("Content-Type", "application/json")
                        .log()
                        .body()
                        .when()
                        .body(studentpojo)
                        .put("/1");
                        response.then().statusCode(200);
        System.out.println(response.prettyPrint());



    }

}
