package com.deodata.testbase;

import io.restassured.RestAssured;
import org.junit.BeforeClass;

public class TestBase {

    @BeforeClass
    public static void init(){
        RestAssured.baseURI = "https://qa-deodata-api.transportsystems.co";
    }
}
