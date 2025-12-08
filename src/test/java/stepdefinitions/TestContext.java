package stepdefinitions;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestContext {
    public static RequestSpecification request;
    public static Response response;
}
