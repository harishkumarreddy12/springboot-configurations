package com.javatcup.demo.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
class SampleRestController{
    @Value("${configuration.projectName}")
    String projectName;

    @GetMapping("/project-name")
    public String getProjectName(){
        System.out.println("Response: " + this.projectName);
        return this.projectName;
    }
}
