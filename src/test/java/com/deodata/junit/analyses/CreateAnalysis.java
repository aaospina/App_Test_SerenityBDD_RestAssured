package com.deodata.junit.analyses;

import com.deodata.cucumber.serenity.AnalysisSerenitySteps;
import com.deodata.utils.Ramdon;
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

    static int analysisId;
    static String analysisName;
    @Steps
    AnalysisSerenitySteps steps;

    @Title("This test will create a new analysis")
    @Test
    public void test001(){

        ArrayList<Double> latlng = new ArrayList<>();
        latlng.add(0.5);
        latlng.add(0.2);

        analysisName = "Analysis_" + Ramdon.getRandomValue();

        steps.createAnalysis("Estacion_101", latlng, analysisName, "SIMPLE_VOLUMES")
                .statusCode(201);
    }

    @Title("Consult the id of the last analysis created")
    @Test
    public void test002(){
        System.out.println(AnalysisSerenitySteps.getLastAnalysisCreated());
    }

}
