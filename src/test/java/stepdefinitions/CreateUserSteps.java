package stepdefinitions;

import base.BaseTest;
import io.cucumber.java.en.Given;

import static io.restassured.RestAssured.given;

public class CreateUserSteps extends BaseTest {

    @Given("user sends POST request")
    public void user_sends_post_request() {

        String body = "{ \"name\": \"Irfan\", \"email\": \"irfan@test.com\" }";

        TestContext.response =
                given()
                        .spec(TestContext.request)
                        .body(body)
                        .when()
                        .post("/users");
    }
}
