package com.iwill.eventBus.configuration;

import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.EventBus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.*;

@Configuration
public class ConfigBean {

    @Bean
    public EventBus executorService() {
        BlockingQueue<Runnable> workQueue = new LinkedBlockingQueue<>(20);
        ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 20,
                30, TimeUnit.SECONDS, workQueue);
        return new AsyncEventBus(executor);
    }
}
