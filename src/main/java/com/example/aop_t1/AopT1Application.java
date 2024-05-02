package com.example.aop_t1;

import com.example.aop_t1.model.Info;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
@RequiredArgsConstructor
public class AopT1Application {
	private final Info info;

	public static void main(String[] args) {
		SpringApplication.run(AopT1Application.class, args);

	}

	@EventListener(ApplicationReadyEvent.class)
	public void onReady() {
		info.info();
	}


}
