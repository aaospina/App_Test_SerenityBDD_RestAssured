package com.deodata.junit.analyses;

import com.deodata.cucumber.serenity.AnalysisSerenitySteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

import java.util.ArrayList;

@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CreateAnalysis {

    @Steps
    AnalysisSerenitySteps steps;

    @Title("This test will create a new analysis")
    @Test
    public void test001(){

        ArrayList<Double> latlng = new ArrayList<>();
        latlng.add(0.5);
        latlng.add(0.2);

        steps.createAnalysis("Estacion 101", latlng, "Aforox", "SIMPLE_VOLUMES")
                .statusCode(201);
    }

}
