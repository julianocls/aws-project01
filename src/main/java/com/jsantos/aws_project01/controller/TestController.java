package com.jsantos.aws_project01.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/dog")
public class TestController {

    private static final Logger LOG = LoggerFactory.getLogger(TestController.class);

    @GetMapping("/{name}")
    public ResponseEntity<?> getName(@PathVariable String name) {
        LOG.info("Name = {}", name);
        return ResponseEntity.ok("Name: " + name);
    }

}
