package com.springboot.sample.controller;

import com.springboot.sample.service.InitialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/key")
public class InitialController {
    @Autowired
    InitialService initialService;
    @GetMapping("/getkey")
    public ResponseEntity getAllUserListByConsent() {

        return ResponseEntity.ok().body(initialService.getText());


    }


}
