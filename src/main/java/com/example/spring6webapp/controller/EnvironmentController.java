package com.example.spring6webapp.controller;

import com.example.spring6webapp.service.EnvironmentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by Mehrdad Ghaderi, S&M
 * Date: 2/24/2025
 * Time: 10:19 PM
 */
@Controller
public class EnvironmentController {

    private final EnvironmentService environmentService;

    public EnvironmentController(@Qualifier("uat") EnvironmentService environmentService) {
        this.environmentService = environmentService;
    }

    public String getEnvironment() {
        return "You are in " + environmentService.getEnv() + " Environment";
    }
}
