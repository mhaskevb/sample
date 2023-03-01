package com.sensormatic.sor.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/details")
    public String getUserDetails() {
        return "Successful";
    }
}
