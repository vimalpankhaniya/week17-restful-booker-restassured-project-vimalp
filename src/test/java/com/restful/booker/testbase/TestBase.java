package com.restful.booker.testbase;

import io.restassured.RestAssured;
import org.junit.BeforeClass;

/**
 * Created by Jay Vaghani
 */
public class TestBase {

    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI = "https://restful-booker.herokuapp.com/apidoc/index.html";
        RestAssured.port = 8080;

      //  RestAssured.basePath = "/student";
    }
}
