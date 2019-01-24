package com.deodata.cucumber.serenity;

import com.deodata.model.MovementClass;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.util.List;

public class MovementSerenitySteps {

    @Step("Create a new movement")
    public ValidatableResponse createMovement(String cameraDirectory, List<List<Double>> entryLine, List<List<Double>> exitLine, String name, int snapshotIndex, int analysisId){

        MovementClass movement = new MovementClass();
        movement.setCameraDirectory(cameraDirectory);
        movement.setEntryLine(entryLine);
        movement.setExitLine(exitLine);
        movement.setName(name);
        movement.setSnapshotIndex(snapshotIndex);

        return SerenityRest.rest().given()
                .header("Authorization", "Bearer " + LoginSerenitySteps.tocken)
                .contentType(ContentType.JSON)
                .when()
                .body(movement)
                .post("/v1/analyses/" + analysisId + "/movements")
                .then();
    }
}
