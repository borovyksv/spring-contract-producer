package com.example.contractproducer;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = ContractProducerApplication.class)
public class BaseClass {

    @Autowired
    RepairController repairController;

    @BeforeEach
    void setUp() {
        RestAssuredMockMvc.standaloneSetup(repairController);
    }
}
