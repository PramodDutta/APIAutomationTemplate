package com.thetestingacademy.tests.fullcrud;

import com.thetestingacademy.endpoints.APIConstants;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class GETRequestTest {

    @Test
    public void test_get() {
        RequestSpecification r = RestAssured.given(); // Pre script
        r.baseUri(APIConstants.BASE_URL);
        r.basePath(APIConstants.CREATE_GET_POST_URL_BOOKING);
        r.when().get();
        r.then().statusCode(200);

    }
}
