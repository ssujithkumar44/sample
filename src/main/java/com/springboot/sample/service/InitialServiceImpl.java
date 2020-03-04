package com.springboot.sample.service;

import org.springframework.stereotype.Service;

@Service
public class InitialServiceImpl implements InitialService {
    @Override
    public String getText() {
        return "Hello World";
    }
}
