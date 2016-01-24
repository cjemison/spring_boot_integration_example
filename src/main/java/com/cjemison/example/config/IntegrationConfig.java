package com.cjemison.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by cjemison on 1/24/16.
 */
@Configuration
@ImportResource("classpath:integration.xml")
//@EnableIntegration
public class IntegrationConfig {

    /*@Bean
    @Description("Entry to the messaging system through the gateway.")
    public MessageChannel inputChannel() {
        return new ExecutorChannel(threadPoolTaskExecutor());
    }

    @Bean
    public ThreadPoolTaskExecutor threadPoolTaskExecutor() {
        ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
        threadPoolTaskExecutor.setCorePoolSize(5);
        threadPoolTaskExecutor.setQueueCapacity(400);
        threadPoolTaskExecutor.setMaxPoolSize(10);
        threadPoolTaskExecutor.setWaitForTasksToCompleteOnShutdown(true);
        return threadPoolTaskExecutor;
    }*/
}
