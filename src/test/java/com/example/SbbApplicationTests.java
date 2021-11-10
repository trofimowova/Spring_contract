package com.example;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SbbApplicationTests {


	@Autowired
	DataController dataController;

	@BeforeEach
	public void setup() {
		RestAssuredMockMvc.standaloneSetup(dataController);
	}



}





