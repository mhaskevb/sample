package com.sensormatic.shoppertrak.api;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@ResponseBody
public class SampleController {

    @GetMapping("/details")
    public String getUserDetails() {
        return "Successful";
    }
}
