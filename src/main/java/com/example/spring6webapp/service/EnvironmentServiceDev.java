package com.example.spring6webapp.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Mehrdad Ghaderi, S&M
 * Date: 2/24/2025
 * Time: 10:21 PM
 */

@Profile({"dev", "default"})
@Service("dev")
public class EnvironmentServiceDev implements EnvironmentService {
    @Override
    public String getEnv() {
        return "dev";
    }
}


