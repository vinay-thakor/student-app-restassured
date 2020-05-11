package com.studentapp.studentinfo;

import com.studentapp.testbase.TestBase;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/**
 * Created by Jay
 */
public class StudentDeleteTest extends TestBase {

    @Test
    public void deleteAStudentRedcordBy() {
        given()
                //.header("Content-Type","application/json")
                .log()
                .body()
                .when()
                .delete("/1")
                .then().statusCode(204).log().all();


    }

}
