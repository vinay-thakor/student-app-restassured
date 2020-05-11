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
public class StudentPostTest extends TestBase {



    @Test
    public void createStudent(){

        List<String> course = new ArrayList<>();
        course.add("Selenium");
        course.add("Java");

        StudentPojo studentPojo = new StudentPojo();
        studentPojo.setFirstName("Prime");
        studentPojo.setLastName("Testing");
        studentPojo.setEmail("abc@gmail.com");
        studentPojo.setProgramme("Automation Testing");
        studentPojo.setCources(course);

        Response response = given()
                .header("Content-Type", "application/json")
                .log().headers()
                .when()
                .body(studentPojo)
                .post();
        response.then().statusCode(200);
        response.prettyPrint();

    }

}
