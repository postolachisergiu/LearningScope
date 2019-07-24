package com.cucumber.steps;

import com.cucumber.base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends BaseUtil {

    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void initializeTest() {
        System.out.println("Opening the browser: MOCK");

        // passing webdriver instance
        base.stepInfo = "FirefoxDriver";
    }

    @After
    public void tearDownTest(Scenario scenario) {
        if (scenario.isFailed()) {
            // take screenshot
            System.out.println(scenario.getName());
        }
        System.out.println("Closing the browser: MOCK");
    }

}
