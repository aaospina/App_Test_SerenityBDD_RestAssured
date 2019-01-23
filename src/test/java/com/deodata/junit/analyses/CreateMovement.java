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
import java.util.Map;

@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CreateMovement {

    @Steps
    MovementSerenitySteps steps;

    @Title("This test will create a new movement")
    @Test
    public void test001(){

        ArrayList<Double> entryLine = new ArrayList<>();
        //entryLine.add([0.3, 0.2]);

        //steps.createMovement("directory x")

    }
}
