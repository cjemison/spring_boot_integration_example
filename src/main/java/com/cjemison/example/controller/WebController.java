package com.cjemison.example.controller;

import com.cjemison.example.service.JobLauncher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * Created by cjemison on 1/24/16.
 */
@RestController
public class WebController {
    private Logger logger = LoggerFactory.getLogger(WebController.class);
    @Autowired
    private JobLauncher jobLauncher;

    @RequestMapping("/launch")
    public ResponseEntity<?> processRequest() {
        logger.info("Sending....");
        jobLauncher.helloWorld(UUID.randomUUID().toString());
        logger.info("Sent ending....");
        return ResponseEntity.ok("ok");
    }
}
