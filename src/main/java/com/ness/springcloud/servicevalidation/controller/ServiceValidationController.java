package com.ness.springcloud.servicevalidation.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ServiceValidationController {

    @Value("${itemValidation: Default validation}")
    private String itemValidation;

    @GetMapping(value = "/item/validation")
    public String getValidation(){
        return itemValidation;
    }

}
