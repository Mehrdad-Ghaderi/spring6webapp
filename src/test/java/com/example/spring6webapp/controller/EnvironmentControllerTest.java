package com.example.spring6webapp.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Mehrdad Ghaderi, S&M
 * Date: 2/24/2025
 * Time: 10:29 PM
 */
//@ActiveProfiles("uat")
@SpringBootTest
class EnvironmentControllerTest {

    @Autowired
    EnvironmentController controller;

    @Test
    void getEnvironment() {
        System.out.println(controller.getEnvironment());
    }
}