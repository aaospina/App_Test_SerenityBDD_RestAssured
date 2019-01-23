package com.deodata.junit.login;

import com.deodata.cucumber.serenity.LoginSerenitySteps;
import com.deodata.testbase.TestBase;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AuthenticatesAUser extends TestBase {

    @Steps
    LoginSerenitySteps steps;

    @Title("This test will login successfully")
    @Test
    public void test001(){

        steps.logIn("a.ospina+client@transportsystems.co", "Ts12345*")
                .statusCode(200);
    }

    @Title("This test is going to fail the login")
    @Test
    public void test002(){

        steps.logIn("a.ospina+client@transportsystems.co", "Ts12345%")
                .statusCode(401);
    }

}
