package com.cucumber.steps;

import com.cucumber.base.BaseUtil;
import com.cucumber.models.User;
import com.cucumber.transform.CountTransform;
import com.cucumber.transform.EmailTransform;
import cucumber.api.DataTable;
import cucumber.api.Transform;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.List;

public class LoginStep extends BaseUtil {

    private BaseUtil base;

    public LoginStep(BaseUtil base) {
        this.base = base;
    }

    @Given("^I navigate to the login page of the application$")
    public void iNavigateToTheLoginPageOfTheApplication() {
        System.out.println("Navigate \n");
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        System.out.println("Click on login \n");
    }

    @Then("^I should see the userform page$")
    public void iShouldSeeTheUserformPage() {

        System.out.println("The driver is: " + base.stepInfo);
        System.out.println("I should see the the user form page \n");
    }

    @And("^I enter the credentials$")
    public void iEnterTheCredentials(DataTable table) {
        List<List<String>> data = table.raw();

        List<User> users;
        users = table.asList(User.class);

        for (User user : users
        ) {
            System.out.println("The username is:" + user.username + "\n");
            System.out.println("The password is:" + user.password + "\n");
        }
    }

    @And("^I enter the credentials ([^\"]*) and ([^\"]*)$")
    public void iEnterTheCredentialsUsernameAndPassword(String username, String password) {
        System.out.println("The username is:" + username + "\n");
        System.out.println("The password is:" + password + "\n");
    }

    @And("^I enter the users email address as Email:([^\"]*)$")
    public void iEnterTheUsersEmailAddressAsEmailAdmin(@Transform(EmailTransform.class) String email) {
        System.out.println("The email address is: " + email + "\n");
    }

    @And("^I verify the count of my salary digits (\\d+)$")
    public void iVerifyTheCountOfMySalaryDigits(@Transform(CountTransform.class) int digits) {
        System.out.println("Digits count is: " + digits + "\n");
    }

    @And("I would like to see how it looks Cucumber-java(\\d+)$")
    public void iWouldLikeToSeeHowItLooksCucumberJava(int arg0) {
        System.out.println("\n" + arg0);
    }
}
