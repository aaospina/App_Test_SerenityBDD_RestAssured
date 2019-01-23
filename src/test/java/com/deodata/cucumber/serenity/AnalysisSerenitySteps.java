package com.deodata.cucumber.serenity;

import com.deodata.model.AnalysisClass;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.util.List;

public class AnalysisSerenitySteps {

    @Step("Create the analysis in the directory: {0}, and the latlng: {1}, and the name: {2}")
    public ValidatableResponse createAnalysis(String directory, List<Double> latlng, String name, String type){

        AnalysisClass analysis = new AnalysisClass();
        analysis.setDirectory(directory);
        analysis.setLatlng(latlng);
        analysis.setName(name);
        analysis.setType(type);

        return SerenityRest.rest().given()
                .header("Authorization", "Bearer " + LoginSerenitySteps.tocken)
                .contentType(ContentType.JSON)
                .when()
                .body(analysis)
                .post("/v1/analyses")
                .then();
    }
}
