package com.example.Sbb;


import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;

public class BaseTestClass {

    @Before
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(new DataController());
    }
}
