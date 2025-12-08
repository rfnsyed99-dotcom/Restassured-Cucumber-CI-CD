package stepdefinitions;

import base.BaseTest;
import io.cucumber.java.en.Given;

import static io.restassured.RestAssured.given;

public class GetUserSteps extends BaseTest {

    @Given("user sends GET request")
    public void user_sends_get_request() {

        TestContext.response =
                given()
                        .spec(TestContext.request)
                        .when()
                        .get("/users");
    }
}
