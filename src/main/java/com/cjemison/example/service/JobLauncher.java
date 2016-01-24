package com.cjemison.example.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Service;

/**
 * Created by cjemison on 1/24/16.
 */
@Service
@MessageEndpoint
public class JobLauncher {
    private Logger logger = LoggerFactory.getLogger(JobLauncher.class);

    @ServiceActivator(inputChannel = "inputChannel")
    public String helloWorld(String name) {
        logger.info("starting");
        for (int i = 0; i < 1000000; i++) {

            double val = Math.tan(i * 0.5);
            logger.info("Value: " + val);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.info("ending");
        return String.format("Hello %s", name);
    }
}
