package com.example.aop_t1.model;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Info {

    public void info() {
        log.info("Метод info");
    }
}
