package com.db.tradeprocessing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TradeProcessingApplication {

	public static void main(String[] args) {

		SpringApplication.run(TradeProcessingApplication.class, args);
	}

}
