package com.cjemison.example.controller;

import com.cjemison.example.service.LauncherGateway;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * Created by cjemison on 1/24/16.
 */
@RestController
public class WebController {
    private Logger logger = LoggerFactory.getLogger(WebController.class);
    @Autowired
    private LauncherGateway launcher;

    @RequestMapping("/launch")
    public Future<ResponseEntity<?>> processRequest() throws ExecutionException, InterruptedException {
        logger.info("Sending....");
        Future<String> future = launcher.helloWorld(UUID.randomUUID().toString());
        logger.info("Sent ending....");
        return new AsyncResult<ResponseEntity<?>>(ResponseEntity.ok(future.get()));
    }
}
