package com.local.cloud.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/version")
    public String getVersion() {
        return "this is version 1.0";
    }
}
