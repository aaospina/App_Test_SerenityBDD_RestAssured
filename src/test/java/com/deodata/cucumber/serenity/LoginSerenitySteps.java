package com.deodata.cucumber.serenity;

import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.util.HashMap;
import java.util.Map;

public class LoginSerenitySteps {

    @Step("Login with email:{0}, password:{1}")
    public ValidatableResponse logIn(String email, String password){
        Map<String, Object> login = new HashMap<>();
        login.put("email", email);
        login.put("password", password);
        System.out.println(login);

        return SerenityRest.rest().given()
                .contentType(ContentType.JSON)
                .when()
                .body(login)
                .post("/v1/login")
                .then();

    }
}
