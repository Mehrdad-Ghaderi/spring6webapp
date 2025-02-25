package com.example.spring6webapp;

import com.example.spring6webapp.controller.BookController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Spring6WebappApplicationTests {

	@Autowired
    ApplicationContext applicationContext;

    @Test
    void testGetControllerFromCtx() {
        applicationContext.getBean(BookController.class);
        System.out.println();
    }
    @Test
    void contextLoads() {

    }

}
