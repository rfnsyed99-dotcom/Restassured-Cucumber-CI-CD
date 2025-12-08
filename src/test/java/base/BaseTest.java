package base;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import org.testng.annotations.BeforeClass;
import stepdefinitions.TestContext;

public class BaseTest {

    @BeforeClass
    public void setup() {

        TestContext.request =
                new RequestSpecBuilder()
                        .setBaseUri("https://jsonplaceholder.typicode.com")
                        .setContentType(ContentType.JSON)
                        .build();
    }
}
