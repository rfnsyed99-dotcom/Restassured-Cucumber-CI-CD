package stepdefinitions;

import base.BaseTest;
import io.cucumber.java.en.Given;

import static io.restassured.RestAssured.given;

public class UpdateUserSteps extends BaseTest {

    @Given("user sends PUT request")
    public void user_sends_put_request() {

        String body = "{ \"name\": \"Updated Irfan\" }";

        TestContext.response =
                given()
                        .spec(TestContext.request)
                        .body(body)
                        .when()
                        .put("/users/1");
    }
}
