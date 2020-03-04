package com.springboot.sample.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class InitialServiceTest {
    @InjectMocks
    private InitialService initialService = new InitialServiceImpl();

    @Test
    public void test_getText() {
        String textValue = initialService.getText();
        Assert.assertEquals("Hello World", textValue);

    }
}
