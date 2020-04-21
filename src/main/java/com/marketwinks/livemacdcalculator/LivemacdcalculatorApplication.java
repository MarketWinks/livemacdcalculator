package com.marketwinks.livemacdcalculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.marketwinks.livemacdcalculator.repository.UK_LSE_5Mins_LiveMarketMacdRepository;
import com.marketwinks.livemacdcalculator.repository.UK_LSE_5Mins_LiveMarketMacdjsonRepository;
import com.marketwinks.livemacdcalculator.repository.UK_LSE_5Mins_LiveMarketPriceRepository;

@SpringBootApplication
@EnableAutoConfiguration
@EnableWebMvc
@ComponentScan(basePackages = { "com.*" })
@EnableMongoRepositories(basePackages = "com.marketwinks.livemacdcalculator.repository")
@EnableCaching
public class LivemacdcalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(LivemacdcalculatorApplication.class, args);
	}

	@Autowired
	UK_LSE_5Mins_LiveMarketPriceRepository UK_LSE_5Mins_LiveMarketPriceRepository;

	@Autowired
	UK_LSE_5Mins_LiveMarketMacdRepository UK_LSE_5Mins_LiveMarketMacdRepository;

	@Autowired
	UK_LSE_5Mins_LiveMarketMacdjsonRepository UK_LSE_5Mins_LiveMarketMacdjsonRepository;

}
