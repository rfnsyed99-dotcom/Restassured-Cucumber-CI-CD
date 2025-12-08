package stepdefinitions;

import base.BaseTest;
import io.cucumber.java.Before;

public class Hooks extends BaseTest {

    @Before
    public void beforeScenario() {
        setup();
    }
}
