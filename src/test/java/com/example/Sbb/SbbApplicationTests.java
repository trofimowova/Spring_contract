package com.example.Sbb;

import com.fasterxml.jackson.annotation.JsonProperty;
import static org.assertj.core.api.Assertions.*;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SbbApplicationTests {



	@BeforeEach
	public void setup() {
		RestAssuredMockMvc.standaloneSetup(new DataController());
	}

	@Test
	public void contextLoads() throws Exception {


	}
}




