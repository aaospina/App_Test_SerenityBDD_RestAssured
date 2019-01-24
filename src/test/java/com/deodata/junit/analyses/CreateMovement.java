package com.deodata.junit.analyses;

import com.deodata.cucumber.serenity.MovementSerenitySteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CreateMovement {

    @Steps
    MovementSerenitySteps steps;

    @Title("This test will create a new movement")
    @Test
    public void test001(){

        List<List<Double>> entryLine = new ArrayList<List<Double>>();
        List<List<Double>> exitLine = new ArrayList<List<Double>>();

        entryLine.add(new ArrayList<Double>());
        entryLine.add(new ArrayList<Double>());
        exitLine.add(new ArrayList<Double>());
        exitLine.add(new ArrayList<Double>());
        entryLine.get(0).add(0.7);
        entryLine.get(0).add(0.6);
        entryLine.get(1).add(0.5);
        entryLine.get(1).add(0.4);
        exitLine.get(0).add(0.3);
        exitLine.get(0).add(0.2);
        exitLine.get(1).add(0.2);
        exitLine.get(1).add(0.1);

        System.out.println(entryLine);

        steps.createMovement("directory x", entryLine, exitLine, "mov11", 0, 200)
                .statusCode(201);

    }
}
