package com.demo.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class DemoServiceTest {
    @InjectMocks
    private DemoService demoService;

    @Test
    void doSomething_nullString() {
        Assertions.assertNull(demoService.doSomething(null));
    }

    @Test
    void doSomething_emptyString() {
        final String actualResult = demoService.doSomething("");
        Assertions.assertNotNull(actualResult);
        Assertions.assertEquals("", actualResult);
    }
}
