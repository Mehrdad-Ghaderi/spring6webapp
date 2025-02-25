package com.example.spring6webapp.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Mehrdad Ghaderi, S&M
 * Date: 2/24/2025
 * Time: 10:33 PM
 */
@Profile("QA")
@Service
public class EnvironmentServiceQA implements EnvironmentService {
    @Override
    public String getEnv() {
        return "QA";
    }
}
