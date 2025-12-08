package stepdefinitions;

import io.cucumber.java.en.Then;

import static org.testng.Assert.assertEquals;

public class CommonSteps {

    @Then("status code should be {int}")
    public void status_code_should_be(Integer expectedStatus) {

        assertEquals(
                TestContext.response.getStatusCode(),
                expectedStatus
        );
    }
}
