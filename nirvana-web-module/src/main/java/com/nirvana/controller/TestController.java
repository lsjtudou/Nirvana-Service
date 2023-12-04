package com.nirvana.controller;

import com.nirvana.entities.TestEntity;
import com.nirvana.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @PostMapping(value = "/testSave")
    public String testSave(@RequestBody TestEntity testEntity) {
        testService.testSave(testEntity);
        return "save successfully";
    }

    @GetMapping(value = "/testFind")
    public List<TestEntity> testFind() {
        return testService.testFind();
    }


}
