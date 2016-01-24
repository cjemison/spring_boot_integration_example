package com.cjemison.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.integration.channel.ExecutorChannel;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.messaging.MessageChannel;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * Created by cjemison on 1/24/16.
 */
@Configuration
@EnableIntegration
public class IntegrationConfig {

    @Bean
    @Description("Entry to the messaging system through the gateway.")
    public MessageChannel inputChannel() {
        return new ExecutorChannel(threadPoolTaskExecutor());
    }

    @Bean
    public ThreadPoolTaskExecutor threadPoolTaskExecutor() {
        ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
        threadPoolTaskExecutor.setCorePoolSize(5);
        threadPoolTaskExecutor.setQueueCapacity(400);
        threadPoolTaskExecutor.setMaxPoolSize(100);
        threadPoolTaskExecutor.setWaitForTasksToCompleteOnShutdown(true);
        return threadPoolTaskExecutor;
    }
}
